import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_14 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		// FileWriter.write() : 문자 기반 스트림 - 2byte 단위로 파일에 씀 
		FileWriter fw = new FileWriter("data/data4");
		
		String str;
		while(!(str = sc.nextLine()).equals("")) { // 빈문자열 들어올때까지 입력받음 
			fw.write(str + "\n");
		}
		
		
		fw.close();
		

	}

}

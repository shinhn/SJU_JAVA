import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_14_FileWriter {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 지정한 파일이 FileWriter 형식으로 쓰기 모드로 열림
		FileWriter fw = new FileWriter("data/data4.txt");
		String str;
		
		// 입력한 행이 비어있는 행이 아니면 파일을 씀
		// 문자 없이 enter 키만 누르면 ""만 반환되므로 while이 종료됨
		while (!(str = sc.nextLine()).equals(""))
			fw.write(str + "\r\n");
		fw.close();
	}
}
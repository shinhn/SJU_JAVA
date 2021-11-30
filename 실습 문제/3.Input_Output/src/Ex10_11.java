import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_11 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("data/data2"); // FileReader : 문자 기반 스트림 -> 2byte씩 읽음 
		BufferedReader br = new BufferedReader(fr); // BufferedReader.readLine() : 파일을 행 단위로 읽음 
		
		String str;
		int i=1;
		
		while((str = br.readLine()) != null) {
			System.out.println(i + "행 : " + str);
			i++;
		}
		
		br.close();
		fr.close();
	}

}

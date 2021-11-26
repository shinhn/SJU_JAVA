import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_11 {
	public static void main(String[] args) throws Exception {
		// FileReader 클래스(문자 단위, 2byte씩 읽음)로 파일 열기
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		// 파일을 행단위로 읽기 위해 BufferedReader 클래스 사용
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;
		int i = 1;    // 파일의 행을 저장할 변수

		// 파일의 끝(EOF)이라면 null을 반환
		while ((str = bReader.readLine()) != null) {
			
			System.out.print(i+"행 : ");
			System.out.println(str);
			i++;
		}
		
		// 파일 닫기
		bReader.close();
		fReader.close();
	}
}
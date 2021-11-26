import java.io.FileInputStream;

public class Ex10_09 {
	public static void main(String[] args) throws Exception {
		// FileInputStream을 준비하고 파일 열기
		//FileInputStream fis = new FileInputStream("c:/temp/data1.txt");  // 절대경로
		FileInputStream fis = new FileInputStream("data/data1.txt");  // 상대경로 처리
		int ch;
		// 파일에서 문자 하나를 read( )로 1 byte씩 읽음. 파일의 끝일 경우 -1을 반환함
		// 한글은 2byte로 표현되므로 깨짐
		while ((ch = fis.read()) != -1)
			System.out.print((char) ch);
		// 파일 닫기
		fis.close();

	}
}
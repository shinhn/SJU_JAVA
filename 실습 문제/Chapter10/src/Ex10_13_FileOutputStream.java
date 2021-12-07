import java.io.FileOutputStream;

public class Ex10_13_FileOutputStream {
	public static void main(String[] args) throws Exception {
		// 파일을 저장하기 위해 FileOutputStream을 생성함
		// 지정한 파일이 쓰기 모드로 열림
		//FileOutputStream fos = new FileOutputStream("C:/temp/data3.txt");
		FileOutputStream fos = new FileOutputStream("data/data3.txt");
		int ch;
		// enter (아스키 코드값 : 13)를 입력할 때까지 키보드 입력 받음
		while ((ch = System.in.read()) != 13)
			// 읽어온 문자를 byte형으로 변환해서 파일에 씀
			fos.write((byte) ch);

		fos.close(); // 파일 닫기
	}
	
	
	
}
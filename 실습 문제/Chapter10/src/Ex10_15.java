import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_15 {
	public static void main(String[] args) throws Exception {
		// 바이트 기반의 입출력 스트림
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("data/data5.txt");
		int ch;

		while ((ch = fis.read()) != -1)	// 파일의 끝까지 1 byte씩 읽음
			// 읽어온 1 byte를 byte 형식으로 파일에 씀
			fos.write((byte) ch);  			    	

		System.out.println("복사 완료");
		fis.close();
		fos.close();
	}
}
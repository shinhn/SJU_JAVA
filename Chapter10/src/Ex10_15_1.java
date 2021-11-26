import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex10_15_1 {
	public static void main(String[] args) throws Exception {
		// 입출력 파일명 입력받음
		Scanner s = new Scanner(System.in);  
		String inputFileName = s.nextLine();
		String outputFileName = s.nextLine();
		// 바이트 기반의 입출력 스트림
		FileInputStream fis = new FileInputStream(inputFileName);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		int ch;

		while ((ch = fis.read()) != -1)	// 파일의 끝까지 1 byte씩 읽음
			// 읽어온 1 byte를 byte 형식으로 파일에 씀
			fos.write((byte) ch);  			    	

		System.out.println("복사 완료");
		fis.close();
		fos.close();
	}
}
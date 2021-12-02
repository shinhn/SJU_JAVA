import java.io.FileInputStream;
import java.io.FileReader;

public class Ex10_09 {

	public static void main(String[] args) throws Exception {
		
		// 파일 입출력 시, main에 throws Exception 처리 해줘야 함 
		
		
		// FileInputStream : 바이트 기반 스트림 - 1byte씩 읽음 - 한글은 깨짐
		FileInputStream fis = new FileInputStream("data/data1.txt");
		
		int ch;
		while((ch=fis.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fis.close(); 
		
		
		
		
		
		
		
		System.out.println();
		// 해결 방법
		// 바이트로 읽은 문자를 배열에 저장하고, 배열을 문자열로 한번에 출력 
		
		FileInputStream fis2 = new FileInputStream("data/data1.txt");
		byte[] bt = new byte[1024];
		
		int ch2, i=0;
		while((ch2=fis2.read()) != -1) {
			bt[i] = (byte)ch2;
			i++;
		}
		
		System.out.println(new String(bt));
		
		fis.close();

	}

}

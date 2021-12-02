import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_13 {

	public static void main(String[] args) throws Exception {
		
		// FileOutputStream.write() : 1byte 단위로 파일에 쓰지만 순차적으로 쓰므로 한글이 인식
		FileOutputStream fo = new FileOutputStream("data/data4");
		
		int ch;
		while((ch = System.in.read()) != 13) { // enter(아스키코드 13)을 입력할 때까지 키보드입력 받음 
			fo.write((byte)ch);
		}
		
		fo.close();
	
	
	}

}

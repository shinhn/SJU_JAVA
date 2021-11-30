import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_15 {

	public static void main(String[] args) throws Exception {
		
		// 파일복사 : (바이트 기반 스트림) FileInputStream, FileOutputStream 사용 
		
		/* 방법 2 
		 * 파일 명을 입력받아 파일복사 
		 * Scanner s = new Scanner(System.in);
		 * String inputFileName = s.nextLine();
		 * String outputFileName = s.nextLine();
		 * 
		 * FileInputStream fi = new FileInputStream(inputFileName);
		 * FileOutputStream fo = new FileOutputStream(outputFileName);
		 * 
		 * 
		 * 방법 3
		 * 입출력 파일을 paraneter(args)로 받아서 처리 
		 * run configuration -> arguments -> data/data3 data/data4 등록 
		 * */
		
		
		// 방법 1 
		FileInputStream fi = new FileInputStream("data/data3");
		FileOutputStream fo = new FileOutputStream("data/data4");
		
		int ch;
		while((ch = fi.read()) != -1)
		{
			fo.write((byte)ch);
		}
		
		fi.close();
		fo.close();

	}

}

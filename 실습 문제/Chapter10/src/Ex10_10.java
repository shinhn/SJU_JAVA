import java.io.FileInputStream;

public class Ex10_10 {
	public static void main(String[] args) throws Exception {
		//FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
		FileInputStream fis = new FileInputStream("data/data1.txt");
		int ch;
		byte[] bt = new byte[1024];  // 1024 크기의 byte형 배열을 선언

		int i = 0;
		// 파일에서 문자 하나를 read( )로 읽어옴. 1 byte씩 읽음
		// 파일의 끝(EOF)이면 -1을 반환함
		while ((ch = fis.read()) != -1) {
			bt[i] = (byte) ch;  // 읽어온 1 byte를 배열에 저장
			i++;
		}
		// byte 형식의 배열을 String으로 출력
		System.out.print(new String(bt));
		fis.close();
	}
}
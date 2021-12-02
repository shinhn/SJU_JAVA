import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String in, out;
		
		System.out.print("입력파일 :");
		in = sc.nextLine();
		System.out.print("출력파일 :");
		out = sc.nextLine();
		
		FileInputStream fis = new FileInputStream(in);
		FileOutputStream fos = new FileOutputStream(out);
		int ch;

		while ((ch = fis.read()) != -1)
			fos.write((byte) ch);

		System.out.println("복사 완료");
		fis.close();
		fis.close();
	}
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex10_15_1 {
	public static void main(String[] args) throws Exception {
		// ����� ���ϸ� �Է¹���
		Scanner s = new Scanner(System.in);  
		String inputFileName = s.nextLine();
		String outputFileName = s.nextLine();
		// ����Ʈ ����� ����� ��Ʈ��
		FileInputStream fis = new FileInputStream(inputFileName);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		int ch;

		while ((ch = fis.read()) != -1)	// ������ ������ 1 byte�� ����
			// �о�� 1 byte�� byte �������� ���Ͽ� ��
			fos.write((byte) ch);  			    	

		System.out.println("���� �Ϸ�");
		fis.close();
		fos.close();
	}
}
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_15 {
	public static void main(String[] args) throws Exception {
		// ����Ʈ ����� ����� ��Ʈ��
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("data/data5.txt");
		int ch;

		while ((ch = fis.read()) != -1)	// ������ ������ 1 byte�� ����
			// �о�� 1 byte�� byte �������� ���Ͽ� ��
			fos.write((byte) ch);  			    	

		System.out.println("���� �Ϸ�");
		fis.close();
		fos.close();
	}
}
import java.io.FileOutputStream;

public class Ex10_13_FileOutputStream {
	public static void main(String[] args) throws Exception {
		// ������ �����ϱ� ���� FileOutputStream�� ������
		// ������ ������ ���� ���� ����
		//FileOutputStream fos = new FileOutputStream("C:/temp/data3.txt");
		FileOutputStream fos = new FileOutputStream("data/data3.txt");
		int ch;
		// enter (�ƽ�Ű �ڵ尪 : 13)�� �Է��� ������ Ű���� �Է� ����
		while ((ch = System.in.read()) != 13)
			// �о�� ���ڸ� byte������ ��ȯ�ؼ� ���Ͽ� ��
			fos.write((byte) ch);

		fos.close(); // ���� �ݱ�
	}
	
	
	
}
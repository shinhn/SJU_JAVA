import java.io.FileInputStream;

public class Ex10_10 {
	public static void main(String[] args) throws Exception {
		//FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
		FileInputStream fis = new FileInputStream("data/data1.txt");
		int ch;
		byte[] bt = new byte[1024];  // 1024 ũ���� byte�� �迭�� ����

		int i = 0;
		// ���Ͽ��� ���� �ϳ��� read( )�� �о��. 1 byte�� ����
		// ������ ��(EOF)�̸� -1�� ��ȯ��
		while ((ch = fis.read()) != -1) {
			bt[i] = (byte) ch;  // �о�� 1 byte�� �迭�� ����
			i++;
		}
		// byte ������ �迭�� String���� ���
		System.out.print(new String(bt));
		fis.close();
	}
}
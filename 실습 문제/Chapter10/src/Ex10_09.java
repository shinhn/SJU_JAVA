import java.io.FileInputStream;

public class Ex10_09 {
	public static void main(String[] args) throws Exception {
		// FileInputStream�� �غ��ϰ� ���� ����
		//FileInputStream fis = new FileInputStream("c:/temp/data1.txt");  // ������
		FileInputStream fis = new FileInputStream("data/data1.txt");  // ����� ó��
		int ch;
		// ���Ͽ��� ���� �ϳ��� read( )�� 1 byte�� ����. ������ ���� ��� -1�� ��ȯ��
		// �ѱ��� 2byte�� ǥ���ǹǷ� ����
		while ((ch = fis.read()) != -1)
			System.out.print((char) ch);
		// ���� �ݱ�
		fis.close();

	}
}
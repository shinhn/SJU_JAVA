import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_11 {
	public static void main(String[] args) throws Exception {
		// FileReader Ŭ����(���� ����, 2byte�� ����)�� ���� ����
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		// ������ ������� �б� ���� BufferedReader Ŭ���� ���
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;
		int i = 1;    // ������ ���� ������ ����

		// ������ ��(EOF)�̶�� null�� ��ȯ
		while ((str = bReader.readLine()) != null) {
			
			System.out.print(i+"�� : ");
			System.out.println(str);
			i++;
		}
		
		// ���� �ݱ�
		bReader.close();
		fReader.close();
	}
}
import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_14_FileWriter {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// ������ ������ FileWriter �������� ���� ���� ����
		FileWriter fw = new FileWriter("data/data4.txt");
		String str;
		
		// �Է��� ���� ����ִ� ���� �ƴϸ� ������ ��
		// ���� ���� enter Ű�� ������ ""�� ��ȯ�ǹǷ� while�� �����
		while (!(str = sc.nextLine()).equals(""))
			fw.write(str + "\r\n");
		fw.close();
	}
}
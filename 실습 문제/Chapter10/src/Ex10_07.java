import java.util.Scanner;

public class Ex10_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1, str2, str3;

		System.out.print("�ܾ� 3�� �Է�  : ");
		// ���ۿ��� 3���� �ܾ �о� �� ������ ������
		str1 = s.next();
		str2 = s.next();
		str3 = s.next();

		System.out.print("�Էµ� ���ڿ� ==> ");
		System.out.print(str1 + "," + str2 + "," + str3);
	}
}
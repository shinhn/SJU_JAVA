import java.util.Scanner;

public class Ex09_02_charAt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;

		System.out.print("���ڿ� �Է� ==> ");
		str = s.nextLine();

		System.out.print("��� ���ڿ� ==> ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));
		}
		
		s.close();
	}
}

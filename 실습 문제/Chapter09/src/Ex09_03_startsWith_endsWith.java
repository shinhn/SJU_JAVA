import java.util.Scanner;

public class Ex09_03_startsWith_endsWith {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;

		System.out.print("���ڿ� �Է� ==> ");
		str = s.nextLine();

		System.out.print("��� ���ڿ� ==> ");

		if (!str.startsWith("("))
			System.out.printf("(");

		for (int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));

		if (!str.endsWith(")"))
			System.out.printf(")");
		
		s.close();
	}
}

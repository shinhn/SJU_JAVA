import java.util.Scanner;

public class Problem_24_lower_upper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in, out = "";
		char ch;
		int count, i;
		int diff = 'a' - 'A';

		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		in = s.nextLine();

		count = in.length();

		for (i = 0; i < count; i++) {
			ch = in.charAt(i);
			if (('A' <= ch) && (ch <= 'Z'))
				out += (char) (ch + diff);
			else if (('a' <= ch) && (ch <= 'z'))
				out += (char) (ch - diff);
			else
				out += (char) ch;
		}

		System.out.printf("��ȯ�� ���ڿ� ==> %s \n", out);
		
		s.close();
	}
}

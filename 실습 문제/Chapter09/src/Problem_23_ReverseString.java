import java.util.Scanner;

public class Problem_23_ReverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ss;
		String tt = "";
		int count, i;

		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		ss = s.nextLine();

		count = ss.length();

		for (i = 0; i < count; i++) {
			tt += ss.charAt(count - (i + 1));
		}

		System.out.printf("������ �Ųٷ� ��� ==> %s \n", tt);
		
		s.close();
	}
}

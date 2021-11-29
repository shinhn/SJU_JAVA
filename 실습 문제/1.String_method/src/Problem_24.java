import java.util.Scanner;

public class Problem_24 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String str = s.nextLine();

		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ans += (char) (str.charAt(i) - ('a' - 'A'));
			}
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ans += (char) (str.charAt(i) + ('a' - 'A'));
			}
		}

		System.out.println("변환된 문자열 ==> " + ans);

	}

}

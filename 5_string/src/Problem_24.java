import java.util.Scanner;

public class Problem_24 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("문자열을 입력하세요:");
		String str = s.nextLine();

		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				str2 += (char) (str.charAt(i) + ('A' - 'a'));
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				str2 += (char) (str.charAt(i) - ('A' - 'a'));
			} else {
				str2 += str.charAt(i);
			}
		}

		System.out.print("변환된 문자열 ==> " + str2);

	}

}

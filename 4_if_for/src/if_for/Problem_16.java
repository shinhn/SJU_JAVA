package if_for;

import java.util.Scanner;

public class Problem_16 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("글자를 입력 : ");
		String str = s.nextLine();

		System.out.print("입력된 문자열 : ");
		System.out.println(str);

		System.out.print("변환된 문자열 : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}

package if_for;

import java.util.Scanner;

public class Problem_19 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 여러 개 입력 : ");
		String str = s.nextLine();

		for (int i = 0; i <= str.length() - 1; i++) {
//			System.out.println((int)str.charAt(i) - ('5'-5));

			for (int j = 0; j < (int) str.charAt(i) - ('5' - 5); j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}

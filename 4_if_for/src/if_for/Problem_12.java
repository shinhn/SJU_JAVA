package if_for;

import java.util.Scanner;

public class Problem_12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = s.nextInt();

		System.out.print("계산할 연산자를 입력하세요 : ");
		char op = s.next().charAt(0); // 문자 하나 입력받음

		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = s.nextInt();

		if (op == '+') {
			System.out.printf("%d + %d = %d 입니다.", num1, num2, num1 + num2);
		} else if (op == '-') {
			System.out.printf("%d - %d = %d 입니다.", num1, num2, num1 - num2);
		} else if (op == '*') {
			System.out.printf("%d * %d = %d 입니다.", num1, num2, num1 * num2);
		} else if (op == '/') {
			System.out.printf("%d / %d = %f 입니다.", num1, num2, num1 / (float) num2);
		} else if (op == '%') {
			System.out.printf("%d %% %d = %d 입니다.", num1, num2, num1 % num2);
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}

	}

}

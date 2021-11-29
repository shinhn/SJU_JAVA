package if_for;

import java.util.Scanner;

public class Problem_13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] str;

		System.out.print("수식을 한줄로 띄어 입력하세요 : ");
		str = s.nextLine().split(" "); // 줄 하나 입력받아, " "로 구분하여 문자열 배열에 넣어줌

		int num1 = Integer.parseInt(str[0]); // 정수로 변환
		char op = str[1].charAt(0);
		int num2 = Integer.parseInt(str[2]);

		switch (op) {
		case '+': {
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			break;
		}
		case '-': {
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			break;
		}
		case '*': {
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			break;
		}
		case '/': {
			System.out.printf("%d / %d = %f", num1, num2, num1 / (float) num2);
			break;
		}
		case '%': {
			System.out.printf("%d %% %d = %d", num1, num2, num1 % num2);
			break;
		}
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}

	}

}

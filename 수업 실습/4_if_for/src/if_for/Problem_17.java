package if_for;

import java.util.Scanner;

public class Problem_17 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("합계의 시작값 : ");
		int num1 = s.nextInt();

		System.out.print("합계의 끝값 : ");
		int num2 = s.nextInt();

		System.out.print("배수 : ");
		int basu = s.nextInt();

		int ans = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % basu == 0) {
				ans += i;
			}
		}

		System.out.printf("%d부터 %d까지의 %d배수의 합계 : %d", num1, num2, basu, ans);
	}

}

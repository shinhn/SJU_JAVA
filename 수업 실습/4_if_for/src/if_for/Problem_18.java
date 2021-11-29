package if_for;

import java.util.Scanner;

public class Problem_18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("문자열을 입력 : ");
		String str = s.nextLine();

		int upper_cnt = 0;
		int lower_cnt = 0;
		int digit_cnt = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				upper_cnt++;
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				lower_cnt++;
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				digit_cnt++;
		}

		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개", upper_cnt, lower_cnt, digit_cnt);

	}

}

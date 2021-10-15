package if_for;

public class Problem_15 {

	public static void main(String[] args) {

		for (int i = 0; i <= 127; i++) {
			if (i % 16 == 0) // 16개씩 마다 title 출력
			{
				System.out.println("----------------------------");
				System.out.println("10진수        16진수       문자");
				System.out.println("----------------------------");
			}
			System.out.printf("%8d %8x %8c\n", i, i, i);
		}

	}

}

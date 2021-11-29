package if_for;

public class Problem_14 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.printf("#제%d단# ", i);
		}
		System.out.println();
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%2dX%2d=%2d", j, i, i * j);
			}
			System.out.println();
		}

	}

}

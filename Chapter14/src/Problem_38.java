public class Problem_38 {
	public static void main(String[] args) {

		Integer s[] = { 9, 3, 7, 2, 5 };
		Integer maxVal, minVal;
		int i, k;

		System.out.print("���� �� ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");

		// ��� ���� 2���� ���Ͽ� ���� ū���� �� �ڷ� ������
		for (i = 0; i < 4; i++)
			for (k = 0; k < 4 - i; k++) {
				if (s[k] > s[k + 1]) {
					maxVal = Math.max(s[k], s[k + 1]);
					minVal = Math.min(s[k], s[k + 1]);
					s[k] = minVal;
					s[k + 1] = maxVal;
				}
			}

		System.out.print("\n���� �� ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");
	}
}







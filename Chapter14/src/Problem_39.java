public class Problem_39 {
	public static void main(String[] args) {

		Integer s[] = { 2, 3, 5, 7, 9 };
		Integer maxVal, minVal;
		int i, k;
		int count = 0;				// ȸ�� ��
		boolean changeYN = false; 	// ���� ��ȯ ���� üũ

		System.out.print("���� �� ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");

		// ���� ��ȯ�Ǿ��ٸ� changeYN�� true�� �����ϰ� ���� ȸ�� ����
		
		for (i = 0; i < 4; i++) {
			count++; // ȸ�� �� ����
			for (k = 0; k < 4 - i; k++) {
				if (s[k] > s[k + 1]) {
					changeYN = true; // ���� ��ȯ��
					maxVal = Math.max(s[k], s[k + 1]);
					minVal = Math.min(s[k], s[k + 1]);
					s[k] = minVal;
					s[k + 1] = maxVal;
				}
			}
			if (changeYN)
				changeYN = false;
			else
				break;
			// ���� ��ȯ���� �ʾҴٸ� �̹� ���ĵǾ� �ִ� ���̹Ƿ� for�� ����
		}

		System.out.print("\n�� ȸ���� : " + count);
		System.out.print("\n���� �� ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");
	}
}




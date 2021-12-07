public class Problem_25_lotto {

	static short getNumber() {
		return (short) (Math.random() * 45 + 1); // 1 ~ 45 ���� �� 
	}

	public static void main(String[] args) {
		short[] lotto = { 0, 0, 0, 0, 0, 0 };
		short i, k, num;
		char dupl = 'N';
	
		System.out.printf("** �ζ� ��÷�� �����մϴ�. ** \n\n");

		for (i = 0; i < 6;) {
			num = getNumber();

			for (k = 0; k < 6; k++)
				if (lotto[k] == num)
					dupl = 'Y';

			if (dupl == 'N')
				lotto[i++] = num;
			else
				dupl = 'N';
		}

		System.out.printf("��÷�� �ζ� ��ȣ ==>  ");
		for (i = 0; i < 6; i++) {
			System.out.printf("%d   ", lotto[i]);
		}
	}
}

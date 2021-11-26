import java.util.Scanner;

public class Problem_26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, result = 0;
		char ch;

		System.out.printf("ù��° ���� �Է��ϼ��� : ");
		a = s.nextInt();

		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		ch = s.next().charAt(0);

		System.out.printf("�ι�° ���� �Է��ϼ��� : ");
		b = s.nextInt();

		try {
			switch (ch) {
			case '+':	result = a + b;		break;
			case '-':	result = a - b;		break;
			case '*':
						if (a == 0 || b == 0)
							throw new Exception("0���� ���ϸ� ������ 0�Դϴ�.");
						result = a * b;		break;
			case '/':
						if (b == 0)
							//throw new Exception("0���� ������ �ȵ˴ϴ�.");
						result = a / b;		break;
			}
			
			if (result < 0)
				throw new Exception("����� �����׿�. �Ф�");
			
			System.out.printf("��� ��==> %d", result);
			
		} catch (Exception e) {
			System.out.print("�߻� ���� ==> ");
			System.out.println(e.getMessage());
		} 
	}

}
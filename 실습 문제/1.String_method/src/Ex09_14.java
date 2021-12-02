import java.util.Scanner;

public class Ex09_14 {
	
	static int calc(int op, int num1, int num2) {
		
		int result;
		
		switch (op) {
		case 1: {
			result = num1 + num2;
			break;
		}
		case 2: {
			result = num1 - num2;
			break;
		}
		case 3: {
			result = num1 * num2;
			break;
		}
		case 4: {
			result = num1 / num2;
			break;
		}
		default:
			result = 0;
			break;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("계산 입력 (1:+, 2:-, 3:*, 4:/) : ");
		int op = s.nextInt();
		
		System.out.print("첫번째 숫자를 입력 : ");
		int num1 = s.nextInt();
		
		System.out.print("두번째 숫자를 입력 : ");
		int num2 = s.nextInt();
		
		System.out.println("계산 결과는 : " + calc(op, num1, num2));

	}

}

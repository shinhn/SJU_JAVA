public class Ex10_04 {
	public static void main(String[] args) {
		int a = 100, b = 0;
		//int a = 0, b = 100;
		int result;
		try {
			
			if (b == 0)
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			result = a / b;

			if (a == 0)
				throw new Exception("a�� 0�� ��쿡�� 0�� ������ 0�Դϴ�.");
		
		} catch (Exception e) {
			System.out.print("�߻� ���� ==> ");
			System.out.println(e.getMessage());
		}
	}
}

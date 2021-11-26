public class Ex10_04 {
	public static void main(String[] args) {
		int a = 100, b = 0;
		//int a = 0, b = 100;
		int result;
		try {
			
			if (b == 0)
				throw new Exception("0으로 나누려고요? 안됩니다.");
			result = a / b;

			if (a == 0)
				throw new Exception("a가 0인 경우에도 0은 나눠도 0입니다.");
		
		} catch (Exception e) {
			System.out.print("발생 오류 ==> ");
			System.out.println(e.getMessage());
		}
	}
}

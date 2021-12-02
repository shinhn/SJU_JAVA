
public class Ex10_02 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		
		try {
			arr[3] = 4; // 이부분에서 먼저 오류가 발생했으므로 "배열 첨자가 배열 크기보다 큼 " 출력 
			arr[2] = 100 / 0; // 여기까지 안넘어옴 
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열 크기보다 큼 ");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류 ");
		} finally { // 무조건 출력 
			System.out.println("이부분은 무조건 출력");
		}
		

	}

}


public class Ex10_01 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			arr[3] = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열 크기보다 큼");
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
	}

}

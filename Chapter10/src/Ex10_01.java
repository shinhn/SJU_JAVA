public class Ex10_01 {
	public static void main(String[] args) {
		int[] aa = new int[3];
		try {
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ�� ~~");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

public class Ex12_12 {
	interface Tank {
		void work();
	}

	public static void main(String[] args) {
		Tank l = new Tank() {
			public void work() {
				System.out.println("��ũ�� ������ �������ϴ�.");
			}
		};
		
		Tank tank1 = l;
		
		tank1.work();
	}
}

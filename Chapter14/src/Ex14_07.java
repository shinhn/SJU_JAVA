public class Ex14_07 {
	public static void main(String[] args) {
		// local inner Ŭ������ main �������� ��� ����
		class Car {
			String carName;

			Car(String carName) {
				this.carName = carName;
			}
			// �ڵ��� �۵� �޼ҵ�
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(10); // 10 �и��� ���� ���� ����
						System.out.println(carName + "~~ �޸��ϴ�.");

					} catch (Exception e) {
					}
				}
			}
		}
		// �ڵ��� �ν��Ͻ� ���� �� run() �޼ҵ� ȣ��
		Car car1 = new Car("$�ڵ���1");
		car1.run();

		Car car2 = new Car("@�ڵ���2");
		car2.run();

		Car car3 = new Car("*�ڵ���3");
		car3.run();
	}
}



public class Ex14_09 {
	public static void main(String[] args) {

		class Car {
			String carName;
		}
		// Java�� ���� ����� �ȵǹǷ� Runnable �������̽��� �̿�
		class Truck extends Car implements Runnable {
			Truck(String carName) {
				this.carName = carName;
			}
			// ������ �ν��Ͻ����� start( ) �޼ҵ带 ȣ���ϸ� run( )�� �����
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(10);
						System.out.println(carName + "~~ �޸��ϴ�.");

					} catch (Exception e) {
					}
				}
			}
		}

		Truck car1 = new Truck("$Ʈ��1");
		Thread  truck1 = new Thread(car1);
		truck1.start();

		Truck car2 = new Truck("@Ʈ��2");
		Thread  truck2 = new Thread(car2);
		truck2.start();

		Truck car3 = new Truck("*Ʈ��3");
		Thread  truck3 = new Thread(car3);
		truck3.start();
	}
}




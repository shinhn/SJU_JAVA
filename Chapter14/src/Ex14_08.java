public class Ex14_08 {
	public static void main(String[] args) {

		class Car extends Thread {
			String carName;

			Car(String carName) {
				this.carName = carName;
			}

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
		Car car1 = new Car("$�ڵ���1");
		car1.start();
		Car car2 = new Car("@�ڵ���2");
		car2.start();
		Car car3 = new Car("*�ڵ���3");
		car3.start();
	}
}



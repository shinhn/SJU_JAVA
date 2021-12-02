public class Ex14_09 {
	public static void main(String[] args) {

		class Car {
			String carName;
		}
		// Java는 다중 상속이 안되므로 Runnable 인터페이스를 이용
		class Truck extends Car implements Runnable {
			Truck(String carName) {
				this.carName = carName;
			}
			// 스레드 인스턴스에서 start( ) 메소드를 호출하면 run( )이 실행됨
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(10);
						System.out.println(carName + "~~ 달립니다.");

					} catch (Exception e) {
					}
				}
			}
		}

		Truck car1 = new Truck("$트럭1");
		Thread  truck1 = new Thread(car1);
		truck1.start();

		Truck car2 = new Truck("@트럭2");
		Thread  truck2 = new Thread(car2);
		truck2.start();

		Truck car3 = new Truck("*트럭3");
		Thread  truck3 = new Thread(car3);
		truck3.start();
	}
}




public class Ex14_07 {
	public static void main(String[] args) {
		// local inner 클래스로 main 내에서만 사용 가능
		class Car {
			String carName;

			Car(String carName) {
				this.carName = carName;
			}
			// 자동차 작동 메소드
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(10); // 10 밀리초 동안 실행 정지
						System.out.println(carName + "~~ 달립니다.");

					} catch (Exception e) {
					}
				}
			}
		}
		// 자동차 인스턴스 생성 후 run() 메소드 호출
		Car car1 = new Car("$자동차1");
		car1.run();

		Car car2 = new Car("@자동차2");
		car2.run();

		Car car3 = new Car("*자동차3");
		car3.run();
	}
}



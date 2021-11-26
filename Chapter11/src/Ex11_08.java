/*class Car {
	private String color;
	private int speed;
	// 파라메터 개수가 다른, 동일한 이름의 생성자 3개를 만듦 (메소드 오버로딩)
	Car() {
	}

	Car(String color) {
		this.color = color;
	}

	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
}

public class Ex11_08 {
	public static void main(String[] args) {
		// 인스턴스를 만들 때 모두 다른 생성자를 호출함
		Car myCar1 = new Car();
		Car myCar2 = new Car("빨강");
		Car myCar3 = new Car("파랑", 30);

		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");
		System.out.println("자동차3의 색상은 " + myCar3.getColor() + "이며, 현재속도는 " + myCar3.getSpeed() + "km 입니다.");
	}
}

*/
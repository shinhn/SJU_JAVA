class Car{
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
}

public class Ex11_01 {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		myCar1.color = "빨깡";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color = "파랑";
		myCar2.speed = 0;
		
		// 1. 직접 color와 speed 필드에 접근 
		myCar1.upSpeed(30);
		System.out.println("myCar1의 색상은 " + myCar1.color + "이며, " +"myCar1의 속도는 " + myCar1.speed + "km 입니다.");
		
		myCar2.upSpeed(60);
		System.out.println("myCar2의 색상은 " + myCar2.color + "이며, " +"myCar2의 속도는 " + myCar2.speed + "km 입니다.");
		
		System.out.println();
		
		// 2. getColor() 와 getSpeed() 메소드를 호출함으로써 간접적으로 color와 speed 필드에 접근 
		// -> 더 바람직한 방법
		System.out.println("myCar1의 색상은 " + myCar1.getColor() + "이며, " +"myCar1의 속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("myCar2의 색상은 " + myCar2.getColor() + "이며, " +"myCar2의 속도는 " + myCar2.getSpeed() + "km 입니다.");

	}

}

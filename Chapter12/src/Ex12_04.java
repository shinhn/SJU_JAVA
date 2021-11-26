/*class Car {
	private String color;
	int speed;
}

class Sedan extends Car {
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setColor(String color) {
		 this.color = color;
		  // private으로 지정된 필드나 메소드는 
		  // 서브 클래스로 상속되지 않음
	}	
}

public class Ex12_04 {
	public static void main(String[] args) {

		Sedan sedan1 = new Sedan();

		sedan1.setSpeed(300);   // 서브 클래스의 메소드 호출
		System.out.println("승용차 속도 ==> " + sedan1.speed);
		// 상속받은 speed 필드에 직접 접근
	}
}

*/
class Car8{
	int speed = 0;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(슈퍼클래스) : " + this.speed);
	}
	
	// final : 서브 클래스에서 오버라이딩 하지 못하게 함. 슈퍼 클래스에서 정의한 그대로 사용 
	final void downSpeed(int speed) {
		this.speed -= speed;
	}
	
}

class Sedan8 extends Car8{
	// 오버라이딩 
	void upSpeed(int speed) {
		// super : 슈퍼클래스의 메소드를 강제 호출 
		super.upSpeed(speed);
		
		
		
		this.speed += speed;
		
		if(this.speed > 150) {
			this.speed = 150;
		}
		
		System.out.println("현재속도(서브클래스) : " + this.speed);
	}
	
}

class Truck8 extends Car8{
	
}

public class Ex12_06 {

	public static void main(String[] args) {
		
		Truck8 truck = new Truck8();
		Sedan8 sedan = new Sedan8();
		
		System.out.print("트럭 : ");
		truck.upSpeed(200);
		
		System.out.println();
		
	    System.out.print("세단 : ");
		sedan.upSpeed(200);
		

	}

}

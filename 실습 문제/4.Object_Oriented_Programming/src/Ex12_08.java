// abstract <추상 클래스> 
// 인스턴스를 생성할 수 없는 클래스  
abstract class Car9{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
	
	// abstract <추상 메소드> 
	// 본체 코드가 존재하지 않고(껍데기), 상속받은 서브 클래스에서 오버라이딩하여 사용하기 위함 (오버라이딩 안하면 오류) 
	// 추상 메소드가 있는 클래스는 -> 무조건 추상 클래스로 지정해야함 
	abstract void work();
}

class Sedan9 extends Car9{
	void work() {
		System.out.println("오버라이딩");
	}
}


public class Ex12_08 {

	public static void main(String[] args) {
		
		Sedan9 sedan = new Sedan9();
		sedan.work();
	}

}

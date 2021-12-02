
class Car5{
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
}

class Sedan5 extends Car5{
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
}

class Truck5 extends Car5{
	int capacity;
	
	int getCapacity() {
		return capacity;
	}
}

public class Ex12_01 {

	public static void main(String[] args) {
		
		Sedan5 sedan1 = new Sedan5();
		Truck5 truck1 = new Truck5();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("승용차 속도 : " + sedan1.speed + ", 좌석수 : " + sedan1.getSeatNum());
		System.out.println("트럭 속도 : " + truck1.speed + ", 적재량 : " + truck1.getCapacity());
		
	}

}

/*class Car {
	String color;
	int speed;

	void upSpeed(int value) {
		speed = speed + value;
	}

	void downSpeed(int value) {
		speed = speed - value;
	}
}

class Sedan extends Car {
	int seatNum;

	int getSeatNum() {
		return seatNum;
	}
}

class Truck extends Car {
	int capacity;

	int getCapacity() {
		return capacity;
	}
}

public class Ex12_01 {
	public static void main(String[] args) {

		Sedan sedan1 = new Sedan();
		Truck truck1 = new Truck();

		sedan1.upSpeed(300);
		truck1.upSpeed(100);

		sedan1.seatNum = 5;
		truck1.capacity = 50;

		System.out.println("�¿��� �ӵ��� " + sedan1.speed + "km, "
				+ "�¼����� " + sedan1.getSeatNum() + "�� �Դϴ�");
		System.out.println("Ʈ�� �ӵ��� " + truck1.speed + "km, "
				+ "���緮�� " + truck1.getCapacity() + "�� �Դϴ�");
	}
}
*/
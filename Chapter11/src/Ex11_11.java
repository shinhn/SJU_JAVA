class Car {
	String color;
	int speed;
	static private int count = 0;

	Car() {
		count++;
	}

	static int getCount() {
		return count;
	}
}

public class Ex11_11 {
	public static void main(String[] args) {

		System.out.println("���� ����� �ڵ��� ���� ==> " + Car.getCount());

		Car myCar1 = new Car();
		System.out.println("���� ����� �ڵ��� ���� ==> " + myCar1.getCount());
	}
}

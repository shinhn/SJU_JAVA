package pack2;

public class Sedan extends pack1.Car{

	Sedan() {
		System.out.println("��Ű��2�� Sedan �������Դϴ�.");
	}

	public static void main(String[] args) {

		Sedan sedan1 = new Sedan();
		// ���� ��Ű���� Car.CAR_NAME ���
		System.out.println(Car.CAR_NAME);
		// pack1 ��Ű���� Car.CAR_NAME ���
		System.out.println(pack1.Car.CAR_NAME);

	}

}

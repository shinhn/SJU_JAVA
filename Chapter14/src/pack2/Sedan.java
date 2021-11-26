package pack2;

public class Sedan extends pack1.Car{

	Sedan() {
		System.out.println("패키지2의 Sedan 생성자입니다.");
	}

	public static void main(String[] args) {

		Sedan sedan1 = new Sedan();
		// 현재 패키지의 Car.CAR_NAME 출력
		System.out.println(Car.CAR_NAME);
		// pack1 패키지의 Car.CAR_NAME 출력
		System.out.println(pack1.Car.CAR_NAME);

	}

}

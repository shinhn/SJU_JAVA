class Car6{
	Car6(){
		System.out.println("슈퍼 클래스 생성자 호출");
	}
}

class Sedan6 extends Car6{
	Sedan6(){
		System.out.println("서브 클래스 생성자 호출");
	}
}

public class Ex12_02 {

	public static void main(String[] args) {
		
		Sedan6 sedan1 = new Sedan6();

	}

}

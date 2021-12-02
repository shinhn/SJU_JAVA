class Car7{
	// private
	// 슈퍼클래스의 필드나 메소드를 서브 클래스로 상속되지 않게 함 (기본적으로는 전부 상속됨)
	private String color1;
	
	// protected
	// 서브클래스로 상속은 되지만 
	// 자신의 클래스나 패키지 외에는 접근하지 못하도록 설정 
	protected String color2;
	
	Car7(){
		System.out.println("슈퍼 클래스 생성자 1 (파라미터 없음)");
	}
	Car7(String str){
		System.out.println("슈퍼 클래스 생성자 2 (String str)");
	}
}

class Sedan7 extends Car7{
	Sedan7(String str){
		// super
		// 슈퍼 클래스의 Car7(String str)생성자를 강제로 호출 
		// 서브 클래스 생성자 코드 중 첫번째 행에 나와야 함
		super(str); 
		System.out.println("서브 클래스 생성자");
	}
}

public class Ex12_03 {

	public static void main(String[] args) {
		
		Sedan7 sedan = new Sedan7("str");

	}

}

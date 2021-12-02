// interface <인터페이스>
// 추상 클래스와 마찬가지로 직접 인스턴스 생성 불가 
interface Car10{
	// 필드 : static finql(생략가능, 직접 접근이 가능하지만 수정은 불가) 을 붙인 상수화 필드만 사용 가능, 반드시 초기화 해야 함 
	static final int CAR_COUNT = 0;
	
	// 추상 메소드 (메소드가 모두 추상 메소드일때는, abstract 생략가능) 사용 가능 
	abstract void work();
	
	// 추상 클래스와 달리 일반 메소드, 생성자는 사용할 수 없음 
}

class Sedan10 implements Car10{ // 인터페이스는 implements 키워드 사용  
	public void work() { // 인터페이스의 추상 메소드를 완성할 때는 public 키워드 사용 
		System.out.println("오버라이딩 ");
	}
}

public class Ex12_10 {

	public static void main(String[] args) {
		
		Sedan10 sedan = new Sedan10();
		sedan.work();

	}

}

class Car4{
	String color;
	int speed;
	static int count =0; // static -> 클래스 변수 : 클래스 자체에 공간 할당  
	
	Car4(){
		count++;
	}
	
	static int getCount() { // static -> 클래스 메소드 : 인스턴스를 생성하지 않고 메소드 사용 가능 
		return count;
	}
}

public class Ex11_10 {

	public static void main(String[] args) {
		
		Car4 mycar1 = new Car4();
		System.out.println("현재 자동차 숫자 : " + mycar1.count);
		
		Car4 mycar2 = new Car4();
		System.out.println("현재 자동차 숫자 : " + mycar2.count);
		
		Car4 mycar3 = new Car4();
		System.out.println("현재 자동차 숫자 : " + Car4.count);
		
		System.out.println(Car4.getCount());

	}

}

class Pet{
	int age;
		
	public void move() {
		// Problem_32
		// System.out.println("애완동물이 움직입니다.");
		
		// Problem_33
		System.out.println("슈퍼클래스 move() : 애완동물이 움직입니다.");
	}
}
	
class Dog extends Pet{
	String name; // 강아지 이름 
	int weight; // 강아지 무게 
		
	int getWeight() {
		return weight;
	}
}
	
class Bird extends Pet{
	String type; // 새 종류
	boolean flightYN; // 날 수 있는지 여부 
		
	boolean getFlightYN() {
		return flightYN;
	}
	
	// Problem_33 메소드 오버라이딩
	public void move() {
		System.out.println("서브클래스 move() : 새가 날아갑니다.");
	}
}


public class Problem_32 {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.age = 25;
		dog1.name = "누렁이";
		dog1.weight = 10;
		
		Bird bird1 = new Bird();
		bird1.age = 5;
		bird1.type = "앵무새";
		bird1.flightYN = true;
		
		// Problem_32
//		dog1.move();
//		bird1.move();
//		
//		System.out.println("강아지의 이름은 " + dog1.name + "이고, 몸무게는 " + dog1.getWeight() + "kg입니다.");
//		System.out.println("새의 종류는 " + bird1.type + "고, 날 수 " + (bird1.getFlightYN()? "있":"없") + "습니다");
		
		
		// Problem_33
		dog1.move();
		bird1.move();
		

	}

}

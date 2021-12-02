class Car3{
	private String color;
	private int speed;
	
	
	Car3(){
		color = "빨강";
		speed = 0;
	}
	
	Car3(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}


public class Ex11_06 {

	public static void main(String[] args) {
		
		Car3 mycar1 = new Car3();
		Car3 mycar2 = new Car3();
		Car3 mycar3 = new Car3("파랑", 10);
		
		System.out.println("mycar1의 색상 : " + mycar1.getColor() + ", 속도 : " + mycar1.getSpeed());
		System.out.println("mycar2의 색상 : " + mycar2.getColor() + ", 속도 : " + mycar2.getSpeed());
		System.out.println("mycar3의 색상 : " + mycar3.getColor() + ", 속도 : " + mycar3.getSpeed());
	}

}

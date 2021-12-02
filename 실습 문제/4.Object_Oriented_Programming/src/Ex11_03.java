class Car2 {
	private String color;
	private int speed;
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}


public class Ex11_03 {

	public static void main(String[] args) {
		
		Car2 mycar1 = new Car2();
		mycar1.setColor("빨강"); // mycar1.color = "빨강" -> 오류 
		mycar1.setSpeed(30); // mycar1.speed = 30 -> 오류 
		
		System.out.println("mycar1의 색상은 " + mycar1.getColor() + "이며, 속도는 " + mycar1.getSpeed() + "km 이다.");
	}

}

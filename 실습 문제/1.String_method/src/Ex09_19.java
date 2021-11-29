
class myChar{
	char x;
	char y;
}

public class Ex09_19 {

	static void func1(char x, char y) {
		char tmp;
		tmp = x;
		x = y;
		y = tmp;
	}
	
	static void func2(myChar ch) {
		char tmp;
		tmp = ch.x;
		ch.x = ch.y;
		ch.y = tmp;
	}
	
	public static void main(String[] args) {
		
		char x = 'A', y = 'Z';
		System.out.println("원래 값 : " + "x -> " + x + ", y -> " + y);
		func1(x,y);
		System.out.println("값을 전달한 후 : " + "x -> " + x + ", y -> " + y);
		
		
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		func2(ch);
		System.out.println("주소를 전달한 후 : " + "x -> " + ch.x + ", y -> " + ch.y);

	}

}

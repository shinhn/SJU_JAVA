
public class Ex09_15 {

	static int a = 100;
	
	static void func() {
		int a = 200;
		System.out.println("func()에서의 a값 : " + a);
	}
	
	public static void main(String[] args) {
		func();
		System.out.println("main()에서의 a값 : " + a);
	}

}

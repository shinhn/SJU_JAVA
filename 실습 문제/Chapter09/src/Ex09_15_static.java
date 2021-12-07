public class Ex09_15_static {
	static int a = 100; // static은 항상 전역변수 앞에 와야 함 (안쓰면 에러)

	static void func1() {
		int a = 200;
		System.out.printf("func1()에서 a의 값==> %d\n", a);
	}

	public static void main(String[] args) {
		func1();
		System.out.printf("main() 에서 a의 값==> %d\n", a);
	}
}

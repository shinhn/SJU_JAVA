public class Ex09_16_return {

	static void func1() {
		System.out.printf("void �� �޼ҵ�� �����ٰ� ����.\n");
	}

	static int func2() {
		return 100;
	}

	public static void main(String[] args) {
		int a;

		func1();

		a = func2();
		System.out.printf("int �� �޼ҵ忡�� ������ �� ==> %d\n", a);
	}
}

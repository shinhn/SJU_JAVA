public class Ex09_17 {

	static void func1(int a) {
		a = a + 1;
		System.out.printf("���޹��� a ==> %d\n", a);
	}

	public static void main(String[] args) {
		int a = 10;

		func1(a);
		System.out.printf("func1() ���� ���� a ==> %d\n", a);
	}
}

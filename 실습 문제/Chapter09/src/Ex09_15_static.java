public class Ex09_15_static {
	static int a = 100; // static�� �׻� �������� �տ� �;� �� (�Ⱦ��� ����)

	static void func1() {
		int a = 200;
		System.out.printf("func1()���� a�� ��==> %d\n", a);
	}

	public static void main(String[] args) {
		func1();
		System.out.printf("main() ���� a�� ��==> %d\n", a);
	}
}

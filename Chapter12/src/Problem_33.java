class Pet {
	int age; // �ֿϵ��� ������

	public void move() {
		System.out.println("����Ŭ���� move() : �ֿϵ����� �����Դϴ�.");
	}
}

class Dog extends Pet {
}

class Bird extends Pet {
	public void move() {
		System.out.println("����Ŭ���� move() : ���� ���ư��ϴ�.");
	}
}

public class Problem_33 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Bird bird1 = new Bird();

		dog1.move();
		bird1.move();
	}
}


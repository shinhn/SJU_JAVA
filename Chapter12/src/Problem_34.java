interface Mammal  { // ������
	abstract void bear();  // ������ ����
}

abstract class Fish { // ���
	void swim() {
		System.out.println("������ ���ġ�� �����Դϴ�.");
	}
}

class Whale  extends Fish implements Mammal {
	public void bear() {
		System.out.println("���� ������ �����ϴ�.");
	}
}

public class Problem_34 {
	public static void main(String[] args) {
		Whale  whale1 = new Whale();

		whale1.swim();
		whale1.bear();
	}
}

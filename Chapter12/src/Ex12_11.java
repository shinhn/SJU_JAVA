interface Car {
	abstract void work();
}

interface Cannon {
	abstract void fire();
}

class Tank implements Car, Cannon {
	public void work() {
		System.out.println("��ũ�� ������ �������ϴ�.");
	}

	public void fire() {
		System.out.println("��ũ���� ������ �߻��մϴ�.");
	}
}

public class Ex12_11 {
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		tank1.work();
		tank1.fire();
	}
}

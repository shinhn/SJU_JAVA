/*class Pet {
	int age; // �ֿϵ��� ������

	public void move() {
		System.out.println("�ֿϵ����� �����Դϴ�.");
	}
}

class Dog extends Pet {
	String name; // ������ �̸�
	int weight; // ������ ����

	int getWeight() {
		return weight;
	}
}

class Bird extends Pet {
	String type; // �� ����
	boolean flightYN; // ���� �ִ��� ����

	boolean getFlight() {
		return flightYN;
	}
}

public class Problem_32 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age = 25;
		dog1.name = "������";
		dog1.weight = 10;

		Bird bird1 = new Bird();
		bird1.age = 5;
		bird1.type = "�޹���";
		bird1.flightYN = true;

		dog1.move();
		bird1.move();

		System.out.println("�������� �̸��� " + dog1.name + "��, �����Դ� " + dog1.getWeight() + "Kg�Դϴ�.");
		System.out.println("���� ������ " + bird1.type + "��, �� �� " + (bird1.getFlight() ? "��" : "��") + "���ϴ�");
	}
}

*/
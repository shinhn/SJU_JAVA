class Pet {
	private String type; // �ֿϵ��� ����
	private int age; // �ֿϵ��� ������
	static int count = 0; // �ֿϵ��� ��

	Pet(String type, int age) {
		this.type = type;
		this.age = age;
	}

	static int getCount() {
		return count;
	}

	public void move() {
		System.out.println(this.type + "�� �����Դϴ�.");
	}

	public String getType() {
		return this.type;
	}

	public int getAge() {
		return this.age;
	}
}

public class Problem_31 {

	public static void main(String[] args) {
		Pet pet1 = new Pet("������", 8);
		Pet.count++;
		Pet pet2 = new Pet("�����", 13);
		Pet.count++;

		pet1.move();
		pet2.move();

		System.out.println(pet1.getType() + "�� " + pet1.getAge() + "�����Դϴ�.");
		System.out.println(pet2.getType() + "�� " + pet2.getAge() + "�����Դϴ�.");
		System.out.println("���� �츮�� �ֿϵ��� ���� " + Pet.getCount() + "�����Դϴ�.");
	}
}

public class Ex09_06_toUpperCase_toLowerCase_trim {
	public static void main(String[] args) {
		String str = "   �ѱ�   ABCD  efgh  ";

		System.out.println("�� ���ڿ� ==> [" + str + "]");
		System.out.println("�빮�ڷ�  ==> [" + str.toUpperCase() + "]");
		System.out.println("�ҹ��ڷ�  ==> [" + str.toLowerCase() + "]");
		System.out.println("��������  ==> [" + str.trim() + "]");
	}
}

import java.io.IOException;

public class Ex10_08 {
	public static void main(String[] args) {
		String userName = "hanbit";
		String input = "";
		int key;

		// System.in.read() �޼ҵ�� try ~ catch ������ ������ ��
		try {
			System.out.print("�̸� ==> ");
			
			// Ű���� �Է��� �޾� �� ���ڸ� key�� ������
			// enter(�ƽ�Ű�ڵ� : 13)�� ���ö����� ���� �ݺ� 
			while ((key = System.in.read()) != 13) {
				// �Է��� ������ key�� ���ڿ��� �����Ͽ� input�� ����
				// ���ڴ� �Է��ص� ���� ���� �ʰ� ��
				if(key >= 48 && key <= 59){
				} else{
					input += Character.toString((char)key);
				}
			}
			if (userName.equals(input))
				System.out.println(input + "�� ������� ~~");
			else
				System.out.println(input + "�� ����� �ȵǾ����ϴ� ~~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
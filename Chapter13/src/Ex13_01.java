import javax.swing.JFrame;

public class Ex13_01 {
	//JFrame�� ��ӹ޴� MyGUI Ŭ���� ����
	static class MyGUI extends JFrame {
		
		// MyGUI ������
		MyGUI() {
			
			// ������ ������ ���� X��ư�� ������ ���α׷��� ����ǰ� ��
			// �����ϸ� ������� ������� ���α׷��� ������� ����
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// ������ ������ �����. ���� ����
			setTitle("GUI ����");

			// �� �κп� ��ư, ���̺�, üũ�ڽ� ���� �ڵ���

			setSize(500, 500);  // ������ ũ�⸦ �ȼ��� ����
			setVisible(true);	// �����찡 ȭ�鿡 ���̰� ��
		}
	}

	public static void main(String[] args) {
		// main �޼ҵ忡�� MyGUI Ŭ������ ������
		new MyGUI();
	}
}

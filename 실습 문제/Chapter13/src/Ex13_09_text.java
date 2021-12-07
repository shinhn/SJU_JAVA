import java.awt.*;
import javax.swing.*;

public class Ex13_09_text {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 3");
			// ������ ���̾ƿ��� FlowLayout���� ����
			this.setLayout(new FlowLayout());
			// �� ���� ���ڿ��� �Է�, �ʱ� ��ũ��� 10
			JTextField txt1 = new JTextField(10);
			this.add(txt1);
			// ���� ���� ���ڿ��� �Է�, 5�� 10��
			JTextArea txt2 = new JTextArea(5, 10);
			this.add(txt2);
			// �ؽ�Ʈ ������ ��ũ�ѹٸ� �����Ͽ�
			//  �Է��ϴ� ���� 5�� ������ ��ũ�ѹ� ǥ��
			this.add(new JScrollPane(txt2));
			// �Է��ص� ������ ������ �ʴ� ��й�ȣ �ʵ�
			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);

			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
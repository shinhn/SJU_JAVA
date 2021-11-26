import java.awt.*;
import javax.swing.*;

public class Ex13_05 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("CardLayout ����");

			// �������� ���̾ƿ��� CardLayout���� ����
			// ���� �� ���� ������ 10���� ����
			this.setLayout(new CardLayout(10, 10));
			
			// 3���� ��ư�� ��ġ
			JButton btn1 = new JButton("��ư1");
			this.add(btn1);

			JButton btn2 = new JButton("��ư2");
			this.add(btn2);

			JButton btn3 = new JButton("��ư3");
			this.add(btn3);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

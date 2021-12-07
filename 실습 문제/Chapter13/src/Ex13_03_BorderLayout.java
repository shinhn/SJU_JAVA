import java.awt.*;
import javax.swing.*;

public class Ex13_03_BorderLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("BorderLayout ����");

			// �������� ���̾ƿ��� BorderLayout���� ������
			// ���� �� ���� ������ 10���� ������
			this.setLayout(new BorderLayout(10, 10));

			// ��ư�� ���̾ƿ��� ������ �� ��ġ�� ������
			JButton btn1 = new JButton("��ư1");
			this.add(btn1, BorderLayout.NORTH);

			JButton btn2 = new JButton("��ư2");
			this.add(btn2, BorderLayout.WEST);

			JButton btn3 = new JButton("��ư3");
			this.add(btn3, BorderLayout.CENTER);

			JButton btn4 = new JButton("��ư4");
			this.add(btn4, BorderLayout.EAST);

			JButton btn5 = new JButton("��ư5");
			this.add(btn5, BorderLayout.SOUTH);
			
			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

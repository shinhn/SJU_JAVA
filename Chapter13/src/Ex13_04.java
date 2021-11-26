import java.awt.*;
import javax.swing.*;

public class Ex13_04 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout ����");

			// �������� ���̾ƿ��� GridLayout���� ����
			// 3�� 3���� ����, ���� ������ 10���� ����
			this.setLayout(new GridLayout(3, 3, 10, 10));

			// 9���� ��ư �迭�� ����
			JButton[] btn = new JButton[9];

			// 9���� ��ư �迭�� �ݺ������� GridLayout�� �߰�
			for (int i = 0; i < 9; i++) {
				btn[i] = new JButton("��ư" + (i + 1));
				this.add(btn[i]);
			}
			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
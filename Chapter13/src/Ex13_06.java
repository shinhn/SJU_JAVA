import java.awt.*;
import javax.swing.*;

public class Ex13_06 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("���̾ƿ��� ���� â ����");

			// �������� ���̾ƿ��� null�� ����
			this.setLayout(null);

			// 3���� ��ư�� ��ư ũ�⸦ �����Ͽ� ��ġ 
			JButton btn1 = new JButton("��ư1");
			btn1.setBounds(50, 50, 70, 60);
			//btn1.setBounds(110, 50, 70, 60);
			this.add(btn1);

			JButton btn2 = new JButton("��ư2");
			btn2.setBounds(80, 80, 70, 60);
			//btn2.setBounds(80, 80, 70, 60);
			this.add(btn2);

			JButton btn3 = new JButton("��ư3");
			btn3.setBounds(110, 110, 70, 60);
			//btn3.setBounds(50, 110, 70, 60);
			this.add(btn3);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

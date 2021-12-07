import java.awt.*;
import javax.swing.*;

public class Ex13_07_component {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 1");

			// Container�� JFrame ���� �ִ� �������� ������ �����ϱ� ���� ���
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);

			// ������ ���̾ƿ��� FlowLayout���� ����
			this.setLayout(new FlowLayout());
			// c.setLayout(new FlowLayout()); // �����̳ʿ� ���̾ƿ� ���� ����

			JButton btn1 = new JButton("��ư1");
			btn1.setBackground(Color.BLACK);    // ��ư ����
			btn1.setForeground(Color.MAGENTA);  // ��ư ���ڻ�
			this.add(btn1);

			JButton btn2 = new JButton("��ư2");
			btn2.setFont(new Font("�������", Font.BOLD, 30));  // ��Ʈ ����
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));	// ���콺 ���� �� ��ٸ� Ŀ��
			btn2.setToolTipText("�� ��ư�� ũ�� ������~~"); // ǳ�� ����
			this.add(btn2);

			JButton btn3 = new JButton("��ư3");
			btn3.setEnabled(false);	// ��ư ��Ȱ��ȭ
			this.add(btn3);

			setSize(256, 256);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}

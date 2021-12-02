import java.awt.*;
import javax.swing.*;

public class Ex13_02 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout ����");
			
			/* ������ ���̾ƿ��� FlowLayout���� ����
			   this�� ���� ������ ��ü�� JFrame�� �ǹ���
			   �������� �Ķ���͸� �����ϸ� �⺻������ �߾�
			    ���� �� ���� ������ 5�ȼ��� ��	 */
			 this.setLayout(new FlowLayout());
			//this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20,20));

			/* ��ư ������Ʈ JButton�� �����ϸ鼭
			 ��ư�� ���ڴ� '��ư1'�� ������
			 ������ ��ư�� this(��ü ������)�� ������ */
			JButton btn1 = new JButton("��ư1");
			this.add(new JButton("��ư1"));

			JButton btn2 = new JButton("��ư2");
			this.add(btn2);

			JButton btn3 = new JButton("��ư3");
			this.add(btn3);

			JButton btn4 = new JButton("��ư4");
			this.add(btn4);

			JButton btn5 = new JButton("��ư5");
			this.add(btn5);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

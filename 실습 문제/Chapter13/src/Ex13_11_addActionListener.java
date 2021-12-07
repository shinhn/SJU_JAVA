import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_11_addActionListener {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̺�Ʈ ó�� 1");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("��ư1");
			// ��ư1�� ������ Action �̺�Ʈ�� �߻����� ��
			//  �۵��ϴ� �����ʸ� ������
			btn1.addActionListener(new ActionListener() {
				// ���� �۵��ϴ� �κ�
				public void actionPerformed(ActionEvent arg0) {
					// ��ư1�� �ڽ��� ������ ���������� ������
					btn1.setBackground(Color.RED);
				}
			}); 
			this.add(btn1);
			
/*			ActionListener act = new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					btn1.setBackground(Color.RED);
				}
			};
			btn1.addActionListener(act);*/

			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
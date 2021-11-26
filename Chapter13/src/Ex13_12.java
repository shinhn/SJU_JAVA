import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_12 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̺�Ʈ ó�� 2");
			this.setLayout(new FlowLayout());

			// X ��ǥ�� Y ��ǥ�� ä���� �ؽ�Ʈ �ʵ�
			JTextField txtX = new JTextField(10);
			JTextField txtY = new JTextField(10);
			this.add(txtX);			
			this.add(txtY);

			// ���콺 �̺�Ʈ�� �����ʸ� JFrame(=this) �� ����
			this.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					// ���콺 Ŭ���� ������ X, Y ��ǥ�� ��
					txtX.setText(Integer.toString(e.getX()));
					txtY.setText(Integer.toString(e.getY()));					
				}
				// ������ �޼ҵ嵵 �߻�޼ҵ��̹Ƿ� �ݵ�� �ڵ���
				public void mouseEntered(MouseEvent e) {
				}
				public void mouseExited(MouseEvent e) {			
				}
				public void mousePressed(MouseEvent e) {					
				}
				public void mouseReleased(MouseEvent e) {									
				}
			});

			setSize(500	, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}


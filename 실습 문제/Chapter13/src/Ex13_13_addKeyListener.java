import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_13_addKeyListener {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̺�Ʈ ó�� 3");
			this.setLayout(new FlowLayout());

			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10, 10);
			this.add(txt);
			this.add(area);

			// �ؽ�Ʈ�ʵ忡�� Ű���带 ������ �۵��ϴ� KeyAdapter Ŭ���� �ڵ���			
			txt.addKeyListener(new KeyAdapter() {
				// Ű�� ���� �۵��ϴ� keyReleased() �޼ҵ带 �������̵���
				public void keyReleased(KeyEvent e) {
					// ���� Ű�� �������� key ������ ����
					int key = e.getKeyCode();
					// ���� Ű�� enter��� �ʵ��� ������ �ؽ�Ʈ ������ �߰���
					if (key == KeyEvent.VK_ENTER) {
						String str = txt.getText();
						area.setText(area.getText() + str + '\n'); //�ٹٲ�
						txt.setText(""); // �ؽ�Ʈ �ʵ带 ����
					}
					// ���� Ű�� 0~9�� �ƴϸ� ������ ������ �ϳ� �ٿ��� �ٽþ�
					if (!(key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9)) {
						String str = txt.getText();
						int strlen = str.length();
						if (strlen != 0)
							txt.setText(str.substring(0, strlen - 1));
					}
				}

			});

			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}


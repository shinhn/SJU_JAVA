import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice_07 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("연습문제 13-7");
			this.setLayout(new FlowLayout());
			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10, 10);
			this.add(txt);
			this.add(area);
			txt.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						String str = txt.getText();
						str = str.toUpperCase();
						area.setText(area.getText() + str + '\n');
						txt.setText("");
					}
					if (!(key >= KeyEvent.VK_A && key <= KeyEvent.VK_Z)) {
						String str = txt.getText();
						int strlen = str.length();
						if (strlen != 0) {
							txt.setText(str.substring(0, strlen - 1));
						}
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
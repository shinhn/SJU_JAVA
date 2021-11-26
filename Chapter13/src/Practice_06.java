import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice_06 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("연습문제 13-6");
			this.setLayout(new FlowLayout());
			JTextArea txtArea = new JTextArea(5, 10);
			this.add(txtArea);
			this.add(new JScrollPane(txtArea));
			this.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					String str;
					str = txtArea.getText().toString() + "\n" + Integer.toString(e.getX()) + "," + Integer.toString(e.getY());
					txtArea.setText(str);
					}
					public void mouseEntered(MouseEvent e) {
					}
					public void mouseExited(MouseEvent e) {
					}
					public void mousePressed(MouseEvent e) {
					}
					public void mouseReleased(MouseEvent e) {
					}
				});
				setSize(500, 200);
				setVisible(true);
			}
			public static void main(String[] args) {
				new MyGUI();
			}
		}
}
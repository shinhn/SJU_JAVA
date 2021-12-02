import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class Practice_04 {
	static class SwingGUI extends JFrame {
		SwingGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("연습문제 13-4");
			this.setLayout(new GridLayout(3, 5, 10, 10));
			JCheckBox[] btn = new JCheckBox[15];
			for (int i = 0; i < 15; i++) {
				btn[i] = new JCheckBox("체크박스" + (i + 1));
				this.add(btn[i]);
			}
			setSize(512, 256);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new SwingGUI();
	}
}
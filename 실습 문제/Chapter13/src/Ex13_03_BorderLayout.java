import java.awt.*;
import javax.swing.*;

public class Ex13_03_BorderLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("BorderLayout 연습");

			// 윈도우의 레이아웃을 BorderLayout으로 설정함
			// 수평 및 수직 간격은 10으로 설정함
			this.setLayout(new BorderLayout(10, 10));

			// 버튼을 레이아웃에 부착할 때 위치를 지정함
			JButton btn1 = new JButton("버튼1");
			this.add(btn1, BorderLayout.NORTH);

			JButton btn2 = new JButton("버튼2");
			this.add(btn2, BorderLayout.WEST);

			JButton btn3 = new JButton("버튼3");
			this.add(btn3, BorderLayout.CENTER);

			JButton btn4 = new JButton("버튼4");
			this.add(btn4, BorderLayout.EAST);

			JButton btn5 = new JButton("버튼5");
			this.add(btn5, BorderLayout.SOUTH);
			
			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

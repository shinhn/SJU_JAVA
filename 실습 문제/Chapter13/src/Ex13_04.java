import java.awt.*;
import javax.swing.*;

public class Ex13_04 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout 연습");

			// 윈도우의 레이아웃을 GridLayout으로 설정
			// 3행 3열에 수평, 수직 간격은 10으로 설정
			this.setLayout(new GridLayout(3, 3, 10, 10));

			// 9개의 버튼 배열을 생성
			JButton[] btn = new JButton[9];

			// 9개의 버튼 배열을 반복문으로 GridLayout에 추가
			for (int i = 0; i < 9; i++) {
				btn[i] = new JButton("버튼" + (i + 1));
				this.add(btn[i]);
			}
			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
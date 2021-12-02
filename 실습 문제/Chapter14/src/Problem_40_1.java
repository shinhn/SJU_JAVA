import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Problem_40_1 {
	// 스레드를 사용하기 위해 Runnable 인터페이스 구현
	static class MyGUI extends JFrame implements Runnable {
		JProgressBar bar1, bar2, bar3; // 3개의 프로그래스바
		int color1=0;
		int color2=0;
		int color3=0;

		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("연습문제 14-5");

			//3행 1열의 GridLayout 설정
			this.setLayout(new GridLayout(3, 1, 10, 10));

			bar1 = new JProgressBar();
			bar1.setValue(50); // 초기값
			bar1.setStringPainted(true); // 현재값을 표시함
			bar2 = new JProgressBar();
			bar2.setValue(10); // 초기값
			bar2.setForeground(Color.RED);
			bar2.setStringPainted(true);
			bar3 = new JProgressBar();
			bar3.setValue(30); // 초기값
			bar3.setForeground(Color.GREEN);
			bar3.setStringPainted(true);

			MyGUI.this.add(bar1);
			MyGUI.this.add(bar2);
			MyGUI.this.add(bar3);
			setSize(512, 256);
			setVisible(true);
		}
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(200);
					Random rand = new Random();
					float r = rand.nextFloat();
					float g = rand.nextFloat();
					float b = rand.nextFloat();
					Color randomColor = new Color(r, g, b);
					bar1.setValue(bar1.getValue() + 1);
					bar1.setForeground(randomColor);
					r = rand.nextFloat();
					g = rand.nextFloat();
					b = rand.nextFloat();
					randomColor = new Color(r, g, b);
					bar2.setValue(bar2.getValue() + 3);
					bar2.setForeground(randomColor);
					r = rand.nextFloat();
					g = rand.nextFloat();
					b = rand.nextFloat();
					randomColor = new Color(r, g, b);
					bar3.setValue(bar3.getValue() + 2);
					bar3.setForeground(randomColor);
				} catch (Exception e) {
				}
			}
		}
	}
	public static void main(String[] args) {
		MyGUI mygui = new MyGUI();
		Thread th = new Thread(mygui);
		th.start();
	}
}














import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Problem_40 {
	// �����带 ����ϱ� ���� Runnable �������̽� ����
	static class MyGUI extends JFrame implements Runnable {
		JProgressBar bar1, bar2, bar3; // 3���� ���α׷�����

		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������ ����");

			//3�� 1���� GridLayout ����
			this.setLayout(new GridLayout(3, 1, 10, 10));

			bar1 = new JProgressBar();
			bar1.setValue(50); // �ʱⰪ
			bar1.setStringPainted(true); // ���簪�� ǥ����
			bar2 = new JProgressBar();
			bar2.setValue(10); // �ʱⰪ
			bar2.setForeground(Color.RED);
			bar2.setStringPainted(true);
			bar3 = new JProgressBar();
			bar3.setValue(30); // �ʱⰪ
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
					Thread.sleep(100);
					bar1.setValue(bar1.getValue() + 1);
					bar2.setValue(bar2.getValue() + 3);
					bar3.setValue(bar3.getValue() + 2);
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








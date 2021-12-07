import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_13_addKeyListener {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 3");
			this.setLayout(new FlowLayout());

			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10, 10);
			this.add(txt);
			this.add(area);

			// 텍스트필드에서 키보드를 누르면 작동하는 KeyAdapter 클래스 코딩함			
			txt.addKeyListener(new KeyAdapter() {
				// 키를 떼면 작동하는 keyReleased() 메소드를 오버라이딩함
				public void keyReleased(KeyEvent e) {
					// 눌린 키의 정수값을 key 변수에 저장
					int key = e.getKeyCode();
					// 눌린 키가 enter라면 필드의 내용을 텍스트 영역에 추가함
					if (key == KeyEvent.VK_ENTER) {
						String str = txt.getText();
						area.setText(area.getText() + str + '\n'); //줄바꿈
						txt.setText(""); // 텍스트 필드를 지움
					}
					// 눌린 키가 0~9가 아니면 글자의 개수를 하나 줄여서 다시씀
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


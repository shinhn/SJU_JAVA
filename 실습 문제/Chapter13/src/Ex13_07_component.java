import java.awt.*;
import javax.swing.*;

public class Ex13_07_component {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 1");

			// Container는 JFrame 내에 있는 영역으로 배경색을 지정하기 위해 사용
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);

			// 윈도우 레이아웃을 FlowLayout으로 설정
			this.setLayout(new FlowLayout());
			// c.setLayout(new FlowLayout()); // 컨테이너에 레이아웃 지정 가능

			JButton btn1 = new JButton("버튼1");
			btn1.setBackground(Color.BLACK);    // 버튼 배경색
			btn1.setForeground(Color.MAGENTA);  // 버튼 글자색
			this.add(btn1);

			JButton btn2 = new JButton("버튼2");
			btn2.setFont(new Font("맑은고딕", Font.BOLD, 30));  // 폰트 지정
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));	// 마우스 오버 시 기다림 커서
			btn2.setToolTipText("이 버튼은 크게 보여요~~"); // 풍선 도움말
			this.add(btn2);

			JButton btn3 = new JButton("버튼3");
			btn3.setEnabled(false);	// 버튼 비활성화
			this.add(btn3);

			setSize(256, 256);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}

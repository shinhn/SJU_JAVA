import java.awt.*;
import javax.swing.*;

public class Ex13_02 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");
			
			/* 윈도우 레이아웃을 FlowLayout으로 설정
			   this는 현재 윈도우 자체인 JFrame을 의미함
			   생성자의 파라미터를 생략하면 기본정렬은 중앙
			    수직 및 수평 간격은 5픽셀이 됨	 */
			 this.setLayout(new FlowLayout());
			//this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20,20));

			/* 버튼 컴포넌트 JButton을 생성하면서
			 버튼의 글자는 '버튼1'로 지정함
			 생성한 버튼을 this(자체 윈도우)에 부착함 */
			JButton btn1 = new JButton("버튼1");
			this.add(new JButton("버튼1"));

			JButton btn2 = new JButton("버튼2");
			this.add(btn2);

			JButton btn3 = new JButton("버튼3");
			this.add(btn3);

			JButton btn4 = new JButton("버튼4");
			this.add(btn4);

			JButton btn5 = new JButton("버튼5");
			this.add(btn5);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

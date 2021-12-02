import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_02 {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout");
			
			 
			this.setLayout(new FlowLayout()); // 생성자의 파라미터를 생략하면 기본정렬은 중앙, 수직 및 수평 간격은 5픽셀
			
			JButton btn1 = new JButton("버튼1");
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			this.add(btn3);
			
			JButton btn4 = new JButton("버튼4");
			this.add(btn4);
			
			JButton btn5 = new JButton("버튼5");
			this.add(btn5);
			
			setSize(256,256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		
		new MyGUI();

	}

}

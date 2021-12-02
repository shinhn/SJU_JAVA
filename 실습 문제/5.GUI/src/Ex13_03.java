import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_03 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("BorderLayout");
			
			 
			this.setLayout(new BorderLayout(10,10)); // 수직 및 수평 간격 10픽셀
			
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
			
			setSize(256,256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		
		new MyGUI();

	}

}

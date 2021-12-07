import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_11_addActionListener {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 1");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("버튼1");
			// 버튼1이 눌리는 Action 이벤트가 발생했을 때
			//  작동하는 리스너를 정의함
			btn1.addActionListener(new ActionListener() {
				// 실제 작동하는 부분
				public void actionPerformed(ActionEvent arg0) {
					// 버튼1이 자신의 색상을 빨간색으로 변경함
					btn1.setBackground(Color.RED);
				}
			}); 
			this.add(btn1);
			
/*			ActionListener act = new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					btn1.setBackground(Color.RED);
				}
			};
			btn1.addActionListener(act);*/

			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
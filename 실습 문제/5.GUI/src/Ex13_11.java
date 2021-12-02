import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex13_11 {
	static class MyGUI extends JFrame{
		MyGUI(){
			// 윈도우 오른쪽 x버튼을 누르면 프로그램 종료 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목 
			setTitle("이벤트 처리 1");
			
			this.setLayout(new FlowLayout());
			
			
			JButton btn1 = new JButton("버튼1");
			
			
			// Action 이벤트 -> 작동하는 리스너 정의 
			ActionListener act = new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btn1.setBackground(Color.RED);
					
					// mac의 경우 버튼이 mac default 버튼으로 설정되어 있기 때문에 
					// 아래와 같은 코드를 붙여줘야 버튼의 색상이 바뀜 
					// 출처 : https://sunylog.tistory.com/entry/Mac-OS-button-background
					btn1.setOpaque(true);
					btn1.setBorderPainted(false);
				}
			};
			
			btn1.addActionListener(act);
			
			
			
			
			this.add(btn1);
			
			
			
			// 윈도우 크기 (픽셀)
			setSize(200,200);
			// 윈도우가 화면에 보이게 함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}

}

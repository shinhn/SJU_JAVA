import java.awt.*;
import javax.swing.*;

public class Ex13_09 {
	static class MyGUI extends JFrame{
		MyGUI(){
			// 윈도우 오른쪽 x버튼을 누르면 프로그램 종료 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목 
			setTitle("컴포넌트 연습3");
			
			
			this.setLayout(new FlowLayout());
			
			
			// 한 줄의 문자열 입력 
			JTextField txt1 = new JTextField(10); // 초기 열크기는 10 
			this.add(txt1);
			
			// 여러 줄의 문자열 입력 
			JTextArea txt2 = new JTextArea(5,10); // 5행 10열 
			this.add(txt2);
			this.add(new JScrollPane(txt2)); // 입력하는 행이 5가 넘으면 스크롤바 표시 
			
			// 내용이 보이지 않는 비밀번호 필드 
			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);
	
			
			
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

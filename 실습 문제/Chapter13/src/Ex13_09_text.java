import java.awt.*;
import javax.swing.*;

public class Ex13_09_text {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 3");
			// 윈도우 레이아웃을 FlowLayout으로 지정
			this.setLayout(new FlowLayout());
			// 한 줄의 문자열을 입력, 초기 열크기는 10
			JTextField txt1 = new JTextField(10);
			this.add(txt1);
			// 여러 줄의 문자열을 입력, 5행 10열
			JTextArea txt2 = new JTextArea(5, 10);
			this.add(txt2);
			// 텍스트 영역에 스크롤바를 부착하여
			//  입력하는 행이 5가 넘으면 스크롤바 표시
			this.add(new JScrollPane(txt2));
			// 입력해도 내용이 보이지 않는 비밀번호 필드
			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);

			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
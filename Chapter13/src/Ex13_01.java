import javax.swing.JFrame;

public class Ex13_01 {
	//JFrame을 상속받는 MyGUI 클래스 생성
	static class MyGUI extends JFrame {
		
		// MyGUI 생성자
		MyGUI() {
			
			// 윈도우 오른쪽 위의 X버튼을 누르면 프로그램이 종료되게 함
			// 생략하면 윈도우는 사라지나 프로그램이 종료되지 않음
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목을 출력함. 생략 가능
			setTitle("GUI 연습");

			// 이 부분에 버튼, 레이블, 체크박스 등을 코딩함

			setSize(500, 500);  // 윈도우 크기를 픽셀로 지정
			setVisible(true);	// 윈도우가 화면에 보이게 함
		}
	}

	public static void main(String[] args) {
		// main 메소드에서 MyGUI 클래스를 생성함
		new MyGUI();
	}
}

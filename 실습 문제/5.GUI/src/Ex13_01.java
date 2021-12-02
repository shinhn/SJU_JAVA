import javax.swing.JFrame;

public class Ex13_01 {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			// 윈도우 오른쪽 x버튼을 누르면 프로그램 종료 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목 
			setTitle("GUI 연습");
			// 윈도우 크기 (픽셀)
			setSize(500,500);
			// 윈도우가 화면에 보이게 함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		
		// main에서 MyGUI 클래스 생성 
		new MyGUI();
		

	}

}

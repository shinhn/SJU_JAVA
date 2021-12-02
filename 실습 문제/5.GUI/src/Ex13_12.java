import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex13_12 {
	static class MyGUI extends JFrame{
		MyGUI(){
			// 윈도우 오른쪽 x버튼을 누르면 프로그램 종료 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목 
			setTitle("이벤트 처리 2");
			
			this.setLayout(new FlowLayout());
			
			
			// 텍스트 필드 (x, y 좌표 채워질 용도)
			JTextField txtX = new JTextField(10);
			JTextField txtY = new JTextField(10);
			this.add(txtX);
			this.add(txtY);
			
			// 마우스 이벤트의 리스터를 JFrame(this)에 부착 
			this.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					// 마우스 클릭한 지접의 X, Y 좌표를 씀 
					txtX.setText(Integer.toString(e.getX()));
					txtY.setText(Integer.toString(e.getY()));
				}
				
				// 나머지 메소드도 추상메소드이므로 반드시 코딩해야함 
				public void mouseEntered(MouseEvent e) {
					
				}
				public void mouseExited(MouseEvent e) {
					
				}
				public void mousePressed(MouseEvent e) {
	
				}
				public void mouseReleased(MouseEvent e) {
	
				}
			});
			
			
			
			// 윈도우 크기 (픽셀)
			setSize(500,200);
			// 윈도우가 화면에 보이게 함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}

}

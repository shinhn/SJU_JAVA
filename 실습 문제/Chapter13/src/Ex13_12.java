import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_12 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 2");
			this.setLayout(new FlowLayout());

			// X 좌표와 Y 좌표가 채워질 텍스트 필드
			JTextField txtX = new JTextField(10);
			JTextField txtY = new JTextField(10);
			this.add(txtX);			
			this.add(txtY);

			// 마우스 이벤트의 리스너를 JFrame(=this) 에 부착
			this.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					// 마우스 클릭한 지점의 X, Y 좌표를 씀
					txtX.setText(Integer.toString(e.getX()));
					txtY.setText(Integer.toString(e.getY()));					
				}
				// 나머지 메소드도 추상메소드이므로 반드시 코딩함
				public void mouseEntered(MouseEvent e) {
				}
				public void mouseExited(MouseEvent e) {			
				}
				public void mousePressed(MouseEvent e) {					
				}
				public void mouseReleased(MouseEvent e) {									
				}
			});

			setSize(500	, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}


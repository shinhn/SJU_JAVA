import java.awt.*;
import javax.swing.*;

public class Ex13_08 {
	static class MyGUI extends JFrame{
		MyGUI(){
			// 윈도우 오른쪽 x버튼을 누르면 프로그램 종료 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목 
			setTitle("컴포넌트 연습2");
			
			
			this.setLayout(new FlowLayout());
			
			
			
			// 버튼에 이용할 이미지 
			ImageIcon img1 = new ImageIcon("image/java1.png");
			ImageIcon img2 = new ImageIcon("image/java2.png");
			
			// 버튼 
			JButton btn1 = new JButton("버튼1", img1);
			this.add(btn1);
			
			// 레이블 
			JLabel lb1 = new JLabel("레이블1입니다.");
			JLabel lb2 = new JLabel(img2);
			this.add(lb1);
			this.add(lb2);
			
			// 체크박스 
			JCheckBox cb1 = new JCheckBox("C++");
			JCheckBox cb2 = new JCheckBox("Java");
			JCheckBox cb3 = new JCheckBox("C#", true); // 체크됨 
			this.add(cb1);
			this.add(cb2);
			this.add(cb3);
			
			// 라디오버튼 
			JRadioButton rd1 = new JRadioButton("고래");
			JRadioButton rd2 = new JRadioButton("상어");
			JRadioButton rd3 = new JRadioButton("새우");
			this.add(rd1);
			this.add(rd2);
			this.add(rd3);
			
			// 라디오 버튼은 하나만 선택되어야 하므로 대상 그룹 생성
			ButtonGroup grp = new ButtonGroup();
			grp.add(rd1);
			grp.add(rd2);
			grp.add(rd3);
			
			
			
			// 윈도우 크기 (픽셀)
			setSize(200,300);
			// 윈도우가 화면에 보이게 함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		
		new MyGUI();
	}

}

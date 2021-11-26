import java.awt.*;
import javax.swing.*;

public class Ex13_08 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 2");
			// 윈도우 레이아웃을 FlowLayout으로 지정
			this.setLayout(new FlowLayout());
			// 버튼에 사용할 이미지
			ImageIcon img1 = new ImageIcon("image/java1.png");
			ImageIcon img2 = new ImageIcon("image/java2.png");
			// 버튼 생성 시 텍스트와 이미지를 함께 생성
			JButton btn1 = new JButton("버튼1", img1);
			this.add(btn1);
			// 각 레이블에 텍스트와 이미지 표시
			JLabel lbl1 = new JLabel("레이블1입니다.");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);

			JCheckBox chk1 = new JCheckBox("C++");
			JCheckBox chk2 = new JCheckBox("Java");
			JCheckBox chk3 = new JCheckBox("C#", true); // 체크됨
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);

			JRadioButton rdo1 = new JRadioButton("고래", true);
			JRadioButton rdo2 = new JRadioButton("상어");
			JRadioButton rdo3 = new JRadioButton("새우");
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			// 라이오 버튼은 하나만 선택되어야 하므로 대상 그룹 생성
			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);

			setSize(200, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
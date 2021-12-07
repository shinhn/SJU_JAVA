import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_15_ToolBar {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("툴바 만들기");
			this.setLayout(new FlowLayout());

			JToolBar toolBar = new JToolBar();
			// 아이템으로 사용할 버튼 3개 생성
			JButton newItem = new JButton("새 문서");
			JButton openItem = new JButton("열기");
			JButton closeItem = new JButton(new ImageIcon("image/exit.png"));

			// 툴바를 JFrame의 상단에 부착
			add(toolBar, BorderLayout.NORTH);
			toolBar.add(newItem);	// 툴바에 아이템 부착
			toolBar.add(openItem);
			toolBar.addSeparator(new Dimension(20,10)); // 툴바에 분리선 추가
			toolBar.add(closeItem);

			JLabel lbl = new JLabel("이 글자가 바뀝니다");
			this.add(lbl);

			// 각 아이템(버튼)을 누르면 작동하는 리스너 작성
			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[새 문서]를 선택했습니다.");
				}
			});

			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[열기]를 선택했습니다.");
				}
			});

			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});

			setSize(300, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}


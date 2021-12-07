import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_14_Menu {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("메뉴 만들기");
			this.setLayout(new FlowLayout());

			JLabel lbl = new JLabel("이 글자가 바뀝니다");
			this.add(lbl);

			JMenuBar menuBar = new JMenuBar();

			JMenu fileMenu = new JMenu("파일");
			JMenu editMenu = new JMenu("편집");

			JMenuItem newItem = new JMenuItem("새 문서");
			JMenuItem openItem = new JMenuItem("열기");
			JMenuItem closeItem = new JMenuItem("닫기");

			setJMenuBar(menuBar);		// 메뉴바를 JFrame에 부착

			menuBar.add(fileMenu);		// 파일메뉴를 메뉴바에 부착
			menuBar.add(editMenu);

			fileMenu.add(newItem);		// 메뉴 아이템을 파일메뉴에 부착
			fileMenu.add(openItem);
			fileMenu.addSeparator();	// 메뉴 분리선 추가
			fileMenu.add(closeItem);

			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[새 문서]를 선택했습니다.");
				}
			});	// "새 문서" 메뉴 아이템을 선택하면 작동하는 리스너 코딩

			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[열기]를 선택했습니다.");
				}
			});

			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);	// "닫기" 아이템을 클릭하면 종료
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
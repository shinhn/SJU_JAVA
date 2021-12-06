import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex13_14_menu {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("메뉴 만들기");
			
			this.setLayout(new FlowLayout());
			
			JLabel lb = new JLabel("이 글자가 바뀝니다");
			this.add(lb);
			
			// 메뉴바 
			JMenuBar menuBar = new JMenuBar();
			
			// 메뉴 
			JMenu fileMenu = new JMenu("파일");
			JMenu editMenu = new JMenu("편집");
			
			// 메뉴 아이템 
			JMenuItem newItem = new JMenuItem("새 문서");
			JMenuItem openItem = new JMenuItem("열기");
			JMenuItem closeItem = new JMenuItem("닫기");
			
			// 메뉴바를 JFrame에 부착 
			setJMenuBar(menuBar); 
			
			// 파일메뉴를 메뉴바에 부착 
			menuBar.add(fileMenu); 
			menuBar.add(editMenu);
			
			// 메뉴 아이템을 파일메뉴에 부착 
			fileMenu.add(newItem); 
			fileMenu.add(openItem);
			fileMenu.addSeparator(); // 메뉴 분리선 
			fileMenu.add(closeItem);
			
			// 리스너 
			newItem.addActionListener(new ActionListener() { // "새 문서" 메뉴 아이템을 선택하면 "[새 문서]를 선택했습니다."
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[새 문서]를 선택했습니다.");
				}
			});
			
			openItem.addActionListener(new ActionListener() { // "열기" 메뉴 아이템을 선택하면 "[열기]를 선택했습니다."
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[열기]를 선택했습니다.");
				}
			});
			
			closeItem.addActionListener(new ActionListener() { // "닫기" 메뉴 아이템을 선택하면 종료 
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

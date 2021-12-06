import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex13_15_toolbar {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("툴바 만들기");
			
			this.setLayout(new FlowLayout());
			
			// 툴바 
			JToolBar toolBar = new JToolBar();
			
			// 버튼 
			JButton newItem = new JButton("새 문서");
			JButton openItem = new JButton("열기");
			JButton closeItem = new JButton(new ImageIcon("image/exit.png"));
			
			// 툴바를 JFrame의 상단에 부착 
			add(toolBar, BorderLayout.NORTH);
			
			// 툴바에 아이템 부착 
			toolBar.add(newItem);
			toolBar.add(openItem);
			toolBar.addSeparator(new Dimension(20,10)); // 분리선 
			toolBar.add(closeItem);
			
			// JLabel 
			JLabel lb = new JLabel("이 글자가 바뀝니다.");
			this.add(lb);
			
			// 리스너 
			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[새 문서]를 선택했습니다.");
				}
			});
			
			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[열기]를 선택했습니다.");
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

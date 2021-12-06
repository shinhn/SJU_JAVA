import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex13_15_toolbar {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("���� �����");
			
			this.setLayout(new FlowLayout());
			
			// ���� 
			JToolBar toolBar = new JToolBar();
			
			// ��ư 
			JButton newItem = new JButton("�� ����");
			JButton openItem = new JButton("����");
			JButton closeItem = new JButton(new ImageIcon("image/exit.png"));
			
			// ���ٸ� JFrame�� ��ܿ� ���� 
			add(toolBar, BorderLayout.NORTH);
			
			// ���ٿ� ������ ���� 
			toolBar.add(newItem);
			toolBar.add(openItem);
			toolBar.addSeparator(new Dimension(20,10)); // �и��� 
			toolBar.add(closeItem);
			
			// JLabel 
			JLabel lb = new JLabel("�� ���ڰ� �ٲ�ϴ�.");
			this.add(lb);
			
			// ������ 
			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[�� ����]�� �����߽��ϴ�.");
				}
			});
			
			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[����]�� �����߽��ϴ�.");
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

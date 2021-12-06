import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex13_14_menu {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�޴� �����");
			
			this.setLayout(new FlowLayout());
			
			JLabel lb = new JLabel("�� ���ڰ� �ٲ�ϴ�");
			this.add(lb);
			
			// �޴��� 
			JMenuBar menuBar = new JMenuBar();
			
			// �޴� 
			JMenu fileMenu = new JMenu("����");
			JMenu editMenu = new JMenu("����");
			
			// �޴� ������ 
			JMenuItem newItem = new JMenuItem("�� ����");
			JMenuItem openItem = new JMenuItem("����");
			JMenuItem closeItem = new JMenuItem("�ݱ�");
			
			// �޴��ٸ� JFrame�� ���� 
			setJMenuBar(menuBar); 
			
			// ���ϸ޴��� �޴��ٿ� ���� 
			menuBar.add(fileMenu); 
			menuBar.add(editMenu);
			
			// �޴� �������� ���ϸ޴��� ���� 
			fileMenu.add(newItem); 
			fileMenu.add(openItem);
			fileMenu.addSeparator(); // �޴� �и��� 
			fileMenu.add(closeItem);
			
			// ������ 
			newItem.addActionListener(new ActionListener() { // "�� ����" �޴� �������� �����ϸ� "[�� ����]�� �����߽��ϴ�."
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[�� ����]�� �����߽��ϴ�.");
				}
			});
			
			openItem.addActionListener(new ActionListener() { // "����" �޴� �������� �����ϸ� "[����]�� �����߽��ϴ�."
				public void actionPerformed(ActionEvent arg0) {
					lb.setText("[����]�� �����߽��ϴ�.");
				}
			});
			
			closeItem.addActionListener(new ActionListener() { // "�ݱ�" �޴� �������� �����ϸ� ���� 
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

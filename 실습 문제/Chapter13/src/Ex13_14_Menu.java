import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_14_Menu {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�޴� �����");
			this.setLayout(new FlowLayout());

			JLabel lbl = new JLabel("�� ���ڰ� �ٲ�ϴ�");
			this.add(lbl);

			JMenuBar menuBar = new JMenuBar();

			JMenu fileMenu = new JMenu("����");
			JMenu editMenu = new JMenu("����");

			JMenuItem newItem = new JMenuItem("�� ����");
			JMenuItem openItem = new JMenuItem("����");
			JMenuItem closeItem = new JMenuItem("�ݱ�");

			setJMenuBar(menuBar);		// �޴��ٸ� JFrame�� ����

			menuBar.add(fileMenu);		// ���ϸ޴��� �޴��ٿ� ����
			menuBar.add(editMenu);

			fileMenu.add(newItem);		// �޴� �������� ���ϸ޴��� ����
			fileMenu.add(openItem);
			fileMenu.addSeparator();	// �޴� �и��� �߰�
			fileMenu.add(closeItem);

			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[�� ����]�� �����߽��ϴ�.");
				}
			});	// "�� ����" �޴� �������� �����ϸ� �۵��ϴ� ������ �ڵ�

			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[����]�� �����߽��ϴ�.");
				}
			});

			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);	// "�ݱ�" �������� Ŭ���ϸ� ����
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
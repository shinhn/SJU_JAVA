import java.awt.*;
import javax.swing.*;

public class Ex13_10 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 4");
			// ������ ���̾ƿ��� FlowLayout���� ����
			this.setLayout(new FlowLayout());
			// ����Ʈ�� ����� ���ڿ� �迭 �غ�
			String[] pet = {"�����", "������", "�䳢", "�ھ˶�", "�۾���", 
					"A", "B", "C", "D", "E", "F","G", "H", "I", "J", "K", "L"};
			// pet �迭�� JList ����			
			JList list = new JList(pet);
			// ��ũ�� ���� �����ϰ� ũ�� ����
			JScrollPane sp = new JScrollPane(list);
			Dimension d = list.getPreferredSize();
			d.width = 100;
			d.height = 200;
			sp.setPreferredSize(d);
			this.add(sp);
			
			// pet �迭�� JComboBox ����
			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			setSize(300, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
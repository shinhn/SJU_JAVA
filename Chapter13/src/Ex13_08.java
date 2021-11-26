import java.awt.*;
import javax.swing.*;

public class Ex13_08 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 2");
			// ������ ���̾ƿ��� FlowLayout���� ����
			this.setLayout(new FlowLayout());
			// ��ư�� ����� �̹���
			ImageIcon img1 = new ImageIcon("image/java1.png");
			ImageIcon img2 = new ImageIcon("image/java2.png");
			// ��ư ���� �� �ؽ�Ʈ�� �̹����� �Բ� ����
			JButton btn1 = new JButton("��ư1", img1);
			this.add(btn1);
			// �� ���̺� �ؽ�Ʈ�� �̹��� ǥ��
			JLabel lbl1 = new JLabel("���̺�1�Դϴ�.");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);

			JCheckBox chk1 = new JCheckBox("C++");
			JCheckBox chk2 = new JCheckBox("Java");
			JCheckBox chk3 = new JCheckBox("C#", true); // üũ��
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);

			JRadioButton rdo1 = new JRadioButton("��", true);
			JRadioButton rdo2 = new JRadioButton("���");
			JRadioButton rdo3 = new JRadioButton("����");
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			// ���̿� ��ư�� �ϳ��� ���õǾ�� �ϹǷ� ��� �׷� ����
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
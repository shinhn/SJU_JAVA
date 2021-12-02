import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* - �ּҿ䱸 ������ ��Ģ����� AC(����ʱ�ȭ) ����̴�.
 * - �� ���������� ���ӵ� ����� �������� �ʰ� �� ���� ���� ��Ģ���길 �����Ѵ�.
 * - ���� ��������� ���ؼ��� ������ ����ó���� ������.
 */
public class Ext_01 extends JFrame{
	// ��� ���̺�
	JLabel label;

	// ���� ��ư�� ��� ��ư
	JButton btn[] = new JButton[10];
	JButton fbtn[] = new JButton[6];

	// ��ɹ�ư ���̺� ���ڿ�
	String[] blabels = {"+","-","*","AC","=","/"};

	// ����� ���� ����
	int num1, num2, result;
	String tmpNum="";
	String operator;

	public Ext_01() {
		// ������ ����
		super("Calcurator");
		setBounds(200, 200, 210, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��� ���̺� ����
		label = new JLabel("0", JLabel.RIGHT);
		label.setFont(new Font("����", Font.BOLD, 40));
		label.setBackground(Color.LIGHT_GRAY);
		add(label, BorderLayout.NORTH);

		// UI ���� �г� ����
		JPanel p = new JPanel(new GridLayout(4, 4, 1, 1));
		add(p, BorderLayout.CENTER);

		// ��ư �ʱ�ȭ
		makeNumBtns();
		makeFncBtns();

		// �гο� ��ư�߰�
		int bn = 7;
		for(int i=0;i<3;i++){
			for(int j=bn,cnt=0;cnt<3;j++,cnt++) {
				p.add(btn[j]);
			}
			p.add(fbtn[i]);
			bn -= 3;
		}

		// ������ ������ ���� �߰�
		p.add(btn[0]);
		p.add(fbtn[3]);
		p.add(fbtn[4]);
		p.add(fbtn[5]);

		setVisible(true);
	}

	// ���� ��ư ���� �� ���̺�, �̺�Ʈ �߰�
	void makeNumBtns() {
		NumberHandler nh = new NumberHandler();

		for(int i=0;i<btn.length;i++ ) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].addActionListener(nh);
		}
	}

	// ��� ��ư ���� �� ���̺�, �̺�Ʈ �߰�
	void makeFncBtns() {
		CalcHandler ch = new CalcHandler();

		for(int i=0;i<fbtn.length;i++) {
			fbtn[i] = new JButton(blabels[i]);
			fbtn[i].setBackground(Color.GRAY);
			fbtn[i].addActionListener(ch);
		}    	
	}

	// ���� �̺�Ʈ ó�� �ڵ鷯 Ŭ����
	class NumberHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			tmpNum += s;
			label.setText(tmpNum);
		}
	}


	// ������ �� ��Ÿ ��� ó�� �ڵ鷯 Ŭ����
	class CalcHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String in = e.getActionCommand();
			if(in.equals("=")) {
				num2 = Integer.parseInt(tmpNum);
				
				switch(operator) {
				case "+": result = num1+num2; break;
				case "-": result = num1-num2; break;
				case "*": result = num1*num2; break;
				case "/": result = num1/num2; break;
				}
				label.setText(Integer.toString(result));
			}
			else if (in.equals("AC")){
				label.setText("0");
				tmpNum = "";
				num1 = 0; num2 = 0; result = 0;
			}
			else {
				operator = in;
				num1 = Integer.parseInt(label.getText());
				tmpNum = "";
				label.setText(operator);
			}
		}
	}

	public static void main(String[] args) {
		new Ext_01();
	}
}
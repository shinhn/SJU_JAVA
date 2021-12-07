import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/* - ���⼭�� ������ BorderLayout�� ����ϰ� �����г� ��ġ�� GridLayout�� �����.
 * - ������ �̺�Ʈ ó���� �������� ����.
 * - ���� ��ǻ���� �ü�� �����̳� ��Ʈ � ���� ��� ȭ���� ©�� ���ϼ� ����. �̰�� setBounds() �޼��忡�� ũ�� �����Ұ�.
 */
public class Ext_02_pos extends JFrame{
	JLabel uname, curTime, txt1, txt2;
	// ��� ����, �����ϴ� üũ�ڽ� �׷�, ���� �׷�
	JPanel info1, info2, info3;
	ButtonGroup radio;
	
	// ���� �ϴ� ���̺�
	JTable table;
	
	public Ext_02_pos() {
		super("POS ���α׷�");
		setBounds(250, 250, 680, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		uname = new JLabel("�������: ȫ�浿");
		curTime = new JLabel("����ð�: " +new java.util.Date());
		
		txt1 = new JLabel("�Ǹ�����: ");
		JCheckBox normal = new JCheckBox("����");
		JCheckBox sale = new JCheckBox("����");
		
		txt2 = new JLabel("ȸ������: ");
		radio = new ButtonGroup();
		JRadioButton mem = new JRadioButton("ȸ��");
		JRadioButton nonmem = new JRadioButton("��ȸ��");
		radio.add(mem);
		radio.add(nonmem);

		setLayout(new BorderLayout());
		
		info1 = new JPanel(new BorderLayout());
		info2 = new JPanel();
		info3 = new JPanel();
		
		info1.add(uname,BorderLayout.LINE_START);
		info1.add(curTime,BorderLayout.LINE_END);
		
		info2.add(txt1); info2.add(normal);info2.add(sale);
		info3.add(txt2); info3.add(mem);info3.add(nonmem);
		
		String[] colNames = {"��ȣ","��ǰ �̸�","�ܰ�","����","�ݾ�"};
		Object[][] data = {
				{"1","���ִ� ����Ĩ","2,000","1","2,000"},
				{"2","�����Ʈ ĩ��","1,500","2","3,000"},
				{"3","ȣȣ ȣ��","1,000", "3", "3,000"}
		};
				
		table = new JTable(data,colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);     // scrollPane �ȿ� ���̺��� �� ���� ���̰� ��
		
		JPanel p = new JPanel(new GridLayout(2,1));
		p.add(info2); p.add(info3);
		add(info1,BorderLayout.PAGE_START);  	// BorderLayout.PAGE_START : ���� �� �� �տ� ��ġ
		add(p,BorderLayout.LINE_START);			// BorderLayout.LINE_START : ����� �� �տ� ��ġ
		add(scrollPane,BorderLayout.LINE_END);	// BorderLayout.LINE_END : ����� �������� ��ġ
												// scrollPane �ȿ� table�� ��ġ�Ͽ����Ƿ� ���̺��� ȭ�鿡 ǥ�õ�
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ext_02_pos app = new Ext_02_pos();
	}
}
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

/* - 여기서는 메인은 BorderLayout을 사용하고 정보패널 배치에 GridLayout을 사용함.
 * - 별도의 이벤트 처리는 구현하지 않음.
 * - 실행 컴퓨터의 운영체제 설정이나 폰트 등에 따라 결과 화면이 짤려 보일수 있음. 이경우 setBounds() 메서드에서 크기 조절할것.
 */
public class Ext_02_pos extends JFrame{
	JLabel uname, curTime, txt1, txt2;
	// 상단 정보, 좌측하단 체크박스 그룹, 라디오 그룹
	JPanel info1, info2, info3;
	ButtonGroup radio;
	
	// 우측 하단 테이블
	JTable table;
	
	public Ext_02_pos() {
		super("POS 프로그램");
		setBounds(250, 250, 680, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		uname = new JLabel("담당직원: 홍길동");
		curTime = new JLabel("현재시간: " +new java.util.Date());
		
		txt1 = new JLabel("판매유형: ");
		JCheckBox normal = new JCheckBox("정상");
		JCheckBox sale = new JCheckBox("할인");
		
		txt2 = new JLabel("회원구분: ");
		radio = new ButtonGroup();
		JRadioButton mem = new JRadioButton("회원");
		JRadioButton nonmem = new JRadioButton("비회원");
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
		
		String[] colNames = {"번호","상품 이름","단가","수량","금액"};
		Object[][] data = {
				{"1","맛있는 고구마칩","2,000","1","2,000"},
				{"2","브라이트 칫솔","1,500","2","3,000"},
				{"3","호호 호빵","1,000", "3", "3,000"}
		};
				
		table = new JTable(data,colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);     // scrollPane 안에 테이블을 꽉 차서 보이게 함
		
		JPanel p = new JPanel(new GridLayout(2,1));
		p.add(info2); p.add(info3);
		add(info1,BorderLayout.PAGE_START);  	// BorderLayout.PAGE_START : 왼쪽 위 맨 앞에 위치
		add(p,BorderLayout.LINE_START);			// BorderLayout.LINE_START : 행방향 맨 앞에 위치
		add(scrollPane,BorderLayout.LINE_END);	// BorderLayout.LINE_END : 행방향 마지막에 위치
												// scrollPane 안에 table을 배치하였으므로 테이블이 화면에 표시됨
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ext_02_pos app = new Ext_02_pos();
	}
}
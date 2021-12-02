import java.awt.*;
import javax.swing.*;

public class Ex13_10 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 4");
			// 윈도우 레이아웃을 FlowLayout으로 지정
			this.setLayout(new FlowLayout());
			// 리스트에 출력할 문자열 배열 준비
			String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지", 
					"A", "B", "C", "D", "E", "F","G", "H", "I", "J", "K", "L"};
			// pet 배열로 JList 생성			
			JList list = new JList(pet);
			// 스크롤 페인 생성하고 크기 지정
			JScrollPane sp = new JScrollPane(list);
			Dimension d = list.getPreferredSize();
			d.width = 100;
			d.height = 200;
			sp.setPreferredSize(d);
			this.add(sp);
			
			// pet 배열로 JComboBox 생성
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
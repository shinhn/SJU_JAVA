import javax.swing.*;
import java.awt.*;

public class Ex13_10 {
	static class MyGUI extends JFrame{
		MyGUI(){
			// 윈도우 오른쪽 x버튼을 누르면 프로그램 종료 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 윈도우 제목 
			setTitle("컴포넌트 연습4");
			
			this.setLayout(new FlowLayout());
			
			
			// 리스트에 출력할 문자열 배열 
			String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지"};
			
			// JList : 하나 이상 선택 가능, 전체가 펼쳐짐 
			JList list = new JList(pet);
			this.add(list);
			
			// JComboBox : 하나만 선택 가능, 클릭시 펴짐 
			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			
			
			
			// 배열 크기 늘리고 JList에 스크롤바 생성 
			String[] pet2 = {"고양이", "강아지", "토끼", "코알라", "송아지", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
			JList list2 = new JList(pet2);
			
			JScrollPane sp = new JScrollPane(list2);
			
			Dimension d = list2.getPreferredSize(); // Jlist 크기 설정 
			d.width = 100;
			d.height = 200;
			sp.setPreferredSize(d);
			
			this.add(sp);
			
			
			// 윈도우 크기 (픽셀)
			setSize(300,300);
			// 윈도우가 화면에 보이게 함
			setVisible(true);
		}
	}


	public static void main(String[] args) {
		new MyGUI();

	}

}

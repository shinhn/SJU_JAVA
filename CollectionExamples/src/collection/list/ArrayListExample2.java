package collection.list;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al1.add("ȫ�浿");
		al1.add("�����");
		al1.add(10);
		
		al2.add("����");
		al2.add("���");
		//al2.add(100);
		
		al2.addAll(al1);
		
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		System.out.println("--------------");
		for(String s : al2) {
			System.out.println(s);
		}
	}
}





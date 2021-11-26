package collection.list;

import java.util.*;

public class ArrayListExample1 {
	public static void main(String[] args) {
		
		// String ��ü�� ���� ArrayList ����
		List<String> list = new ArrayList<String>();
		
		// String�� String ��ü�� ����ڽ̵� �� ����Ʈ�� �߰���
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2�� �ε����� Database �߰�
		list.add("iBATIS");

		int size = list.size();
		System.out.println("�� ��ü��: " + size);		
		System.out.println();
		
		String skill = list.get(2);  // 2�� �ε����� ��ü�� ������
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}	
		System.out.println();
				
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}

/*	�ε��� ��ȣ�� �ʿ� ���� ��� ���� for���� ����ϸ� �� ��
	for(String s : list) {
		System.out.println(list.indexOf(s) + ":" + s);
	}
*/






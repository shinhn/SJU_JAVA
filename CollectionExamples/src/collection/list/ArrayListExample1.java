package collection.list;

import java.util.*;

public class ArrayListExample1 {
	public static void main(String[] args) {
		
		// String 객체를 담을 ArrayList 생성
		List<String> list = new ArrayList<String>();
		
		// String이 String 객체로 오토박싱된 후 리스트에 추가됨
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 인덱스에 Database 추가
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		String skill = list.get(2);  // 2번 인덱스의 객체를 가져옮
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

/*	인덱스 번호가 필요 없을 경우 향상된 for문을 사용하면 더 편리
	for(String s : list) {
		System.out.println(list.indexOf(s) + ":" + s);
	}
*/






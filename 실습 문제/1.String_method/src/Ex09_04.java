import java.util.Scanner;

public class Ex09_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열 ==> ");
		String str = s.nextLine();
		
		System.out.print("제일 처음 나오는 Java 위치 ==> ");
		System.out.println(str.indexOf("Java"));
		
		System.out.print("마지막에 나오는 Java 위치 ==> ");
		System.out.println(str.lastIndexOf("Java"));

	}

}

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		System.out.print("문자열 입력 ==> ");
		String str = s.nextLine();
		
		System.out.print("출력 문자열 ==> ");
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='o')System.out.print("$");
			else System.out.print(str.charAt(i));
		}

	}

}

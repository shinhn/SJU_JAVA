import java.util.Scanner;

public class Problem_23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ss;
		String tt = ""; // 빈 문자열 
		
		System.out.print("문자열을 입력하세요:");
		ss = s.nextLine();
		
		for(int i=0;i<ss.length();i++)
		{
			tt += ss.charAt(ss.length() - 1 - i);
		}
		
		System.out.print("내용을 거꾸로 출력 ==> " + tt);
		

	}

}

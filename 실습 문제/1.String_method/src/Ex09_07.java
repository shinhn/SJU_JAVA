
public class Ex09_07 {

	public static void main(String[] args) {
		
		String str = "    한글    ABCD    abcd    ";
		String result = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				result += str.charAt(i);
			}
		}
		
		System.out.println("원 문자열 ==> [" + str + "]");
		System.out.println("공백제거  ==> [" + result + "]");
		
	}

}

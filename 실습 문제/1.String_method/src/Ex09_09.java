
public class Ex09_09 {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));

	}

}

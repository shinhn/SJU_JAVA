
public class Ex14_05_int_to_string {

	public static void main(String[] args) {
		
		// 래퍼 클래스 생성 
		Integer int1 = new Integer(100);
		Double dbl1 = new Double(3.14);
		Character chr1 = new Character((char)65);
		
		// 정수 -> 문자열 
		// Integer형 인스턴스의 메소드 toString() 사용 
		System.out.println(int1.toString());
		
		// 16, 8진수로 100 출력 
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
		System.out.println(dbl1.longValue());
		
		// 문자 출력 
		// Character형 인스턴스 메소드 charValue() 사용  
		System.out.println(chr1.charValue());
		
		// Float형 클래스 변수 사용 
		System.out.println(Float.MAX_VALUE);
		
		// 문자열 -> double형 
		// Double형 클래스 메소드 parseDouble() 사용 
		System.out.println(Double.parseDouble("3.14"));
		
	}

}

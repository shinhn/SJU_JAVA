public class Ex14_05 {
	public static void main(String[] args) {

		// 래퍼 클래스 생성
		//Integer int1 = new Integer(100);
		Integer int1 = Integer.valueOf(100);
		//Double dbl1 = new Double(3.14);
		Double dbl1 = Double.valueOf(3.14);
		//Character chr1 = new Character((char) 65);
		Character chr1  = Character.valueOf((char)65);

		// Integer형 인스턴스의 인스턴스 메소드 toString( )을 사용하여 정수를 문자열로 변환
		System.out.println(int1.toString());
		// Integer형 클래스 메소드를 사용하여 16진수와 8진수로 100을 출력함
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(dbl1.longValue());
		// Character형 인스턴스의 인스턴스 메소드 charValue( )를 사용하여 문자를 출력함
		System.out.println(chr1.charValue());
		// Float형 클래스의 클래스 변수를 사용함
		System.out.println(Float.MAX_VALUE);
		// Double형 클래스의 클래스 메소드 parseDouble()을 사용하여 문자열을 double형으로 변환
		System.out.println(Double.parseDouble("3.14"));
	}
}








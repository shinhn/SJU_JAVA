
public class Ex14_05_int_to_string {

	public static void main(String[] args) {
		
		// ���� Ŭ���� ���� 
		Integer int1 = new Integer(100);
		Double dbl1 = new Double(3.14);
		Character chr1 = new Character((char)65);
		
		// ���� -> ���ڿ� 
		// Integer�� �ν��Ͻ��� �޼ҵ� toString() ��� 
		System.out.println(int1.toString());
		
		// 16, 8������ 100 ��� 
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
		System.out.println(dbl1.longValue());
		
		// ���� ��� 
		// Character�� �ν��Ͻ� �޼ҵ� charValue() ���  
		System.out.println(chr1.charValue());
		
		// Float�� Ŭ���� ���� ��� 
		System.out.println(Float.MAX_VALUE);
		
		// ���ڿ� -> double�� 
		// Double�� Ŭ���� �޼ҵ� parseDouble() ��� 
		System.out.println(Double.parseDouble("3.14"));
		
	}

}

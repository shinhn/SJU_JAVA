public class Ex14_05 {
	public static void main(String[] args) {

		// ���� Ŭ���� ����
		//Integer int1 = new Integer(100);
		Integer int1 = Integer.valueOf(100);
		//Double dbl1 = new Double(3.14);
		Double dbl1 = Double.valueOf(3.14);
		//Character chr1 = new Character((char) 65);
		Character chr1  = Character.valueOf((char)65);

		// Integer�� �ν��Ͻ��� �ν��Ͻ� �޼ҵ� toString( )�� ����Ͽ� ������ ���ڿ��� ��ȯ
		System.out.println(int1.toString());
		// Integer�� Ŭ���� �޼ҵ带 ����Ͽ� 16������ 8������ 100�� �����
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(dbl1.longValue());
		// Character�� �ν��Ͻ��� �ν��Ͻ� �޼ҵ� charValue( )�� ����Ͽ� ���ڸ� �����
		System.out.println(chr1.charValue());
		// Float�� Ŭ������ Ŭ���� ������ �����
		System.out.println(Float.MAX_VALUE);
		// Double�� Ŭ������ Ŭ���� �޼ҵ� parseDouble()�� ����Ͽ� ���ڿ��� double������ ��ȯ
		System.out.println(Double.parseDouble("3.14"));
	}
}








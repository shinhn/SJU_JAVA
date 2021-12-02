
public class Ex10_04 {

	public static void main(String[] args) {
		
		int a = 100;
		
		try {
			// 오류 메시지 직접 만들기 
			if(a==100) throw new Exception("오류");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

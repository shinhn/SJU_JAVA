import java.io.IOException;

public class Ex10_08 {
	public static void main(String[] args) {
		String userName = "hanbit";
		String input = "";
		int key;

		// System.in.read() 메소드는 try ~ catch 문으로 묶여야 함
		try {
			System.out.print("이름 ==> ");
			
			// 키보드 입력을 받아 한 문자를 key에 저장함
			// enter(아스키코드 : 13)가 나올때까지 무한 반복 
			while ((key = System.in.read()) != 13) {
				// 입력한 정수형 key를 문자열로 변경하여 input에 붙임
				// 숫자는 입력해도 값이 들어가지 않게 함
				if(key >= 48 && key <= 59){
				} else{
					input += Character.toString((char)key);
				}
			}
			if (userName.equals(input))
				System.out.println(input + "님 어서오세요 ~~");
			else
				System.out.println(input + "님 등록이 안되었습니다 ~~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
import java.util.Scanner;

public class Ex10_07_next {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1, str2, str3;

		System.out.print("단어 3개 입력  : ");
		// 버퍼에서 3개의 단어를 읽어 각 변수에 저장함
		str1 = s.next();
		str2 = s.next();
		str3 = s.next();

		System.out.print("입력된 문자열 ==> ");
		System.out.print(str1 + "," + str2 + "," + str3);
	}
}
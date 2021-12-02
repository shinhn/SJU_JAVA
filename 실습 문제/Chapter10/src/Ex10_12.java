import java.io.File;
import java.util.Scanner;

public class Ex10_12 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("C:/temp/data2.txt"));
		Scanner sc = new Scanner(new File("data/data2.txt"));
		int hap = 0;

		while (sc.hasNextLine())  // 다음 행이 있으면 true 반환 
			// 파일의 내용을 정수형으로 읽어서 누적합계를 구함
			hap += sc.nextInt();  

		System.out.println("합계 : " + hap);
		sc.close();
	}
}
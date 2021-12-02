import java.io.File;
import java.util.Scanner;

public class Ex10_12 {

	public static void main(String[] args) throws Exception {
		
		// Scanner : 파일의 내용을 원하는 데이터형으로 읽음 
		// Scanner.hasNextLine() : 다음 행이 있으면 true 반환 
		// Scanner.nextInt() : 파일의 내용을 정수형으로 읽음 
		
		Scanner sc = new Scanner(new File("data/data3"));
		
		int sum=0;
		while(sc.hasNextLine()) {
			sum += sc.nextInt();
		}
		
		System.out.println("합계 : " + sum);
		
		sc.close();

	}

}

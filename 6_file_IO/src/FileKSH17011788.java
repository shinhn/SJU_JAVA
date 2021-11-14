import java.io.File;
import java.util.Scanner;

public class FileKSH17011788 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(new File("data/score.txt"));
		
		int sum=0, num=0;
		float avg;
		
		while(sc.hasNextLine())
		{
			sum+=sc.nextInt();
			num++;
		}
		
		avg = (float)sum/num;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}

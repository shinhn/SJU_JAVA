package ksh;

public class KSH_01 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		int sum = 0;
		
		for(int i=1;i<=10000;i++) {
			if(i%5==0 || i%8==0) {
				sum += i;
			}
		}
		
		long endTime = System.nanoTime();
		long estimatedTime = endTime - startTime;
		
		System.out.println("5의 배수 또는 8의 배수의 합 : " + sum);
		System.out.println("수행시간 : " + estimatedTime + " 나노 초");
		
		
		
	}

}

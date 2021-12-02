package ksh;

public class KSH_02 {

	public static void main(String[] args) {
		
		double A,i = 0.06;
		int P = 100000000, N = 5;
		
		A = P * (i * Math.pow(1+i, N) / (Math.pow(1+i, N) - 1));
		
		System.out.printf("%.6f ¿ø",A);

	}

}

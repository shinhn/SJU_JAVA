package ksh;

import java.util.Arrays;

public class KSH_1 {

	public static void main(String[] args) {
		
		float[] arr = {100, 98, 95, 92, 99, 75, 80, 96, 55, 65};
		float total=0, avg;
		
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		avg = total / arr.length;
		
		Arrays.sort(arr);
		
		System.out.printf("평균 : %.4f, 최대값 : %.4f, 최소값 : %.4f", avg, arr[0], arr[arr.length-1]);

	}

}

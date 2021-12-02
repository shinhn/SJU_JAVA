public class Ex14_06 {
	public static void main(String[] args) {

		Integer data[] = { 9, 3, 7, 2, 5 };
		Integer maxVal, minVal;
		int i, k;

		System.out.print("정렬 전 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(data[i] + "  ");

		// 모든 값을 2개씩 비교하여 작은 값을 앞으로 이동시킴
		for (i = 0; i < 4; i++) // 앞 숫자
			for (k = i; k < 5; k++) {  // 뒷 숫자
				maxVal = Math.max(data[i], data[k]);
				minVal = Math.min(data[i], data[k]);
				data[i] = minVal; // 작은 값을 앞에 저장
				data[k] = maxVal; // 큰 값을 뒤에 저장
			}

		System.out.print("\n정렬 후 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(data[i] + "  ");
	}
}











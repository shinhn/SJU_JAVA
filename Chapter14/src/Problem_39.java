public class Problem_39 {
	public static void main(String[] args) {

		Integer s[] = { 2, 3, 5, 7, 9 };
		Integer maxVal, minVal;
		int i, k;
		int count = 0;				// 회전 수
		boolean changeYN = false; 	// 값의 교환 여부 체크

		System.out.print("정렬 전 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");

		// 값이 교환되었다면 changeYN을 true로 변경하고 다음 회전 수행
		
		for (i = 0; i < 4; i++) {
			count++; // 회전 수 증가
			for (k = 0; k < 4 - i; k++) {
				if (s[k] > s[k + 1]) {
					changeYN = true; // 값이 교환됨
					maxVal = Math.max(s[k], s[k + 1]);
					minVal = Math.min(s[k], s[k + 1]);
					s[k] = minVal;
					s[k + 1] = maxVal;
				}
			}
			if (changeYN)
				changeYN = false;
			else
				break;
			// 값이 교환되지 않았다면 이미 정렬되어 있는 것이므로 for문 나감
		}

		System.out.print("\n총 회전수 : " + count);
		System.out.print("\n정렬 후 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");
	}
}




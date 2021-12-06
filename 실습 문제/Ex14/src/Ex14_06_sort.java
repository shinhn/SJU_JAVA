
public class Ex14_06_sort {

	public static void main(String[] args) {
		
		Integer maxVal, minVal;
		int i, k;
		
		// 선택 정렬 
		// 모든 값을 2개씩 비교하여 작은 값을 앞으로 이동 
		Integer data[] = {9,3,7,2,5};
		
		System.out.print("정렬 전 ==> ");
		for(i=0;i<5;i++) {
			System.out.print(data[i] + " ");
		}
		
		for(i=0;i<4;i++) {
			for(k=i;k<5;k++) {
				maxVal = Math.max(data[i], data[k]);
				minVal = Math.min(data[i], data[k]);
				data[i] = minVal;
				data[k] = maxVal;
			}
		}
		
		System.out.print("\n선택 정렬 후 ==> ");
		for(i=0;i<5;i++) {
			System.out.print(data[i] + " ");
		}
		
		// 버블 정렬 
		// 모든 값을 2개씩 비교하여 가장 큰값이 맨 뒤로 가게함 
		Integer s[] = {9,3,7,2,5};
		
		boolean changeYN = false;
		int count = 0;
		
		System.out.print("\n\n정렬 전 ==> ");
		for(i=0;i<5;i++) {
			System.out.print(s[i] + " ");
		}
		
		for(i=0;i<4;i++) {
			count++;
			for(k=0;k<4-i;k++) {
				if(s[k] > s[k+1]) {
					maxVal = Math.max(s[k], s[k+1]);
					minVal = Math.min(s[k], s[k+1]);
					s[k] = minVal;
					s[k+1] = maxVal;
					
					changeYN = true;
				}
			}
			
			// 더 나은 효율 
			// 값이 교환되지 않았다면 이미 정렬되어 있는 것이므로 for문 나감
			if(changeYN) changeYN = false;
			else break;
		}
		
		System.out.print("\n총 회전수 : " + count);
		System.out.print("\n버블 정렬 후 ==> ");
		for(i=0;i<5;i++) {
			System.out.print(s[i] + " ");
		}
		
	}

}

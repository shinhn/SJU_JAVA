
public class Ex14_06_sort {

	public static void main(String[] args) {
		
		Integer maxVal, minVal;
		int i, k;
		
		// ���� ���� 
		// ��� ���� 2���� ���Ͽ� ���� ���� ������ �̵� 
		Integer data[] = {9,3,7,2,5};
		
		System.out.print("���� �� ==> ");
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
		
		System.out.print("\n���� ���� �� ==> ");
		for(i=0;i<5;i++) {
			System.out.print(data[i] + " ");
		}
		
		// ���� ���� 
		// ��� ���� 2���� ���Ͽ� ���� ū���� �� �ڷ� ������ 
		Integer s[] = {9,3,7,2,5};
		
		boolean changeYN = false;
		int count = 0;
		
		System.out.print("\n\n���� �� ==> ");
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
			
			// �� ���� ȿ�� 
			// ���� ��ȯ���� �ʾҴٸ� �̹� ���ĵǾ� �ִ� ���̹Ƿ� for�� ����
			if(changeYN) changeYN = false;
			else break;
		}
		
		System.out.print("\n�� ȸ���� : " + count);
		System.out.print("\n���� ���� �� ==> ");
		for(i=0;i<5;i++) {
			System.out.print(s[i] + " ");
		}
		
	}

}

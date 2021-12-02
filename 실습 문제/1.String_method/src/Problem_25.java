
public class Problem_25 {
	
	static int getNumber() {
		// Math.random() : 0 ~ 1 사이의 숫자가 랜덤하게 리턴 
		// 숫자 범위 : 1 ~ 45
		return (int)(Math.random() * 45 + 1);
	}

	public static void main(String[] args) {
		
		// 교수님은 int(4byte) 대신 short(2byte) 사용
		// -> 1 ~ 45까지의 숫자만 사용하므로 큰 메모리가 필요 없기 때문
		
		int lotto[] = {0,0,0,0,0,0};
		char h;
		
		for(int i=0;i<6;i++)
		{
			h = 'o';
			int num = getNumber();
			
			for(int j=0;j<6;j++)
			{
				if(lotto[j] == num)
				{
					h = 'x';
				}
			}
			
			if(h=='o')
			{
				lotto[i] = num;
			}
		}
		
		System.out.println("** 로또 추첨을 시작합니다. **");
		System.out.print("추첨된 로또 번호 ==> ");
		for(int i=0;i<6;i++)
		{
			System.out.print("  "+lotto[i]);
		}
		

	}

}



public class Problem_25 {

	static short getNumber() {
		return (short)(Math.random() * 45 + 1);
		/* 
		 Math.random()
		 : 0.0 이상, 1.0 미만의 double 값의 난수를 균일한 분포로 반환
		 
		 
		 
		 ex) 0 ~ 9 사이의 정수형 난수를 만들고 싶다면 다음과 같이 발생된 double 형 난수에 10을 곱한 후 정수로 캐스팅
		 	
		 	double dValue = Math.random();
			int iValue = (int)(dValue * 10);

		 */

	}

	public static void main(String[] args) {
		
		System.out.println("** 로또 추첨을 시작합니다. **");
		
		short[] lotto = {0,0,0,0,0,0};
		short num,i;
		char dupl = 'N';
		
		for(i=0;i<6;)
		{
			num = getNumber();
			
			for(short k=0;k<6;k++)
			{
				if(lotto[k] == num)
				{
					dupl = 'Y';
				}
			}
			
			if(dupl == 'N')
			{
				lotto[i] = num;
				i++;
			}
			
			dupl = 'N';
		}
		
		
		System.out.print("추첨된 로또 번호 ==> ");
		for(i=0;i<6;i++)
		{
			System.out.print("   " + lotto[i]);
		}
		
	}

}

package ksh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class KSH_2 {

	public static void main(String[] args) throws Exception {
		// FileReader 클래스(문자 단위, 2byte씩 읽음)로 파일 열기
		FileReader fReader = new FileReader("data/class.txt");
		// 파일을 행단위로 읽기 위해 BufferedReader 클래스 사용
		BufferedReader bReader = new BufferedReader(fReader);
		
		// 지정한 파일이 FileWriter 형식으로 쓰기 모드로 열림
		FileWriter fw = new FileWriter("data/average.txt");

		String str = null, strAry[];
		
		double avg_k=0, avg_e=0, avg_m=0, num=0;
		
		fw.write("  국어   영어   수학\n");
		fw.write("-------------------\n");
		
		System.out.println("  국어   영어   수학");
		System.out.println("-------------------");
		
		// 파일의 끝(EOF)이라면 null을 반환
		while ((str = bReader.readLine()) != null) {
					
			strAry = str.split(",");
			
			avg_k += Double.parseDouble(strAry[0]);
			avg_e += Double.parseDouble(strAry[1]);
			avg_m += Double.parseDouble(strAry[2]);
			
			for(int i=0;i<strAry.length;i++) {
				System.out.printf("%5d",Integer.parseInt(strAry[i]));
				fw.write(strAry[i]);
				fw.write(" ");
			}
			fw.write("\n");
			System.out.println();
			
			num += 1;
		}
		fw.write("-------------------\n");
		System.out.println("-------------------");
		
		fw.write(Double.toString(avg_k/num));
		fw.write(" ");
		fw.write(Double.toString(avg_e/num));
		fw.write(" ");
		fw.write(Double.toString(avg_m/num));
		fw.write(" ");
		System.out.printf("%5.2f %5.2f %5.2f", avg_k/num, avg_e/num, avg_m/num);
		
				
		// 파일 닫기
		bReader.close();
		fReader.close();
		fw.close();

		

	}

}

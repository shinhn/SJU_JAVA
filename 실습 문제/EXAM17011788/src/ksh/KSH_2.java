package ksh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class KSH_2 {

	public static void main(String[] args) throws Exception {
		// FileReader Ŭ����(���� ����, 2byte�� ����)�� ���� ����
		FileReader fReader = new FileReader("data/class.txt");
		// ������ ������� �б� ���� BufferedReader Ŭ���� ���
		BufferedReader bReader = new BufferedReader(fReader);
		
		// ������ ������ FileWriter �������� ���� ���� ����
		FileWriter fw = new FileWriter("data/average.txt");

		String str = null, strAry[];
		
		double avg_k=0, avg_e=0, avg_m=0, num=0;
		
		fw.write("  ����   ����   ����\n");
		fw.write("-------------------\n");
		
		System.out.println("  ����   ����   ����");
		System.out.println("-------------------");
		
		// ������ ��(EOF)�̶�� null�� ��ȯ
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
		
				
		// ���� �ݱ�
		bReader.close();
		fReader.close();
		fw.close();

		

	}

}

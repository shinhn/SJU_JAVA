import java.io.*;
import java.util.*;

public class HandPhone {
	
	static String fname = "data/juso.txt";
	
	// ���� ���� Ŭ���� : Ư�� Ŭ���� ���ο����� �ַ� ���Ǵ� Ŭ���� 
	static class address{
		String name;
		String age;
		String phone;
		address(String s1, String s2, String s3){
			this.name = s1;
			this.age = s2;
			this.phone = s3;
		}
	}

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.println("\n### ģ�� ����ó ���� ###\n");
		
		while(select != "4") {
			print_menu();
			
			select = sc.next();
			switch(select) {
			case "1":
				view_juso();
				break;
			case "2":
				add_juso();
				break;
			case "3":
				delete_juso();
				break;
			case "4":
				return; // main���� ���� (main�� �ƴ� ������ ���� : System.exit(0);)
			default:
				System.out.println("\n �߸� �Է��߾��. �ٽ� �����ϼ���.\n");
			}
		}
	}
	
	static void print_menu() {
		System.out.print("\n");
		System.out.print("1. ����ó ���\n");
		System.out.print("2. ����ó ���\n");
		System.out.print("3. ����ó ����\n");
		System.out.print("4. ������\n");
	}
	
	static void view_juso() throws IOException{
		String str = "";
		 
		File f = new File(fname);
		// fname ������ ������ �� ���� ����
		if(!f.exists()) {
			// FileWriter : ������ 2byte ������ ó�� 
			// BufferedWriter : ������ ������� ó�� 
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// ���� ����ó ���
		int i;
		for(i=1;;i++) {
			if(!br.ready()) break; // ���� ���� �� ������
			else {
				str = br.readLine();
				System.out.printf("%2d:  %s\n", i, str);
			}
		}
		
		// i�� 1 : ������ ������, ������ ���ٴ� �� 
		if(i==1)System.out.print("\n ** ����ó ���Ͽ� ��ȭ��ȣ�� �ϳ��� �����. ** \n");
		
		br.close();
	}
	
	static void add_juso() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		// ������ �߰� ���� ���� 
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
		
		address adr = new address("","","");
		System.out.print("�̸��� �Է� ==> ");
		adr.name = sc.nextLine();
		System.out.print("���̸� �Է� ==> ");
		adr.age = sc.nextLine();
		System.out.print("��ȭ��ȣ�� �Է� ==> ");
		adr.phone = sc.nextLine();
		
		// �Էµ� 3���� ���� �ϳ��� ���ڿ��� ���� 
		String wstr = "";
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone;
		
		bw.write(wstr);
		bw.newLine(); // ���ٶ���� 
		
		bw.close();
	}
	
	static void delete_juso() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String[] read_str = new String[50]; // ����ó ���� ���� ��ü�� �����ϱ� ���� ���ڿ� �迭 (�ִ� 50��) 
		String str = "";
		int del_line, i, count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// ����ó ������ ������ ���� 
		if (!br.ready()) {
			System.out.printf("\n!! ����ó ������ �����ϴ�. !!\n");
			return;
		}
		
		System.out.printf("\n������ �� ��ȣ�� ? ");
		del_line = sc.nextInt();
		
		for(i=0;i<50;i++) {
			if((str = br.readLine()) == null) break;
			// ������ ���� �ƴ϶��, �߰� 
			if(i+1 != del_line) {
				read_str[count] = str;
				count ++;
			}
			else {
				System.out.printf("%d ���� �����Ǿ����ϴ�. \n", del_line);
			}
		}
		
		br.close();
		
		// ������ ���� ���� ����, ���ο� ���� �Է� 
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		
		for(i=0;i<count;i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}
		
		bw.close();
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandPhone {
	static String fname = "data/juso.txt";
	// ���� ���� Ŭ���� : Ư�� Ŭ���� �������� �ַ� ���Ǵ� Ŭ����	
	static class address {
		String name;
		String age;
		String phone;
		address(String s1, String s2, String s3) {
			this.name = s1;
			this.age = s2;
			this.phone = s3;
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.printf(" \n### ģ�� ����ó ���� ### \n");

		while (select != "4") {
			print_menu();
			select = sc.next();

			switch (select) {
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
				return;  // main ���� return�� ����
				// System.exit(0); ������ �ƴ� ������ ����
			default:
				System.out.printf("\n �߸� �Է��߾��. �ٽ� �����ϼ���.\n");
			}
		}
	}
	// ó���� ������� ������ ���� �޴� ���
	static void print_menu() {
		System.out.printf("\n");
		System.out.printf("1. ����ó ��� \n");
		System.out.printf("2. ����ó ��� \n");
		System.out.printf("3. ����ó ���� \n");
		System.out.printf("4. ������ \n");
	}
	// ����ó ���Ͽ��� ���� �Էµ� ������ �о ���
	static void view_juso() throws IOException {
		String str = "";

		// ó���� fname ������ ������ �� ���� ����
		File f = new File(fname);
		if (!f.exists()) {			
			// FileWriter : ������ 2byte ������ ó�� 
			// BufferedWriter : ������ ������� ó��
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}

		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;

		// ������ ����ó�� ��� �о ���
		for (i = 1;; i++) // i�� ��� 1�� �����ϴ� ���ѷ���
		{
			if (!br.ready()) // ������ ���� �� ������
				break;
			else {
				str = br.readLine();
				System.out.printf("%2d:  %s\n", i, str);
			}
		}
		// i�� 1�̸� ���� ���Ͽ��� ������ ����
		if (i == 1)
			System.out.printf("\n ** ����ó ���Ͽ� ��ȭ��ȣ�� �ϳ��� �����. **\n");

		br.close();
	}
	// ģ�� ����ó�� �߰�
	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		address adr = new address("", "", "");

		String wstr = "";

		// ������ �߰� ���� ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));

		System.out.printf("�̸��� �Է� ==> ");
		adr.name = sc.nextLine();
		System.out.printf("���̸� �Է� ==> ");
		adr.age = sc.nextLine();
		System.out.printf("��ȭ��ȣ�� �Է� ==> ");
		adr.phone = sc.nextLine();

		// �Էµ� 3���� ���� �ϳ��� ���ڿ��� ����
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone;

		bw.write(wstr); // ���Ͽ� ���ڿ� ����
		bw.newLine();

		bw.close();
	}
	// ����ó ���Ͽ��� ������ ����ó�� ����
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		// ����ó ������ ���� ��ü�� �����ϱ� ���� ���ڿ� �迭
		String[] read_str = new String[50]; // �ִ� ����ó ������ 50���� ����
		String str = "";
		int del_line, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));

		// ����ó ������ ������ ���ư���.
		if (!br.ready()) {
			System.out.printf("\n!! ����ó ������ �����ϴ�. !!\n");
			return;
		}

		System.out.printf("\n������ �� ��ȣ�� ? ");
		del_line = sc.nextInt();

		for (i = 0; i < 50; i++) // ���Ͽ� �ִ� ���ȿ� ����, �� �ִ� 50��
		{
			// BufferedReader  Ŭ������ readLine( ) �޼ҵ� : ������ �� ������ ����
			if ((str = br.readLine()) == null)
				break;

			if (i + 1 != del_line) // �����ϴ� ���� �ƴ϶��, �߰�
			{
				read_str[count] = str;
				count++;
			} else
				System.out.printf("%d ���� �����Ǿ����ϴ�. \n", del_line);
		}

		br.close();

		// ������ ���� ���� ����, ���ο� ������ ����.
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));

		for (i = 0; i < count; i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}

		bw.close();
	}
}







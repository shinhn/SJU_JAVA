package ksh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KSH_4 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("ģ�� ����ó ���� ���α׷�");
			this.setLayout(new FlowLayout());
			
			

			JMenuBar menuBar = new JMenuBar();

			JMenu Menu = new JMenu("ģ�� ����ó ����");

			JMenuItem Item1 = new JMenuItem("ģ�� ����ó ��� ��ȸ");
			JMenuItem Item2 = new JMenuItem("ģ�� ����ó ����");
			JMenuItem closeItem = new JMenuItem("����");

			setJMenuBar(menuBar);		// �޴��ٸ� JFrame�� ����

			menuBar.add(Menu);		// ���ϸ޴��� �޴��ٿ� ����

			Menu.add(Item1);		// �޴� �������� ���ϸ޴��� ����
			Menu.add(Item2);
			Menu.addSeparator();	// �޴� �и��� �߰�
			Menu.add(closeItem);

			String[] friend;
			
			Item1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});	
			

			
			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			
			setSize(700, 500);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		
		new MyGUI();
	}
}

/*
public class KSH_4 {
	static String fname = "data/juso.txt";
	// ���� ���� Ŭ���� : Ư�� Ŭ���� �������� �ַ� ���Ǵ� Ŭ����	
	static class address {
		String name;
		String age;
		String phone;
		String birth;
		address(String s1, String s2, String s3, String s4) {
			this.name = s1;
			this.age = s2;
			this.phone = s3;
			this.birth = s4;
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
		address adr = new address("", "", "", "");

		String wstr = "";

		// ������ �߰� ���� ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));

		System.out.printf("�̸��� �Է� ==> ");
		adr.name = sc.nextLine();
		
		String pattern = "^[0-9|a-z|A-Z|��-��|��-��|��-�R|\s]*$";
		while(!Pattern.matches(pattern, adr.name)){
		  System.out.println("Ư�����ڰ� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���. ");
		  adr.name = sc.nextLine();
		}

		System.out.printf("���̸� �Է� ==> ");
		adr.age = sc.nextLine();
		int age = Integer.parseInt(adr.age);
		
		while(age > 200) {
			System.out.println("���̴� 200�� ���� �� �����ϴ�. �ٽ� �Է��ϼ���. ");
			adr.age = sc.nextLine();
			age = Integer.parseInt(adr.age);
		}
		
		System.out.printf("��ȭ��ȣ�� �Է� ==> ");
		String number = sc.nextLine();
        
        while(true) {
        	if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}",number))break;
        	if(Pattern.matches("\\d{3}-\\d{4}-\\d{4}",number))break;
        	
        	System.out.println("��ȭ��ȣ ������ �����ּ���. �ٽ� �Է��ϼ���. ");
        	
        	number = sc.nextLine();
        }
        
        adr.phone = number;
        
        
        System.out.printf("������ �Է� ==> ");
		adr.birth = sc.nextLine();
		
		// �Էµ� 3���� ���� �ϳ��� ���ڿ��� ����
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone + "\t" + adr.birth;

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
*/

/*
String str = "...";

//���鸸 �Էµ� ���
if(str.replaceAll(" ", "").equals("")) {
  System.out.println("���鸸 �ԷµǾ����ϴ�.");
}

//Ư�����ڰ� �Էµ� ���
String pattern = "^[0-9|a-z|A-Z|��-��|��-��|��-�R|\s]*$";
if(!Pattern.matches(pattern, str)){
  System.out.println("Ư�����ڰ� �ԷµǾ����ϴ�.");
}

//���ڿ��� ���� Ȥ�� Ư�����ڰ� �Էµ� ���
String pattern = "^[0-9|a-z|A-Z|��-��|��-��|��-�R]*$";
if(!Pattern.matches(pattern, str)){
  System.out.println("���� Ȥ�� Ư�����ڰ� �ԷµǾ����ϴ�.");
}
*/

/*
���� ��¥ ���� ��ȿ�� �˻� 
public class test {
    public static void main(String[] args) {
        String exDate1 = "2021/01/01";
        String exDate2 = "20210101";
        
        System.out.println(checkDate(exDate1));
        System.out.println(checkDate(exDate2));
    }
    
    public static boolean checkDate(String checkDate) {
        try {
            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy/MM/dd"); //������ ��¥ ���� ����
            dateFormatParser.setLenient(false); //false�ϰ�� ó���� �Է��� ���� �߸��� ������ �� ������ �߻�
            dateFormatParser.parse(checkDate); //��� �� ���˿� ����Ǵ��� Ȯ��
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
*/

/*
��ȭ��ȣ ���� ��ȿ�� �˻� 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

    public static void main(String[] args) {

        String number = "010-1234-5678";
        String number2 = "010-123-45678";
        String number3 = "0101-234-5678";

        validPhoneNumber(number);
        validPhoneNumber(number2);
        validPhoneNumber(number3);
    }

    public static boolean validPhoneNumber(String number) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Valid phone number: " + number);
            return true;
        } else {
            System.out.println("Invalid. Not the form XXX-XXXX-XXX: " + number);
            return false;
        }
    }

}
*/

/*
ArrayList<String> arrayList = new ArrayList<>();

arrayList.add("Test1");
arrayList.add("Test2");
arrayList.add("Test3");

String[] array = new String[arrayList.size()];

int size=0;

for(String temp : arrayList){
  array[size++] = temp;
}

fruits.remove("apple");
*/

/*
�̸��� ���� ��ȿ�� üũ 
String pattern2 = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
String str2 = "abc_123@gmail.com";
if(Pattern.matches(pattern2, str2)) {
    System.out.println("�ùٸ� �̸��� �����Դϴ�. ");
} else {            
    System.out.println("�ùٸ� �̸��� ������ �ƴմϴ�. ");
}
*/





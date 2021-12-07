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
			setTitle("Ä£±¸ ¿¬¶ôÃ³ °ü¸® ÇÁ·Î±×·¥");
			this.setLayout(new FlowLayout());
			
			

			JMenuBar menuBar = new JMenuBar();

			JMenu Menu = new JMenu("Ä£±¸ ¿¬¶ôÃ³ °ü¸®");

			JMenuItem Item1 = new JMenuItem("Ä£±¸ ¿¬¶ôÃ³ ¸ñ·Ï Á¶È¸");
			JMenuItem Item2 = new JMenuItem("Ä£±¸ ¿¬¶ôÃ³ ÀúÀå");
			JMenuItem closeItem = new JMenuItem("Á¾·á");

			setJMenuBar(menuBar);		// ¸Ş´º¹Ù¸¦ JFrame¿¡ ºÎÂø

			menuBar.add(Menu);		// ÆÄÀÏ¸Ş´º¸¦ ¸Ş´º¹Ù¿¡ ºÎÂø

			Menu.add(Item1);		// ¸Ş´º ¾ÆÀÌÅÛÀ» ÆÄÀÏ¸Ş´º¿¡ ºÎÂø
			Menu.add(Item2);
			Menu.addSeparator();	// ¸Ş´º ºĞ¸®¼± Ãß°¡
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
	// Á¤Àû ³»ºÎ Å¬·¡½º : Æ¯Á¤ Å¬·¡½º ³»¿¡¼­¸¸ ÁÖ·Î »ç¿ëµÇ´Â Å¬·¡½º	
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
		System.out.printf(" \n### Ä£±¸ ¿¬¶ôÃ³ °ü¸® ### \n");

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
				return;  // main ¿¡¼­ returnÀº Á¾·á
				// System.exit(0); ¸ŞÀÎÀÌ ¾Æ´Ñ °÷¿¡¼­ Á¾·á
			default:
				System.out.printf("\n Àß¸ø ÀÔ·ÂÇß¾î¿ä. ´Ù½Ã ¼±ÅÃÇÏ¼¼¿ä.\n");
			}
		}
	}
	
	// Ã³À½¿¡ »ç¿ëÀÚÀÇ ¼±ÅÃÀ» À§ÇÑ ¸Ş´º Ãâ·Â
	static void print_menu() {
		System.out.printf("\n");
		System.out.printf("1. ¿¬¶ôÃ³ Ãâ·Â \n");
		System.out.printf("2. ¿¬¶ôÃ³ µî·Ï \n");
		System.out.printf("3. ¿¬¶ôÃ³ »èÁ¦ \n");
		System.out.printf("4. ³¡³»±â \n");
	}
	
	// ¿¬¶ôÃ³ ÆÄÀÏ¿¡¼­ ±âÁ¸ ÀÔ·ÂµÈ ³»¿ëÀ» ÀĞ¾î¼­ Ãâ·Â
	static void view_juso() throws IOException {
		String str = "";

		// Ã³À½¿¡ fname ÆÄÀÏÀÌ ¾øÀ¸¸é ºó ÆÄÀÏ »ı¼º
		File f = new File(fname);
		if (!f.exists()) {			
			// FileWriter : ÆÄÀÏÀ» 2byte ´ÜÀ§·Î Ã³¸® 
			// BufferedWriter : ÆÄÀÏÀ» Çà´ÜÀ§·Î Ã³¸®
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}

		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;

		// ±âÁ¸ÀÇ ¿¬¶ôÃ³¸¦ ¸ğµÎ ÀĞ¾î¼­ Ãâ·Â
		for (i = 1;; i++) // i´Â °è¼Ó 1¾¿ Áõ°¡ÇÏ´Â ¹«ÇÑ·çÇÁ
		{
			if (!br.ready()) // ÆÄÀÏÀÌ ÀĞÀ» ¼ö ¾øÀ¸¸é
				break;
			else {
				str = br.readLine();
				System.out.printf("%2d:  %s\n", i, str);
			}
		}
		// i°¡ 1ÀÌ¸é ½ÇÁ¦ ÆÄÀÏ¿¡´Â ³»¿ëÀÌ ¾øÀ½
		if (i == 1)
			System.out.printf("\n ** ¿¬¶ôÃ³ ÆÄÀÏ¿¡ ÀüÈ­¹øÈ£°¡ ÇÏ³ªµµ ¾ø¾î¿ä. **\n");

		br.close();
	}
	
	// Ä£±¸ ¿¬¶ôÃ³¸¦ Ãß°¡
	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		address adr = new address("", "", "", "");

		String wstr = "";

		// ÆÄÀÏÀ» Ãß°¡ ¸ğµå·Î ¿­±â
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));

		System.out.printf("ÀÌ¸§À» ÀÔ·Â ==> ");
		adr.name = sc.nextLine();
		
		String pattern = "^[0-9|a-z|A-Z|¤¡-¤¾|¤¿-¤Ó|°¡-ÆR|\s]*$";
		while(!Pattern.matches(pattern, adr.name)){
		  System.out.println("Æ¯¼ö¹®ÀÚ°¡ ÀÔ·ÂµÇ¾ú½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä. ");
		  adr.name = sc.nextLine();
		}

		System.out.printf("³ªÀÌ¸¦ ÀÔ·Â ==> ");
		adr.age = sc.nextLine();
		int age = Integer.parseInt(adr.age);
		
		while(age > 200) {
			System.out.println("³ªÀÌ´Â 200À» ³ÑÀ» ¼ö ¾ø½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä. ");
			adr.age = sc.nextLine();
			age = Integer.parseInt(adr.age);
		}
		
		System.out.printf("ÀüÈ­¹øÈ£¸¦ ÀÔ·Â ==> ");
		String number = sc.nextLine();
        
        while(true) {
        	if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}",number))break;
        	if(Pattern.matches("\\d{3}-\\d{4}-\\d{4}",number))break;
        	
        	System.out.println("ÀüÈ­¹øÈ£ Çü½ÄÀ» ÁöÄÑÁÖ¼¼¿ä. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä. ");
        	
        	number = sc.nextLine();
        }
        
        adr.phone = number;
        
        
        System.out.printf("»ıÀÏÀ» ÀÔ·Â ==> ");
		adr.birth = sc.nextLine();
		
		// ÀÔ·ÂµÈ 3°³ÀÇ °ªÀ» ÇÏ³ªÀÇ ¹®ÀÚ¿­·Î ¸¸µê
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone + "\t" + adr.birth;

		bw.write(wstr); // ÆÄÀÏ¿¡ ¹®ÀÚ¿­ ¾²±â
		bw.newLine();

		bw.close();
	}
	
	// ¿¬¶ôÃ³ ÆÄÀÏ¿¡¼­ ¼±ÅÃÇÑ ¿¬¶ôÃ³¸¦ Á¦°Å
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		// ¿¬¶ôÃ³ ÆÄÀÏÀÇ ³»¿ë ÀüÃ¼¸¦ ÀúÀåÇÏ±â À§ÇÑ ¹®ÀÚ¿­ ¹è¿­
		String[] read_str = new String[50]; // ÃÖ´ë ¿¬¶ôÃ³ °³¼ö¸¦ 50°³·Î °¡Á¤
		String str = "";
		int del_line, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));

		// ¿¬¶ôÃ³ ÆÄÀÏÀÌ ¾øÀ¸¸é µ¹¾Æ°£´Ù.
		if (!br.ready()) {
			System.out.printf("\n!! ¿¬¶ôÃ³ ÆÄÀÏÀÌ ¾ø½À´Ï´Ù. !!\n");
			return;
		}

		System.out.printf("\n»èÁ¦ÇÒ Çà ¹øÈ£´Â ? ");
		del_line = sc.nextInt();

		for (i = 0; i < 50; i++) // ÆÄÀÏ¿¡ ÀÖ´Â µ¿¾È¿¡ ¼öÇà, ´Ü ÃÖ´ë 50°³
		{
			// BufferedReader  Å¬·¡½ºÀÇ readLine( ) ¸Ş¼Òµå : ÆÄÀÏÀ» Çà ´ÜÀ§·Î ÀĞÀ½
			if ((str = br.readLine()) == null)
				break;

			if (i + 1 != del_line) // »èÁ¦ÇÏ´Â ÇàÀÌ ¾Æ´Ï¶ó¸é, Ãß°¡
			{
				read_str[count] = str;
				count++;
			} else
				System.out.printf("%d ÇàÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù. \n", del_line);
		}

		br.close();

		// ÆÄÀÏÀ» ¾²±â ¸ğµå·Î ¿­°í, »õ·Î¿î ³»¿ëÀ» ¾´´Ù.
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

//°ø¹é¸¸ ÀÔ·ÂµÈ °æ¿ì
if(str.replaceAll(" ", "").equals("")) {
  System.out.println("°ø¹é¸¸ ÀÔ·ÂµÇ¾ú½À´Ï´Ù.");
}

//Æ¯¼ö¹®ÀÚ°¡ ÀÔ·ÂµÈ °æ¿ì
String pattern = "^[0-9|a-z|A-Z|¤¡-¤¾|¤¿-¤Ó|°¡-ÆR|\s]*$";
if(!Pattern.matches(pattern, str)){
  System.out.println("Æ¯¼ö¹®ÀÚ°¡ ÀÔ·ÂµÇ¾ú½À´Ï´Ù.");
}

//¹®ÀÚ¿­¿¡ °ø¹é È¤Àº Æ¯¼ö¹®ÀÚ°¡ ÀÔ·ÂµÈ °æ¿ì
String pattern = "^[0-9|a-z|A-Z|¤¡-¤¾|¤¿-¤Ó|°¡-ÆR]*$";
if(!Pattern.matches(pattern, str)){
  System.out.println("°ø¹é È¤Àº Æ¯¼ö¹®ÀÚ°¡ ÀÔ·ÂµÇ¾ú½À´Ï´Ù.");
}
*/

/*
»ıÀÏ ³¯Â¥ Çü½Ä À¯È¿¼º °Ë»ç 
public class test {
    public static void main(String[] args) {
        String exDate1 = "2021/01/01";
        String exDate2 = "20210101";
        
        System.out.println(checkDate(exDate1));
        System.out.println(checkDate(exDate2));
    }
    
    public static boolean checkDate(String checkDate) {
        try {
            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy/MM/dd"); //°ËÁõÇÒ ³¯Â¥ Æ÷¸Ë ¼³Á¤
            dateFormatParser.setLenient(false); //falseÀÏ°æ¿ì Ã³¸®½Ã ÀÔ·ÂÇÑ °ªÀÌ Àß¸øµÈ Çü½ÄÀÏ ½Ã ¿À·ù°¡ ¹ß»ı
            dateFormatParser.parse(checkDate); //´ë»ó °ª Æ÷¸Ë¿¡ Àû¿ëµÇ´ÂÁö È®ÀÎ
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
*/

/*
ÀüÈ­¹øÈ£ Çü½Ä À¯È¿¼º °Ë»ç 
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
ÀÌ¸ŞÀÏ Çü½Ä À¯È¿¿Í Ã¼Å© 
String pattern2 = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
String str2 = "abc_123@gmail.com";
if(Pattern.matches(pattern2, str2)) {
    System.out.println("¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏ Çü½ÄÀÔ´Ï´Ù. ");
} else {            
    System.out.println("¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏ Çü½ÄÀÌ ¾Æ´Õ´Ï´Ù. ");
}
*/





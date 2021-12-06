import java.io.*;
import java.util.*;

public class HandPhone {
	
	static String fname = "data/juso.txt";
	
	// 정적 내부 클래스 : 특정 클래스 내부에서만 주로 사용되는 클래스 
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
		System.out.println("\n### 친구 연락처 관리 ###\n");
		
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
				return; // main에서 종료 (main이 아닌 곳에서 종료 : System.exit(0);)
			default:
				System.out.println("\n 잘못 입력했어요. 다시 선택하세요.\n");
			}
		}
	}
	
	static void print_menu() {
		System.out.print("\n");
		System.out.print("1. 연락처 출력\n");
		System.out.print("2. 연락처 등록\n");
		System.out.print("3. 연락처 삭제\n");
		System.out.print("4. 끝내기\n");
	}
	
	static void view_juso() throws IOException{
		String str = "";
		 
		File f = new File(fname);
		// fname 파일이 없으면 빈 파일 생성
		if(!f.exists()) {
			// FileWriter : 파일을 2byte 단위로 처리 
			// BufferedWriter : 파일을 행단위로 처리 
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// 기존 연락처 출력
		int i;
		for(i=1;;i++) {
			if(!br.ready()) break; // 파일 읽을 수 없으면
			else {
				str = br.readLine();
				System.out.printf("%2d:  %s\n", i, str);
			}
		}
		
		// i가 1 : 파일은 있지만, 내용이 없다는 뜻 
		if(i==1)System.out.print("\n ** 연락처 파일에 전화번호가 하나도 없어요. ** \n");
		
		br.close();
	}
	
	static void add_juso() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		// 파일을 추가 모드로 열기 
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
		
		address adr = new address("","","");
		System.out.print("이름을 입력 ==> ");
		adr.name = sc.nextLine();
		System.out.print("나이를 입력 ==> ");
		adr.age = sc.nextLine();
		System.out.print("전화번호를 입력 ==> ");
		adr.phone = sc.nextLine();
		
		// 입력된 3개의 값을 하나의 문자열로 만듦 
		String wstr = "";
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone;
		
		bw.write(wstr);
		bw.newLine(); // 한줄띄어줌 
		
		bw.close();
	}
	
	static void delete_juso() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String[] read_str = new String[50]; // 연락처 파일 내용 전체를 저장하기 위한 문자열 배열 (최대 50개) 
		String str = "";
		int del_line, i, count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// 연락처 파일이 없으면 리턴 
		if (!br.ready()) {
			System.out.printf("\n!! 연락처 파일이 없습니다. !!\n");
			return;
		}
		
		System.out.printf("\n삭제할 행 번호는 ? ");
		del_line = sc.nextInt();
		
		for(i=0;i<50;i++) {
			if((str = br.readLine()) == null) break;
			// 삭제할 행이 아니라면, 추가 
			if(i+1 != del_line) {
				read_str[count] = str;
				count ++;
			}
			else {
				System.out.printf("%d 행이 삭제되었습니다. \n", del_line);
			}
		}
		
		br.close();
		
		// 파일을 쓰기 모드로 열고, 새로운 내용 입력 
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		
		for(i=0;i<count;i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}
		
		bw.close();
	}

}

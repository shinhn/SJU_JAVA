import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandPhone {
	static String fname = "data/juso.txt";
	// 정적 내부 클래스 : 특정 클래스 내에서만 주로 사용되는 클래스	
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
		System.out.printf(" \n### 친구 연락처 관리 ### \n");

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
				return;  // main 에서 return은 종료
				// System.exit(0); 메인이 아닌 곳에서 종료
			default:
				System.out.printf("\n 잘못 입력했어요. 다시 선택하세요.\n");
			}
		}
	}
	
	// 처음에 사용자의 선택을 위한 메뉴 출력
	static void print_menu() {
		System.out.printf("\n");
		System.out.printf("1. 연락처 출력 \n");
		System.out.printf("2. 연락처 등록 \n");
		System.out.printf("3. 연락처 삭제 \n");
		System.out.printf("4. 끝내기 \n");
	}
	
	// 연락처 파일에서 기존 입력된 내용을 읽어서 출력
	static void view_juso() throws IOException {
		String str = "";

		// 처음에 fname 파일이 없으면 빈 파일 생성
		File f = new File(fname);
		if (!f.exists()) {			
			// FileWriter : 파일을 2byte 단위로 처리 
			// BufferedWriter : 파일을 행단위로 처리
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}

		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;

		// 기존의 연락처를 모두 읽어서 출력
		for (i = 1;; i++) // i는 계속 1씩 증가하는 무한루프
		{
			if (!br.ready()) // 파일이 읽을 수 없으면
				break;
			else {
				str = br.readLine();
				System.out.printf("%2d:  %s\n", i, str);
			}
		}
		// i가 1이면 실제 파일에는 내용이 없음
		if (i == 1)
			System.out.printf("\n ** 연락처 파일에 전화번호가 하나도 없어요. **\n");

		br.close();
	}
	
	// 친구 연락처를 추가
	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		address adr = new address("", "", "");

		String wstr = "";

		// 파일을 추가 모드로 열기
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));

		System.out.printf("이름을 입력 ==> ");
		adr.name = sc.nextLine();
		System.out.printf("나이를 입력 ==> ");
		adr.age = sc.nextLine();
		System.out.printf("전화번호를 입력 ==> ");
		adr.phone = sc.nextLine();

		// 입력된 3개의 값을 하나의 문자열로 만듦
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone;

		bw.write(wstr); // 파일에 문자열 쓰기
		bw.newLine();

		bw.close();
	}
	
	// 연락처 파일에서 선택한 연락처를 제거
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		// 연락처 파일의 내용 전체를 저장하기 위한 문자열 배열
		String[] read_str = new String[50]; // 최대 연락처 개수를 50개로 가정
		String str = "";
		int del_line, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));

		// 연락처 파일이 없으면 돌아간다.
		if (!br.ready()) {
			System.out.printf("\n!! 연락처 파일이 없습니다. !!\n");
			return;
		}

		System.out.printf("\n삭제할 행 번호는 ? ");
		del_line = sc.nextInt();

		for (i = 0; i < 50; i++) // 파일에 있는 동안에 수행, 단 최대 50개
		{
			// BufferedReader  클래스의 readLine( ) 메소드 : 파일을 행 단위로 읽음
			if ((str = br.readLine()) == null)
				break;

			if (i + 1 != del_line) // 삭제하는 행이 아니라면, 추가
			{
				read_str[count] = str;
				count++;
			} else
				System.out.printf("%d 행이 삭제되었습니다. \n", del_line);
		}

		br.close();

		// 파일을 쓰기 모드로 열고, 새로운 내용을 쓴다.
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));

		for (i = 0; i < count; i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}

		bw.close();
	}
}

/*
String str = "...";

//공백만 입력된 경우
if(str.replaceAll(" ", "").equals("")) {
  System.out.println("공백만 입력되었습니다.");
}

//특수문자가 입력된 경우
String pattern = "^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣|\s]*$";
if(!Pattern.matches(pattern, str)){
  System.out.println("특수문자가 입력되었습니다.");
}

//문자열에 공백 혹은 특수문자가 입력된 경우
String pattern = "^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$";
if(!Pattern.matches(pattern, str)){
  System.out.println("공백 혹은 특수문자가 입력되었습니다.");
}
*/

/*
생일 날짜 형식 유효성 검사 
public class test {
    public static void main(String[] args) {
        String exDate1 = "2021/01/01";
        String exDate2 = "20210101";
        
        System.out.println(checkDate(exDate1));
        System.out.println(checkDate(exDate2));
    }
    
    public static boolean checkDate(String checkDate) {
        try {
            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy/MM/dd"); //검증할 날짜 포맷 설정
            dateFormatParser.setLenient(false); //false일경우 처리시 입력한 값이 잘못된 형식일 시 오류가 발생
            dateFormatParser.parse(checkDate); //대상 값 포맷에 적용되는지 확인
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
*/

/*
전화번호 형식 유효성 검사 
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
이메일 형식 유효와 체크 
String pattern2 = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
String str2 = "abc_123@gmail.com";
if(Pattern.matches(pattern2, str2)) {
    System.out.println("올바른 이메일 형식입니다. ");
} else {            
    System.out.println("올바른 이메일 형식이 아닙니다. ");
}
*/





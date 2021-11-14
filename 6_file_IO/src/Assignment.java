import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assignment {

	public static void main(String[] args) throws Exception {
		// win.ini 파일을 읽어
		// 소문자는 대문자로, 대문자는 소문자로 변경하고,그 외의 숫자나 공백, 특수문자는 모두 *로 표시

		FileReader fReader = new FileReader("/Users/kangshinhyeon/Documents/github/SJU_JAVA/6_file_IO/win.ini");

		BufferedReader bReader = new BufferedReader(fReader);

		String str = null, str2 = "";
		int i = 1;

		while ((str = bReader.readLine()) != null) {
			System.out.print("변경전 " + i + "행 : ");
			System.out.println(str);

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
					str2 += (char) (str.charAt(j) + ('A' - 'a'));
				} else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
					str2 += (char) (str.charAt(j) - ('A' - 'a'));
				} else {
					str2 += '*';
				}
			}

			System.out.print("변경후 " + i + "행 : ");
			System.out.println(str2);
			System.out.println();
			i++;
			str2 = "";
		}

		// 파일 닫기
		bReader.close();
		fReader.close();

	}

}

import java.io.PrintWriter;

public class Problem_27 {

	public static void main(String[] args) throws Exception {
		int i, k;
		// �ֿܼ� ��µǴ� ��� ���Ͽ� ����
		PrintWriter pw = new PrintWriter("data/gugu.txt");
		String str = "";

		for (i = 2; i <= 9; i++)
			str += " #��" + i + "��#";

		pw.println(str);
		pw.println();
		str = "";

		for (i = 1; i <= 9; i++) {
			for (k = 2; k <= 9; k++) {
				str += String.format("%2dX%2d=%2d", k, i, k * i);
			}
			pw.println(str);
			str = "";
		}
		pw.close();
	}
}
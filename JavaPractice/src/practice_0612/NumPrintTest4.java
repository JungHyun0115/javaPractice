package practice_0612;

import java.util.Scanner;

public class NumPrintTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 입력: ");
			String stc = sc.nextLine();
			System.out.println(stc);

			if (stc.equals("q"))
				break;

		}
		sc.close();
	}

}

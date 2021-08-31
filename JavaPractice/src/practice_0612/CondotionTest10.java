package practice_0612;

import java.util.Scanner;

public class CondotionTest10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = sc.nextInt();

		switch (year % 12) {
		case 0:
			System.out.println(year + "년은 원숭이의 해");
			break;
		case 1:
			System.out.println(year + "년은 닭의 해");
			break;
		case 2:
			System.out.println(year + "년은 개의 해");
			break;
		case 3:
			System.out.println(year + "년은 돼지의 해");
			break;
		case 4:
			System.out.println(year + "년은 쥐의 해");
			break;
		case 5:
			System.out.println(year + "년은 소의 해");
			break;
		case 6:
			System.out.println(year + "년은 호랑이의 해");
			break;
		case 7:
			System.out.println(year + "년은 토끼의 해");
			break;
		case 8:
			System.out.println(year + "년은 용의 해");
			break;
		case 9:
			System.out.println(year + "년은 뱀의 해");
			break;
		case 10:
			System.out.println(year + "년은 말의 해");
			break;
		case 11:
			System.out.println(year + "년은 양의 해");
			break;

		}
		
		sc.close();

	}
}

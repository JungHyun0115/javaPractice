package practice_0612;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6월 할일 입력");

		ArrayList<String> schedule = new ArrayList<>(30);
		for (int i = 0; i < 30; i++) {
			schedule.add("a");
		}

		while (true) {
			System.out.print("날짜 입력 : ");
			int date = sc.nextInt();
			if (date == 31) {
				System.out.println("스케쥴러 종료");
				break;
			}
			date = date - 1;

			System.out.print("할 일 입력 : ");
			String work = sc.next();

			schedule.set(date, work);

			System.out.print("검색할 날짜 : ");
			int searchDate = sc.nextInt();
			searchDate = searchDate - 1;

			if (schedule.get(searchDate).equals("a")) {
				System.out.println((searchDate + 1) + "일의 할 일이 없습니다.");
			} else {
				System.out.println((searchDate + 1) + "일의 할 일 : " + schedule.get(searchDate));
			}

		}
		sc.close();
	}

}

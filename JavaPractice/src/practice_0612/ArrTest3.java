package practice_0612;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6�� ���� �Է�");

		ArrayList<String> schedule = new ArrayList<>(30);
		for (int i = 0; i < 30; i++) {
			schedule.add("a");
		}

		while (true) {
			System.out.print("��¥ �Է� : ");
			int date = sc.nextInt();
			if (date == 31) {
				System.out.println("�����췯 ����");
				break;
			}
			date = date - 1;

			System.out.print("�� �� �Է� : ");
			String work = sc.next();

			schedule.set(date, work);

			System.out.print("�˻��� ��¥ : ");
			int searchDate = sc.nextInt();
			searchDate = searchDate - 1;

			if (schedule.get(searchDate).equals("a")) {
				System.out.println((searchDate + 1) + "���� �� ���� �����ϴ�.");
			} else {
				System.out.println((searchDate + 1) + "���� �� �� : " + schedule.get(searchDate));
			}

		}
		sc.close();
	}

}

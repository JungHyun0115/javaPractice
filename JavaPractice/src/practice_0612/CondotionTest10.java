package practice_0612;

import java.util.Scanner;

public class CondotionTest10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		int year = sc.nextInt();

		switch (year % 12) {
		case 0:
			System.out.println(year + "���� �������� ��");
			break;
		case 1:
			System.out.println(year + "���� ���� ��");
			break;
		case 2:
			System.out.println(year + "���� ���� ��");
			break;
		case 3:
			System.out.println(year + "���� ������ ��");
			break;
		case 4:
			System.out.println(year + "���� ���� ��");
			break;
		case 5:
			System.out.println(year + "���� ���� ��");
			break;
		case 6:
			System.out.println(year + "���� ȣ������ ��");
			break;
		case 7:
			System.out.println(year + "���� �䳢�� ��");
			break;
		case 8:
			System.out.println(year + "���� ���� ��");
			break;
		case 9:
			System.out.println(year + "���� ���� ��");
			break;
		case 10:
			System.out.println(year + "���� ���� ��");
			break;
		case 11:
			System.out.println(year + "���� ���� ��");
			break;

		}
		
		sc.close();

	}
}

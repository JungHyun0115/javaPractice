package practice_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Resevation {

	static ArrayList<String> Sarray = new ArrayList<String>();
	static ArrayList<String> Aarray = new ArrayList<String>();
	static ArrayList<String> Barray = new ArrayList<String>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�����潺 �ܼ�Ʈ ���� �ý����Դϴ�.");

		while (true) {
			System.out.println();
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int num = sc.nextInt();
			if (num == 4)
				break;

			if (num > 4)
				System.out.println("�߸��� ��ȣ �ٽ� �Է� ");

			if (num == 1)
				reserveSeat();

			if (num == 2)
				view();

			if (num == 3)
				cancle();

		}

	}

	public static void reserveSeat() {
		Scanner sc1 = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			Sarray.add("  __  ");
		}
		for (int i = 0; i < 10; i++) {
			Aarray.add("  __  ");
		}
		for (int i = 0; i < 10; i++) {
			Barray.add("  __  ");
		}

		System.out.print("�¼����� S(1), A(2), B(3) >>> ");
		int seat = sc1.nextInt();
		switch (seat) {
		case 1:
			System.out.println("S>> __ __ __ __ __ __ __ __ __ __");
			break;

		case 2:
			System.out.println("A>> __ __ __ __ __ __ __ __ __ __");
			break;

		case 3:
			System.out.println("B>> __ __ __ __ __ __ __ __ __ __");
			break;

		default:
			System.out.println("�߸��� ��ȣ �Է�");
		}

		System.out.print("�̸� >> ");
		String name = sc1.next();
		System.out.print("��ȣ >> ");
		int seatNum = sc1.nextInt();

		if (seat == 1) {
			Sarray.set(seatNum - 1, name);
		}

		if (seat == 2) {
			Aarray.set(seatNum - 1, name);
		}

		if (seat == 3) {
			Barray.set(seatNum - 1, name);
		}

	}

	public static void view() {

		System.out.print("S >> ");
		for (String list : Sarray) {
			System.out.print(list);
		}
		System.out.println();

		System.out.print("A >> ");
		for (String list : Aarray) {
			System.out.print(list);
		}
		System.out.println();
		System.out.print("B >> ");
		for (String list : Barray) {
			System.out.print(list);
		}
		
		System.out.println("\n<<<��ȸ�� �޷��Ͽ����ϴ�.>>>");
	}

	public static void cancle() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("�¼� S:1, A:2, B:3 >>> ");
		int seatNum = sc2.nextInt();

		if (seatNum == 1) {
			System.out.print("S >> ");
			for (String list : Sarray) {
				System.out.print(list);
			}
			System.out.println();
			System.out.print("�̸� >> ");
			String name = sc2.next();

			for (int i = 0; i < 10; i++) {
				if (Sarray.contains(name)) {
					Sarray.set(i, "  __  ");
				}
			}

		} else if (seatNum == 2) {
			System.out.print("A >> ");
			for (String list : Aarray) {
				System.out.print(list);
			}
			System.out.println();
			System.out.print("�̸� >> ");
			String name = sc2.next();

			for (int i = 0; i < 10; i++) {
				if (Aarray.contains(name)) {
					Aarray.set(i, "  __  ");
				}
			}

		} else if (seatNum == 3) {
			System.out.print("B >> ");
			for (String list : Barray) {
				System.out.print(list);
			}
			System.out.println();
			System.out.print("�̸� >> ");
			String name = sc2.next();

			for (int i = 0; i < 10; i++) {
				if (Barray.contains(name)) {
					Barray.set(i, "  __  ");
				}
			}
		} else {
			System.out.println("�߸� �Է�");
			return;
		}

	}
}
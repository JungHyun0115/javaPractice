package practice_0612;

import java.util.Random;
import java.util.Scanner;

public class ArrTest15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String computer[] = { "����", "����", "��" };
	

		while (true) {
			Random ran = new Random();
			int randNum = ran.nextInt(computer.length);
			String com = computer[randNum];
			
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			String user = sc.next();

			if (user.equals("�׸�")) {
				break;
			}

			System.out.print("���� ���� ��! >>" + user);
			System.out.println();
			System.out.print("����� = " + user + ", ��ǻ�� = " + com + " ");

			if (user.equals(com)) {
				System.out.println("�����ϴ�. ");
			}

			if (user.equals("����")) {
				if (com.equals("��")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				} else if (com.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}

			}

			if (user.equals("����")) {
				if (com.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				} else if (com.equals("��")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}

			if (user.equals("��")) {
				if (com.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");

				} else if (com.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");

				}
			}

			System.out.println();
		}
		System.out.println("������ �����մϴ�.");
		sc.close();
	}
}

package practice_0612;

import java.util.Scanner;

public class ArrTest13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		int i = 0;
		while (true) {

			System.out.print("���� �̸� : ");
			String sub = sc.next();

			if (sub.equals("�׸�")) {
				break;
			}

			for (i = 0; i < course.length; i++) {
				if (course[i].equals(sub)) {
					System.out.println(course[i] + "������ ������ " + score[i]);
					break;
				}

			}
			i++;
			if (i>5) {
				System.out.println("���� �����Դϴ�.");
			}

		}

		sc.close();
	}
}

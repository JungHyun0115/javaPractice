package practice_0612;

import java.util.Scanner;

public class ArrTest11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			boolean isExit = false;
			System.out.print("���� �̸� : ");
			String sub = sc.nextLine();

			if (sub.equals("�׸�")) {
				break;
			}

			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(sub)) {
					System.out.println(sub + "�� ������ " + score[i]);
					isExit = true;
					break;
				}
			}
			if(!isExit) {
				System.out.println("���� �����Դϴ�.");	
			}

		}
		sc.close();
	}
}

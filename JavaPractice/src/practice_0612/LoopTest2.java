package practice_0612;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� ��õ �� �Է� : ");
		String name = sc.next();
		int star = sc.nextInt();

		System.out.print(name + " ");
		for (int i = 0; i < star; i++) {
			System.out.print("�� ");
		}

	}

}

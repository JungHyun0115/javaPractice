package practice_0612;

import java.util.Scanner;

public class LoopTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;

		System.out.print("A�� ���� �Է� : ");
		for (int i = 0; i < 3; i++) {
			int score = sc.nextInt();
			sum = sum + score;
		}
		System.out.println("A�� ��� : " + sum/3);
		
		System.out.print("B�� ���� �Է� : ");
		for (int i = 0; i < 3; i++) {
			int score = sc.nextInt();
			sum2 = sum2 + score;
		}
		System.out.println("B�� ��� : " + sum2/3);
	}

}

package practice_0612;

import java.util.Scanner;

public class MinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;

		System.out.print("���� �Է� : ");
		int a = sc.nextInt();

		System.out.print("���� �Է� : ");
		int b = sc.nextInt();

		System.out.print("���� �Է� : ");
		int c = sc.nextInt();

		if (a < b) {
			if (a < c) {
				result = a;
			}
		}
		if (b < a) {
			if (b < c) {
				result = b;
			}
		}
		if (c < a) {
			if (c < b) {
				result = c;
			}
		}

		System.out.println("�ּҰ� : " + result);

	}

}

package practice_0612;

import java.util.Scanner;

public class MinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;

		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		System.out.print("정수 입력 : ");
		int b = sc.nextInt();

		System.out.print("정수 입력 : ");
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

		System.out.println("최소값 : " + result);

	}

}

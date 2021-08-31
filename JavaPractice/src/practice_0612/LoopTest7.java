package practice_0612;

import java.util.Scanner;

public class LoopTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;

		System.out.print("A반 성적 입력 : ");
		for (int i = 0; i < 3; i++) {
			int score = sc.nextInt();
			sum = sum + score;
		}
		System.out.println("A반 평균 : " + sum/3);
		
		System.out.print("B반 성적 입력 : ");
		for (int i = 0; i < 3; i++) {
			int score = sc.nextInt();
			sum2 = sum2 + score;
		}
		System.out.println("B반 평균 : " + sum2/3);
	}

}

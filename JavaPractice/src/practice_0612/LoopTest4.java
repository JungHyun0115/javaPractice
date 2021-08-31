package practice_0612;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopTest4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력받아 가장 큰 수를 출력하시오");
		int num = 0;

		System.out.print("정수 5개 입력 : ");
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			list.add(num);
		}
		
		int max = list.get(0);
		for (int i = 0; i < 5; i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		System.out.println("=> 가장 큰 수는 " + max + "입니다.");
	}

}

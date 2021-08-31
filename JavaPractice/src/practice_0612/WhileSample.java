package practice_0612;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

		while (true) {
			System.out.print("정수 입력: ");
			int a = sc.nextInt();

			list.add(a);

			if (a == 0) {
				break;
			}

		}

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}

		System.out.println("수의 개수는 " + list.size() + "개 이며 평균은 " + (sum / list.size()));
		sc.close();
	}

}

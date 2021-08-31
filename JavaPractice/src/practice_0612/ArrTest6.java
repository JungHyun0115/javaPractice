package practice_0612;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 몇 개 ? ");
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>(num);

		for (int i = 0; i < num; i++) {
			list.add(0);
		}

		for (int i = 0; i < num; i++) {
			int j = (int) (Math.random() * 100 + 1);
			if (list.get(i) == j) {
				i--;
				break;
			}
			list.set(i, j);

			System.out.print(list.get(i) + " ");
		}

		sc.close();
	}

}

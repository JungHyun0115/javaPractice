package practice_0612;

import java.util.Random;

public class NumPrintTest6 {

	public static void main(String[] args) {
		System.out.println("5���� ���� ���� ������(����) ���");

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			System.out.print(random.nextInt(100) + " ");
		}

	}

}

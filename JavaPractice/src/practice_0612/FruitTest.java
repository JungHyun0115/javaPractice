package practice_0612;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("lemon, watermelon, strawberry �� 1���� �Է��Ͻÿ� : ");
		String fruit = sc.nextLine();

		if (fruit.equals("lemon")) {
			System.out.println("����~��");
		} else if (fruit.equals("watermelon")) {
			System.out.println("�ް� �ÿ���~~");
		} else if(fruit.equals("strawberry")) {
			System.out.println("����~~ ����~");
		} else {
			System.out.println("�� �𸣴� �����̳׿�~");
		}

	}

}

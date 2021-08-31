package practice_0612;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("lemon, watermelon, strawberry 중 1개를 입력하시오 : ");
		String fruit = sc.nextLine();

		if (fruit.equals("lemon")) {
			System.out.println("아이~셔");
		} else if (fruit.equals("watermelon")) {
			System.out.println("달고 시원해~~");
		} else if(fruit.equals("strawberry")) {
			System.out.println("달콤~~ 새콤~");
		} else {
			System.out.println("잘 모르는 과일이네요~");
		}

	}

}

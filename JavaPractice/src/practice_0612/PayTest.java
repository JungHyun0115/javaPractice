package practice_0612;

import java.util.Scanner;

public class PayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("호봉을 입력하시오 : ");

		int hobong = sc.nextInt();

		switch (hobong) {
		case 1:
			System.out.println("1호봉이므로 상여금은 30만원");
			break;

		case 2:
			System.out.println("2호봉이므로 상여금은 50만원");
			break;

		case 3:
			System.out.println("3호봉이므로 상여금은 70만원");
			break;

		case 4:
			System.out.println("4호봉이므로 상여금은 90만원");
			break;

		default:
			System.out.println("잘못된 입력");
			

		}
		
		sc.close();
		
	}

}

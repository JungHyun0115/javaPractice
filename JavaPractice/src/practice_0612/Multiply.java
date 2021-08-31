package practice_0612;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("곱하고자 하는 두 수 입력 >> ");
			int num1 = 0;
			int num2 = 0;

			try {
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + "x" + num2 + "= " + num1 * num2);
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("실수는 입력하면 안됩니다.");
			//	System.out.println(e.getClass().getName() + "예외가 " + e.getMessage() + "때문에 발생");

			}
			
		}
		
	}

}

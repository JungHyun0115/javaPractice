package practice_0612;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
			int num1 = 0;
			int num2 = 0;

			try {
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + "x" + num2 + "= " + num1 * num2);
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			//	System.out.println(e.getClass().getName() + "���ܰ� " + e.getMessage() + "������ �߻�");

			}
			
		}
		
	}

}

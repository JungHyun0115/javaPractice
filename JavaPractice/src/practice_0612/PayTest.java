package practice_0612;

import java.util.Scanner;

public class PayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȣ���� �Է��Ͻÿ� : ");

		int hobong = sc.nextInt();

		switch (hobong) {
		case 1:
			System.out.println("1ȣ���̹Ƿ� �󿩱��� 30����");
			break;

		case 2:
			System.out.println("2ȣ���̹Ƿ� �󿩱��� 50����");
			break;

		case 3:
			System.out.println("3ȣ���̹Ƿ� �󿩱��� 70����");
			break;

		case 4:
			System.out.println("4ȣ���̹Ƿ� �󿩱��� 90����");
			break;

		default:
			System.out.println("�߸��� �Է�");
			

		}
		
		sc.close();
		
	}

}

package practice_0612;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopTest4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է¹޾� ���� ū ���� ����Ͻÿ�");
		int num = 0;

		System.out.print("���� 5�� �Է� : ");
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

		System.out.println("=> ���� ū ���� " + max + "�Դϴ�.");
	}

}

package practice_0612;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");

		while (true) {
			System.out.print("���� �Է�: ");
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

		System.out.println("���� ������ " + list.size() + "�� �̸� ����� " + (sum / list.size()));
		sc.close();
	}

}

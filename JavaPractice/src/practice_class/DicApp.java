//�ܾ� ���� ���α׷�
package practice_class;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String world) {
		String ans = "";
		int i = 0;
		for (i = 0; i < 5; i++) {
			if (world.equals(kor[i])) {
				ans = eng[i];
				System.out.println(world + "�� " + ans);
				break;
			}
		}
		i++;
		if (i > 5) {
			System.out.println(world + " �ܾ�� ���� ������ �����ϴ�.");
		}

		return ans;
	}

}

public class DicApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String kor = sc.next();

			if (kor.equals("�׸�"))
				break;

			Dictionary.kor2Eng(kor);

		}

		sc.close();
	}

}

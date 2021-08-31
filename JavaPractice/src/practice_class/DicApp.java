package practice_class;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String world) {
		String ans = "";
		int i = 0;
		for (i = 0; i < 5; i++) {
			if (world.equals(kor[i])) {
				ans = eng[i];
				System.out.println(world + "는 " + ans);
				break;
			}
		}
		i++;
		if (i > 5) {
			System.out.println(world + " 단어는 저의 사전에 없습니다.");
		}

		return ans;
	}

}

public class DicApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어?");
			String kor = sc.next();

			if (kor.equals("그만"))
				break;

			Dictionary.kor2Eng(kor);

		}

		sc.close();
	}

}

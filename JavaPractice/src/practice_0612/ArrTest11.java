package practice_0612;

import java.util.Scanner;

public class ArrTest11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			boolean isExit = false;
			System.out.print("과목 이름 : ");
			String sub = sc.nextLine();

			if (sub.equals("그만")) {
				break;
			}

			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(sub)) {
					System.out.println(sub + "의 점수는 " + score[i]);
					isExit = true;
					break;
				}
			}
			if(!isExit) {
				System.out.println("없는 과목입니다.");	
			}

		}
		sc.close();
	}
}

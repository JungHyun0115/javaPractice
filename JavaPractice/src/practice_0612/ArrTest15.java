package practice_0612;

import java.util.Random;
import java.util.Scanner;

public class ArrTest15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String computer[] = { "가위", "바위", "보" };
	

		while (true) {
			Random ran = new Random();
			int randNum = ran.nextInt(computer.length);
			String com = computer[randNum];
			
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			String user = sc.next();

			if (user.equals("그만")) {
				break;
			}

			System.out.print("가위 바위 보! >>" + user);
			System.out.println();
			System.out.print("사용자 = " + user + ", 컴퓨터 = " + com + " ");

			if (user.equals(com)) {
				System.out.println("비겼습니다. ");
			}

			if (user.equals("가위")) {
				if (com.equals("보")) {
					System.out.println("사용자가 이겼습니다.");
				} else if (com.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}

			}

			if (user.equals("바위")) {
				if (com.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				} else if (com.equals("보")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}

			if (user.equals("보")) {
				if (com.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");

				} else if (com.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");

				}
			}

			System.out.println();
		}
		System.out.println("게임을 종료합니다.");
		sc.close();
	}
}

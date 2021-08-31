package practice_class;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("인원수 >> ");
			int num = sc.nextInt();

			ArrayList<Phone> array = new ArrayList<Phone>(num);

			for (int i = 0; i < num; i++) {
				array.add(new Phone("a", "n"));
			}

			for (int i = 0; i < num; i++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >>> ");
				String name = sc.next();
				String tel = sc.next();

				array.set(i, new Phone(name, tel));
			}

			System.out.println("저장되었습니다....");

			System.out.print("검색할 이름 >> ");
			String searchName = sc.next();
			if (searchName.equals("그만"))
				break;

			int j = 0;
			for (j = 0; j < num; j++) {
				if (searchName.equals(array.get(j).name)) {
					System.out.println(searchName + "의 번호는 " + array.get(j).tel + " 입니다.");
					break;
				}
			}
			j++;
			if (j > num) {
				System.out.println(searchName + "이 없습니다.");
			}
		}

	}
}

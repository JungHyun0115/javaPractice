//��ȭ��ȣ�� 
package practice_class;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�ο��� >> ");
			int num = sc.nextInt();

			ArrayList<Phone> array = new ArrayList<Phone>(num);

			for (int i = 0; i < num; i++) {
				array.add(new Phone("a", "n"));
			}

			for (int i = 0; i < num; i++) {
				System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�) >>> ");
				String name = sc.next();
				String tel = sc.next();

				array.set(i, new Phone(name, tel));
			}

			System.out.println("����Ǿ����ϴ�....");

			System.out.print("�˻��� �̸� >> ");
			String searchName = sc.next();
			if (searchName.equals("�׸�"))
				break;

			int j = 0;
			for (j = 0; j < num; j++) {
				if (searchName.equals(array.get(j).name)) {
					System.out.println(searchName + "�� ��ȣ�� " + array.get(j).tel + " �Դϴ�.");
					break;
				}
			}
			j++;
			if (j > num) {
				System.out.println(searchName + "�� �����ϴ�.");
			}
		}

	}
}

package practice_0612;

public class NumPrintTest2 {

	public static void main(String[] args) {
		System.out.println("1~100���� ����Ͻÿ�. (��, 10���� 10�� ���)");

		for (int i = 1; i <= 100;) {
			for (int j = i; j < (i+10); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			i=i+10;
		}

	}

}

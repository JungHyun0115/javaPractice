package practice_0612;

public class NumPrintTest3 {

	public static void main(String[] args) {

		System.out.println("1~100������ �� �� ¦���� ����Ͻÿ�. (��, �� �ٿ� 5���� ����� ��)");

		for (int j = 1; j <= 100; j = j + 10) {
			for (int i = j; i <= (j + 10); i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
				
			}
			System.out.println();
		}

		
	}

}

package practice_0612;

public class LoopTest3 {

	public static void main(String[] args) {
		System.out.println("1~100���� 10�� ��� ���");
		System.out.println("10�� ��� ���");
		System.out.print("=>");
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("=>");
		for (int i = 100; i > 0; i--) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}

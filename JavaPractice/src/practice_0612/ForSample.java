package practice_0612;

public class ForSample {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			for (int j = 9; j < 10; j++) {
				if (i < 10) {
					System.out.print("+");
				}

			}
			sum = i + sum;
		}
		System.out.print("=" + sum);

	}

}

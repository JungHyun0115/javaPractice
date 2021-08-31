package practice_0612;

public class ArrTest7 {

	public static void main(String[] args) {

		int[][] list = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int a = (int) (Math.random() * 10 + 1);
				list[i][j] = a;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println("");
		}

	}

}

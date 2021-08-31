package practice_0612;

public class ArrTest9 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int a = (int) (Math.random() * 10 + 1);
				array[i][j] = a;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (array[i][j] != 0) {
						array[i][j] = 0;
					}
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}

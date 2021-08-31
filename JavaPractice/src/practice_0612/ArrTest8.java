package practice_0612;

public class ArrTest8 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];
		int k = 10;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]= k;
				k+=10;
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

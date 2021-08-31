package practice_0612;

public class NumPrintTest3 {

	public static void main(String[] args) {

		System.out.println("1~100까지의 수 중 짝수만 출력하시오. (단, 한 줄에 5개씩 출력할 것)");

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

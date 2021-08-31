package practice_0612;

public class NumPrintTest2 {

	public static void main(String[] args) {
		System.out.println("1~100까지 출력하시오. (단, 10개씩 10줄 출력)");

		for (int i = 1; i <= 100;) {
			for (int j = i; j < (i+10); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			i=i+10;
		}

	}

}

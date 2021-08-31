package practice_0612;

public class NumPrintTest5 {

	public static void main(String[] args) {
		System.out.println("1~100까지의 수 중 3의 배수이면서 5의 배수인 정수를 출력하고, \n그 합을 출력하시오");
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				sum = sum + i;
				System.out.println("정수 출력 : " + i);
			}
		}
		System.out.println("합계 출력 : " + sum);

	}

}

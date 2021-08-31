package practice_0612;

public class LoopTest5 {

	public static void main(String[] args) {
		System.out.println("이중 for문 이용");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("외부 for i 값 : " + i + " 내부 for j 값 : " + j);
			}
			System.out.println();
		}

	}

}

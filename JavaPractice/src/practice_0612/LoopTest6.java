package practice_0612;

public class LoopTest6 {

	public static void main(String[] args) {
		System.out.println("이중 for문");

		for (int i = 65; i <= 70; i++) {
			System.out.print((char)i + "조 번호 : ");
			for (int j = 1; j <= 5; j++) {
				System.out.print((char)i + "0" + j + "\t");
			}
			System.out.println();
		}
	}

}

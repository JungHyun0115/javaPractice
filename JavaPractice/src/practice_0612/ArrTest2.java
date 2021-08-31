package practice_0612;

import java.util.ArrayList;

public class ArrTest2 {

	public static void main(String[] args) {
		ArrayList<Character> alpha = new ArrayList<>();

		for (char i = 'A'; i <= 'Z'; i++) {
			alpha.add(i);
		}
		
		
		
		for (int i = 25; i >= 0; i--) {
			System.out.print(alpha.get(i) + " ");
		}

	}

}

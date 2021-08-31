package practice_0612;

import java.util.ArrayList;

public class ArrTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(10);
		double sum = 0;

		for (int j = 0; j < 10; j++) {
			int i = (int) (Math.random() * 10 + 1);
			list.add(i);
//			sum = sum + list.get(i);
		}
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for (Integer n : list) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		for (Integer avg : list) {
			sum = sum + avg;
		}

		System.out.println("Æò±ÕÀº " + sum / 10);

	}

}

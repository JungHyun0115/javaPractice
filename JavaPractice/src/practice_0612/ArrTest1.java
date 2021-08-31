package practice_0612;

import java.util.ArrayList;

public class ArrTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(1);
		intArr.add(2);
		intArr.add(3);

		int sum = 0;
		for (int i = 0; i < intArr.size(); i++) {
			sum = sum + intArr.get(i);
		}
		System.out.println("intArr[3] 합계 : " + sum);

		ArrayList<Double> dbArr = new ArrayList<>();
		dbArr.add(1.0);
		dbArr.add(2.5);
		dbArr.add(3.3);

		double sum2 = 0;
		for (int i = 0; i < dbArr.size(); i++) {
			sum2 = sum2 + dbArr.get(i);
		}
		System.out.println("dbArr[3] 합계 : " + sum2);

		ArrayList<Character> charArr1 = new ArrayList<>();

		charArr1.add('a');
		charArr1.add('b');
		charArr1.add('c');
		
		System.out.print("charArr1[3] 출력 : ");
		for (int i = 0; i < charArr1.size(); i++) {
			System.out.print(charArr1.get(i) + " ");
		}
		System.out.println();
		
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("오레오");
		strArr.add("물개");
		strArr.add("오복돌");
		
		System.out.print("strArr[3] 출력 : ");
		for(int i = 0; i<strArr.size(); i++) {
			System.out.print(strArr.get(i) + " ");
		}
	}

}

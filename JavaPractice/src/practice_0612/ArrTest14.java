package practice_0612;
//문제 5번

import java.util.ArrayList;
import java.util.Scanner;

public class ArrTest14 {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 10개 입력 >> ");
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
	
		System.out.print("3의 배수는 >> ");
		for(int j=0; j<10; j++) {
			if(list.get(j)%3==0) {
				System.out.print(list.get(j) + " ");
			}
		}

		sc.close();
		
	}
	
}

package practice01;

import java.util.Scanner;

public class number2739 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 외자 구구단을 외자 몇 단? >> ");
		
		n = sc.nextInt();
		
		if(1<=n && n<=9) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
	}

}

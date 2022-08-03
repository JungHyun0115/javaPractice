package practice02;

import java.util.Scanner;

public class number_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번 찍을까요? ");
		int n = sc.nextInt();
		
		if(n>= 1 && n <=100) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");	
				}
				System.out.println();
			}
		}
	}

}
//repeat
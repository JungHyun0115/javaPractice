package practice01;

import java.util.Scanner;

public class number2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, sum;
		
		System.out.print("숫자 1 입력 : ");		
		n = sc.nextInt();
		
		System.out.print("숫자 2 입력 : ");		
		m = sc.nextInt();

		int[] arr = new int[3];

		arr[0] = m/100;
		m = m%100;
		
		arr[1] = m/10;
		m = m%10;
		
		arr[2] = m;
		
		for(int i = 2; i >= 0; i--) {
			System.out.println(n*arr[i]);
		}
		sum = (n*arr[2]) + (n*arr[1])*10 + (n*arr[0])*100;
		System.out.println(sum);
		
	}

}

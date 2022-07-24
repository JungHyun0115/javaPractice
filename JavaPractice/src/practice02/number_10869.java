package practice02;

// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
// 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

import java.util.Scanner;

public class number_10869 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("두 자연수 입력 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}

}

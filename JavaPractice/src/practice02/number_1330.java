package practice02;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

import java.util.Scanner;

public class number_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(">");
		} else if(num1 < num2) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}

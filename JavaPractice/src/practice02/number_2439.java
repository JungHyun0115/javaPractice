package practice02;
//별찍기
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 공백 공백 공백 공백 별
// 공백 공백 공백 별  별
import java.util.Scanner;

public class number_2439 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("별 몇 개? >> ");
			int N = sc.nextInt();
			
			for(int i = 1; i <= N; i++) {
				for(int j = 0; j < (N-i); j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < (i); k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
//repeat
package practice03;

import java.util.Scanner;

public class number_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>> ");

		String total = sc.nextLine();

		String[] spTotal = total.split(" ");

		int totalAmt = 0;
		int totalSp = Integer.parseInt(spTotal[0]) + Integer.parseInt(spTotal[1]);

		int i = 1;

		do {
			if(i <= 2100000000) {
				totalAmt = Integer.parseInt(spTotal[2])*i;
				totalSp = Integer.parseInt(spTotal[0]) + Integer.parseInt(spTotal[1])*i;
				i++;	
			}
			else {
				//손익분기점이 없을때
				i = -1;
				break;
			}
		} while (totalAmt < totalSp);
		
		System.out.println(i);

	}
}
package practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class number_1546 {

	public static void main(String[] args) {
		// 다 더해서 최고값으로 나누고 *100 /개수

		Scanner sc = new Scanner(System.in);
		int M;
		double total = 0;

		System.out.print("몇 번? >> ");
		String subject = sc.nextLine();

		String score = sc.nextLine();
		
		String[] spScore = score.split(" ");

		M = Integer.parseInt(spScore[0]);
		
		for(int i = 0; i < spScore.length; i++) {
			total += Integer.parseInt(spScore[i]);
			
			if(i < spScore.length-1) {
				if(Integer.parseInt(spScore[i]) > Integer.parseInt(spScore[i+1])) {
					M = Integer.parseInt(spScore[i]);
				}
			}
		}
		
		total = ((total / M) * 100) / Integer.parseInt(subject);

		System.out.println(total);
	}

}

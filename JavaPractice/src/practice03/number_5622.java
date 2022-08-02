package practice03;
import java.util.Scanner;
public class number_5622 {

	public static void main(String[] args) {
		int second = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		
		String dial = sc.nextLine();
		
		if(dial.length() >=2 && dial.length() <= 15) {
			//a, b, c = 3 d,e,f = 4 ghi 5, 
			for(int i = 0; i < dial.length(); i++) {

				if(dial.charAt(i) == ('A') || dial.charAt(i) == ('B') || dial.charAt(i) == ('C')) {
					second += 3;
				}
				else if(dial.charAt(i) == ('D') || dial.charAt(i) == ('E') || dial.charAt(i) == ('F')) {
					second += 4;
				}
				else if(dial.charAt(i) == ('G') || dial.charAt(i) == ('H') || dial.charAt(i) == ('I')) {
					second += 5;
				}
				else if(dial.charAt(i) == ('J') || dial.charAt(i) == ('K') || dial.charAt(i) == ('L')) {
					second += 6;
				}
				else if(dial.charAt(i) == ('M') || dial.charAt(i) == ('N') || dial.charAt(i) == ('O')) {
					second += 7;
				}
				else if(dial.charAt(i) == ('P') || dial.charAt(i) == ('Q') || dial.charAt(i) == ('R') || dial.charAt(i) == ('S')) {
					second += 8;
				}
				else if(dial.charAt(i) == ('T') || dial.charAt(i) == ('U') || dial.charAt(i) == ('V')) {
					second += 9;
				}
				else if(dial.charAt(i) == ('W') || dial.charAt(i) == ('X') || dial.charAt(i) == ('Y') || dial.charAt(i) == ('Z')) {
					second += 10;
				}
				
			}
		}
		System.out.println(second);
	}

}

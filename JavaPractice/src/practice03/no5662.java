package practice03;
//첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

import java.util.Scanner;

public class no5662 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호 입력 >> ");
		String number = sc.nextLine();
		
		String numberArr[] = number.split(number);
		
		for(int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		
		
	}

}

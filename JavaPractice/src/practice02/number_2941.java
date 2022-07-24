package practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class number_2941 {

	public static void main(String[] args) {
		
		int count = 0, total = 0, all;
		ArrayList arr2 = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String al = sc.nextLine();
		
		int alLength = al.length();
		
		String [] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for(int i = 0; i < arr.length; i++) {
			if(al.contains(arr[i])) {
				arr2.add(arr[i]);
				al = al.replaceFirst(arr[i], ".");
				count++;
				i = -1;
			}
		}

		for(int i = 0; i < arr2.size(); i++) {
			total += arr2.get(i).toString().length();
		}
		
		all = alLength - total + count;
		
		System.out.println("all = " + all);
	}

}

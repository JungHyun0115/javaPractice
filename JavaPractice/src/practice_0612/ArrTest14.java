package practice_0612;
//���� 5��

import java.util.ArrayList;
import java.util.Scanner;

public class ArrTest14 {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� 10�� �Է� >> ");
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
	
		System.out.print("3�� ����� >> ");
		for(int j=0; j<10; j++) {
			if(list.get(j)%3==0) {
				System.out.print(list.get(j) + " ");
			}
		}

		sc.close();
		
	}
	
}

package practice01;

import java.util.Scanner;

public class number2884 {

	public static void main(String[] args) {
		
		int H, M;
		
		Scanner schh = new Scanner(System.in);
		Scanner scmm = new Scanner(System.in);
		
		System.out.println("�˶��ð� �ð� ����");
		
		System.out.print("�ð� �Է�(��) : ");
		H = schh.nextInt();
		
		while(H < 0 || H > 23) {
			System.out.print("�ٽ� �Է��ϼ���(1~23�� ������ �ð� �Է�) : ");
			H = schh.nextInt();
		}
		
		System.out.print("�ð� �Է�(��) : ");
		M = scmm.nextInt();
		
		while(M < 0 || M > 59) {
			System.out.print("�ٽ� �Է��ϼ���(1~59�� ������ �� �Է�) : ");
			M = schh.nextInt();
		}
		
		if(H == 0) {
			H = 24;
			if(M < 45) {
				H = H-1;
				M = M+15;
			} else {
				H = H-1;
				M = M-45;
			}
		} else {
			if(M < 45) {
				H = H-1;
				M = M+15;
			} else {
				H = H-1;
				M = M-45;
			}
		}
	
		System.out.println("�˶� ���� �Ϸ� " + H + "�� " + M + "��");
			
	}

}

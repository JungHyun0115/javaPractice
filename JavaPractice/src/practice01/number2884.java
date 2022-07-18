package practice01;

import java.util.Scanner;

public class number2884 {

	public static void main(String[] args) {
		
		int H, M;
		
		Scanner schh = new Scanner(System.in);
		Scanner scmm = new Scanner(System.in);
		
		System.out.println("알람시계 시간 설정");
		
		System.out.print("시간 입력(시) : ");
		H = schh.nextInt();
		
		while(H < 0 || H > 23) {
			System.out.print("다시 입력하세요(1~23시 사이의 시간 입력) : ");
			H = schh.nextInt();
		}
		
		System.out.print("시간 입력(분) : ");
		M = scmm.nextInt();
		
		while(M < 0 || M > 59) {
			System.out.print("다시 입력하세요(1~59시 사이의 분 입력) : ");
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
	
		System.out.println("알람 설정 완료 " + H + "시 " + M + "분");
			
	}

}

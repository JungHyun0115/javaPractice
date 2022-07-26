package practice02;
import java.util.ArrayList;
//첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
//단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
import java.util.Scanner;

public class number_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		
		String changeAl = sc.nextLine();
		String alList[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		ArrayList al = new ArrayList();
		int count = 0, alLength = 0, total;
		int changeLength = changeAl.length();
		
		for(int i = 0; i < alList.length; i++) {
			if(changeAl.contains(alList[i])) {
				al.add(alList[i]);
				changeAl = changeAl.replaceFirst(alList[i], " ");
				count++;
				i = -1;
			} 
		}
		
		for(int i = 0; i < al.size(); i++) {
			alLength += al.get(i).toString().length();
		}
		
		total = changeLength - alLength + count;
		
		System.out.println("출력 : " + total);

	}

}
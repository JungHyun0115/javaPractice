package practice_0612;
import java.util.Scanner;

public class ArrTest16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.print("ö�� ���� ���� �� �Է� >> ");
			String chul = sc.next();
			
			System.out.print("���� ���� ���� �� �Է� >> ");
			String young = sc.next();
			if(chul.equals("�׸�"))
				break;
			
			if(chul.equals(young))
				System.out.println("�����ϴ�.");
			
			if(chul.equals("����")) {
				if(young.equals("����")) {
					System.out.println(chul + ", "+ young + " ���� ��");
				} else if(young.equals("��")) {
					System.out.println(chul + ", "+ young + " ö�� ��");
				}
			}
			
			if(chul.equals("����")) {
				if(young.equals("��")) {
					System.out.println(chul + ", "+ young + " ���� ��");
				} else if(young.equals("����")) {
					System.out.println(chul + ", "+ young + " ö�� ��");
				}
			}
			
			if(chul.equals("��")) {
				if(young.equals("����")) {
					System.out.println(chul + ", "+ young + " ���� ��");
				} else if(young.equals("����")) {
					System.out.println(chul + ", "+ young + " ö�� ��");
				}
			}
			
		}
		
	}

}

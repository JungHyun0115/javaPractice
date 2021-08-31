package practice_0612;
import java.util.Scanner;

public class ArrTest16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.print("Ã¶¼ö °¡À§ ¹ÙÀ§ º¸ ÀÔ·Â >> ");
			String chul = sc.next();
			
			System.out.print("¿µÈñ °¡À§ ¹ÙÀ§ º¸ ÀÔ·Â >> ");
			String young = sc.next();
			if(chul.equals("±×¸¸"))
				break;
			
			if(chul.equals(young))
				System.out.println("ºñ°å½À´Ï´Ù.");
			
			if(chul.equals("°¡À§")) {
				if(young.equals("¹ÙÀ§")) {
					System.out.println(chul + ", "+ young + " ¿µÈñ ½Â");
				} else if(young.equals("º¸")) {
					System.out.println(chul + ", "+ young + " Ã¶¼ö ½Â");
				}
			}
			
			if(chul.equals("¹ÙÀ§")) {
				if(young.equals("º¸")) {
					System.out.println(chul + ", "+ young + " ¿µÈñ ½Â");
				} else if(young.equals("°¡À§")) {
					System.out.println(chul + ", "+ young + " Ã¶¼ö ½Â");
				}
			}
			
			if(chul.equals("º¸")) {
				if(young.equals("°¡À§")) {
					System.out.println(chul + ", "+ young + " ¿µÈñ ½Â");
				} else if(young.equals("¹ÙÀ§")) {
					System.out.println(chul + ", "+ young + " Ã¶¼ö ½Â");
				}
			}
			
		}
		
	}

}

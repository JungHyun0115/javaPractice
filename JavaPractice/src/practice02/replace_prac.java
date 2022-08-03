package practice02;

public class replace_prac {

	public static void main(String[] args) {
		String a = "c=c=";
		System.out.println(a);
		
		a = a.replaceAll("c=", "");
		
		System.out.println(a);

	}

}

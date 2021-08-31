package practice_0612;

public class NumPrintTest1 {

	public static void main(String[] args) {
		
		System.out.println("화면에 1~10까지를 나란히 출력하시오");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("화면에 10~1까지를 나란히 출력하시오");
		for(int i = 10; i>0; i--) {
			System.out.print(i+" ");
		}
	}

}

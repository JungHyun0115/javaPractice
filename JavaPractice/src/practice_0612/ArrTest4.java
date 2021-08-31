package practice_0612;

import java.util.ArrayList;

public class ArrTest4 {

	public static void main(String[] args) {

		ArrayList<String> example = new ArrayList<String>(10);
		for(int i = 0; i< 10; i++) {
			example.add("a");
		}
		System.out.println(example.size());
		
		example.set(0, "b");
		example.set(1, "b");
		example.set(2, "b");
		
		for(int i = 0; i<example.size(); i++) {
			System.out.print(example.get(i) + " ");
		}
		
	}

}

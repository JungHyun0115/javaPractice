package practice_class;

import java.util.Scanner;

class Add {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a + b;
	}
}

class Sub {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {

		return a - b;
	}
}

class Mul {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a * b;
	}
}

class Div {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a / b;
	}
}

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();

		switch (c) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.cal());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.cal());
			break;

		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.cal());
			break;

		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.cal());
			break;

		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		}

		sc.close();
	}

}

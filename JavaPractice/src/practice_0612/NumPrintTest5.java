package practice_0612;

public class NumPrintTest5 {

	public static void main(String[] args) {
		System.out.println("1~100������ �� �� 3�� ����̸鼭 5�� ����� ������ ����ϰ�, \n�� ���� ����Ͻÿ�");
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				sum = sum + i;
				System.out.println("���� ��� : " + i);
			}
		}
		System.out.println("�հ� ��� : " + sum);

	}

}

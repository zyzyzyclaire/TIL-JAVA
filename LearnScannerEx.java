package todayILearn;

import java.util.Scanner;

public class LearnScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ü��, ���ſ��θ� �Է��ϼ���.");
		
		String name = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		
		System.out.println("�̸���"+name+"���̴�"+age+"ü����"+weight+"���ſ��δ�"+single);
		
		scanner.close();

		
	}
}

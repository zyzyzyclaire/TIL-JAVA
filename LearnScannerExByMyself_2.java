package todayILearn;

import java.util.Scanner;

public class LearnScannerExByMyself_2 {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ü��, ���ſ��θ� �Է��ϼ���.");
		
		System.out.println("�̸���?");
		String name1 = scanner1.next();
		
		System.out.println("���̴�?");
		int age1 = scanner1.nextInt();
		
		System.out.println("ü����?");
		double weight1 = scanner1.nextDouble();
		
		System.out.println("���ſ��δ�?");
		boolean single1 = scanner1.nextBoolean();
		
		System.out.println("�̸���"+name1+"���̴�"+age1+"ü����"+weight1+"���ſ��δ�"+single1);

		scanner1.close();
		
	}
	
}

package todayILearn;

import java.util.Scanner;

public class LearnScannerExByMyself {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ڱ�Ұ�");
		String introduce = scanner.nextLine();
		
		System.out.println("�̸�");
		String name = scanner.next();
		
		System.out.println("����");
		int age = scanner.nextInt();
		
		System.out.println("�ڱ�Ұ�"+introduce+", �̸���"+name+", ���̴�"+age);
		
	scanner.close();
}
}

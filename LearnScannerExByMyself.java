package todayILearn;

import java.util.Scanner;

public class LearnScannerExByMyself {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("자기소개");
		String introduce = scanner.nextLine();
		
		System.out.println("이름");
		String name = scanner.next();
		
		System.out.println("나이");
		int age = scanner.nextInt();
		
		System.out.println("자기소개"+introduce+", 이름은"+name+", 나이는"+age);
		
	scanner.close();
}
}

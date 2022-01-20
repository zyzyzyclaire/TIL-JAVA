package todayILearn;

import java.util.Scanner;

public class LearnScannerExByMyself_2 {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("이름, 나이, 체중, 독신여부를 입력하세요.");
		
		System.out.println("이름은?");
		String name1 = scanner1.next();
		
		System.out.println("나이는?");
		int age1 = scanner1.nextInt();
		
		System.out.println("체중은?");
		double weight1 = scanner1.nextDouble();
		
		System.out.println("독신여부는?");
		boolean single1 = scanner1.nextBoolean();
		
		System.out.println("이름은"+name1+"나이는"+age1+"체중은"+weight1+"독신여부는"+single1);

		scanner1.close();
		
	}
	
}

package todayILearn;

import java.util.Scanner;

public class LearnScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 나이, 체중, 독신여부를 입력하세요.");
		
		String name = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		
		System.out.println("이름은"+name+"나이는"+age+"체중은"+weight+"독신여부는"+single);
		
		scanner.close();

		
	}
}

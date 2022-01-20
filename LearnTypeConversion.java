package todayILearn;

public class LearnTypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		System.out.println(b+i);
		System.out.println(10/4);	// 정수/정수->정수 
		System.out.println(10.0/4);	// 정수/실수->실수
		System.out.println(2.9+1.8);	// 실수/실수->실수
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		System.out.println((int)(2.9+1.8));

	
	}
}

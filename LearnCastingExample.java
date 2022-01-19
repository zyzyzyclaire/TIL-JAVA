package todayILearn;

public class LearnCastingExample {
	public static void main(String[] args) {
		int iValue=44032;
//		char cValue=iValue;
//		char cValue=char iValue;
		char cValue=(char) iValue;
		System.out.println(cValue);  //유니코드 44032가 '가'로 출력
		
		long lValue=500;
		iValue=(int)lValue;
		System.out.println(iValue);  //iValue 500이 됨
		
		double dValue=3.14;
		iValue=(int)dValue;
		System.out.println(iValue); //정수니까 실수가 잘림
		
	}
}

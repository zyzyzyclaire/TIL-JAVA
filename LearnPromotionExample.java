package todayILearn;

public class LearnPromotionExample {
	public static void main(String[] args) {
		byte bValue=10;
		int iValue=bValue;
		
		System.out.println(bValue);
		System.out.println(iValue);
		
		char cValue='가';
		iValue=cValue;
		
		System.out.println(cValue);
		System.out.println(iValue); //int 타입이 '가'를 유니코드화

		iValue=50;
		long lValue=iValue;
		System.out.println(lValue);
		
		lValue=100;
		float fValue=lValue;
		System.out.println(fValue); //float가 실수타입이기 때문

		fValue=100.5f;
		double dValue=fValue;
		System.out.println(dValue);
		
	
	}
}

package todayILearn;

public class LearnLongOperationExample {
	public static void main(String[] args) {
		byte var1=10;
		int var2=100;
		long var3=1000;
		
		int result1=(int)(var1+var2+var3);
		int result2=var1+var2;
		int result3=var1+var2+(int) var3;
//		long이 가장 큰 단위라서
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}

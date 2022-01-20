package todayILearn;

public class LearnVariableExchangeExample {
	public static void main(String[] args) {
		int x=3;
		int y=5;
		System.out.println("x:"+x+", y:"+y);
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println(x);
		System.out.println(y);
		
		
	}
}

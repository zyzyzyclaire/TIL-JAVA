package todayILearn;

public class LearnCharExample {
	public static void main(String[] args) {
		char c1='A';
		char c2=65;  //10진수로? 인식
		char c3=66;  //10진수로? 인식
		char c4= '\u0041';  //유니코드로? 인식
		char c5= '가';
		char c6= 44032;   //16진수로? 인식
		char c7= '\uac00';  //유니코드로? 인식
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
	}
}

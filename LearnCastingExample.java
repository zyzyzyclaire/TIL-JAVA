package todayILearn;

public class LearnCastingExample {
	public static void main(String[] args) {
		int iValue=44032;
//		char cValue=iValue;
//		char cValue=char iValue;
		char cValue=(char) iValue;
		System.out.println(cValue);  //�����ڵ� 44032�� '��'�� ���
		
		long lValue=500;
		iValue=(int)lValue;
		System.out.println(iValue);  //iValue 500�� ��
		
		double dValue=3.14;
		iValue=(int)dValue;
		System.out.println(iValue); //�����ϱ� �Ǽ��� �߸�
		
	}
}

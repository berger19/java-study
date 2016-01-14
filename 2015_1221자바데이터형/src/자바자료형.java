
public class 자바자료형 {
	/*
	 * 	자료형
	 * 		정수형
	 * 			byte
	 * 			short
	 * 			int
	 * 			long(숫자 뒤에 L자가 붙으면 long)
	 * 
	 * 	실수형
	 * 		float(10.5F >> 뒤에 F가 붙으면 float)
	 * 		double
	 * 	
	 * 	문자형
	 * 		char >> 'A' -0~65535=>각국의 언어 표현(유니코드)
	 * 
	 * 	논리형
	 * 		boolean : T / F =>조건사용==>데이터 저장시 메모리 크기 결정시 사용
	 * 
	 * 	데이처 저장방법
	 *		1.단일데이터 저장하는 메모리의 별칭 : 변수
	 *		  변수 : 변하는 값(언제든 필요시 변경가능)
	 *		  상수 : 변하지 않는 값
	 *		=>변수 사용법
	 *			메모리 크기선언 변수명 설정 = 값
	 *			int a=10;  >> 같은 블럭상에서 같은 이름의 변수는 사용할 수 없다.
	 *			{ int a=10;
	 *			  int a=20;  >>>error
	 *			}
	 *			선언후에 나중에 값을 대입하는 경우
	 *			int a;
	 *			a=10
	 *			or int a,b,c;
	 *			   int a=10 , b=20, c=30;
	 *
	 *		=>변수명 만들기(식별자)
	 *			1.알파벳이나 한글로 시작(단 알파벳은 대소문자를 구분)
	 *			2.숫자사용이 가능(단 앞에 사용할 수 없다)
	 *			3.특수문자를 사용할 수 있다($,_ 두가지만 사용가능)
	 *			4.키워드 사용 안됨
	 *			5.변수 길이는 제한 없음(3~7자)
	 *
	 *			약속된 부분(자바개발자용)
	 *			1.클래스명은 대문자(첫자)==>Main
	 *			2.변수, 메소드(첫자)>>소문자 ==>a,b, kor ....
	 *			3.두개이상의 단어는 두번째 시작은 대문자 ==> MainClass, fileName ..
	 *				(헝거리언식 표현)
	 *			
	 *			byte<short(char)<int<long<float<double
	 *			==>자료형 작게 만든다.
	 *				(int)10.5 =>(double=>int) >>강제형 변환
	 *			==>자료형 크게 만든다.
	 *				(double)10 => int => double
	 *
	 *			==>자동형 변환(연산수행시마다 실행됨)
	 *			'A'+1
	 *			1. 'A' =65
	 *			2. 65+1 = 66
	 *
	 *			==>>int 이하는 연산 수행시 int로 전환
	 *
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue=127;
		short shortValue=32767;
		int intValue=2140000000;
		long longValue=300000000000000L;
		float floatValue=10.5F;
		double doubleValue=10.5;
		char charValue='홍';
		boolean booleanValue=true;
		System.out.println("byteValue="+byteValue);
		System.out.println("shortValue="+shortValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("charaVlue="+charValue);
		System.out.println("booleanValue="+booleanValue);
		
	}

}

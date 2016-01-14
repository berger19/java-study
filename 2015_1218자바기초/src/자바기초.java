/*
 * 	주석표시
 * 		1) 자바실행
 * 			A.java =============> A.class ===========> 실행
 * 				   javac(기계어변환)          java(인터프리터)
 *                                       ============
 *                                            JVM
 *		2) 자바에서 사용하는 데이터 표현법
 *			1. 정수
 *				=10진법 : 100, 200 ....
 *				=8진법 : 0(숫자)
 *				=16진법 : 0x(숫자)
 *				100(4byte), 100L(8byte)
 *			2.문자
 *				= 'A' , '홍' , '0' => 고유번호(ASC)
 *					'A'=65  ex) 'A'+1=66
 *					'a'=97
 *					'0'=48
 *			3. 문자열
 *				= "홍길동"
 *			4.실수
 *				=10.5(8byte)>>원래는 D가 뒤에 붙으나 생략함 , 10.5F(4byte)
 *			5.논리
 *				=true, false
 */
public class 자바기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);//정수표현
		System.out.println(011);//8진법
		System.out.println(0x55);//16진법
		System.out.println('A');//문자표현
		System.out.println('홍');//문자표현
		System.out.println("홍길동");//문자열표현
		System.out.println(10.5);//8byte실수표현
		System.out.println(10.5F);//4byte
		System.out.println(true);//논리표현
		System.out.println(false);//논리표현
		System.out.println("7"+7+"7"+7+7);//==>>77777(왼쪽부터계산)
		System.out.println(7+7+7+7+"7");//==>>287(28+"7"=287)
	}

}

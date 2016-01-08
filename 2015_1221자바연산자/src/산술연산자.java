
public class 산술연산자 {
/*
 * 	산술연산자
 * 	(+,-,*,/,%)
 * 	+,-,* : 형변환만 잘 볼것
 * 	10(큰데이터형으로 자동 변환)+20.5=30.5
 *	
 *	int a=10.5+10.5(에러)
 *
 *	int a=(10.5+10.5) ==>가로가 먼저 연산 ==21
 *	int a=(int)10.5+(int)10.5 ==>가로가 먼저 연산 int가 먼저 연산되어 정수로 변환(20)
 *
 *	1. 0 으로 나누면 에러(error)10/0=error
 *	2. 정수/정수=정수 ==>10/3=3
 *
 *	% : 결관값이 왼쪽 부호가 남는다
 *		5%2=1
 *		-5%2=-1
 *		-5%-2=-1
 *		5%-2=1
 *
 *		===>데이터형 41페이지
 *		===>변수, 변수 만들기 42,43페이지
 *		===>형변환 64페이지(자동, 강제)
 *			===>자료형의 크기(67페이지)
 *		===>연산자의 종류(72페이지)
 *		===>산술연산자(74페이지)
 *		===>증감연산자(92페이지, 93페이지)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=85;
		int eng=78;
		int math=80;
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("국어점수"+kor);
		System.out.println("영어점수"+eng);
		System.out.println("수학점수"+math);
		System.out.println("총점"+total);
		System.out.println("평균"+avg);
		System.out.printf("평균:%.2f",avg);
		//서식 : %c(문자), %d(정수), %f(실수), $s(문자열)
		
		System.out.println("5%2="+5%2);
		System.out.println("-5%2="+ -5%2);
		System.out.println("5%-2="+5%-2);
		System.out.println("-5%2="+ -5%-2);
		
		
	}

}

/*
 * 프로그램 구현 방법
 * 	1.데이터저장 =>변수
 * 	2.데이터 연산처리 =>연산자
 * 	3.처리된 결관 출력 => System.out.println()
 * 		=>System.out.println() : new Line
 * 			System.out.println("abc");
 * 			System.out.println("def");
 * 			abc
 * 			def
 * 
 * 		  System.out.print() :
 * 			System.out.print("abc");
 * 			System.out.print("def");
 * 			abcdef
 * 
 * 		  System.out.printf() : 서식을 가지고 있는 출력
 * 			System.out.printf("%d%d%d",10,20,30);
 * 			102030
 * 			System.out.printf("%5d%5d%5d",10,20,30);
 * 			10   20   30 :숫자를 포함하여 5칸의 간격을 가짐
 * 			%5d / %-5d (앞에서 정렬 / 뒤에서 정렬)
 * 연산자
 * 
 * 	SUN(1.7) ===> Oracle(1.8에 증간된 내용=> pointer:람다식,나즈혼)
 * 						   c + 파이씬
 * 
 * 	비트이동 연산자 (<<왼쪽이동 , >>오른쪽이동)
 *		10<<2  ==>  이진법으로 변환후에 뒤에 0을 2개 붙여라
 *			   ==> 1010(답 : 101000:40)
 *		X<<Y   ==> X*2^Y
 *
 *		10>>2
 *			   ==>10(10)X == 0010:2가 답
 *		X>>Y   ==>X/2^Y
 *
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.printf("%5d%5d", 10, 20);
		System.out.printf("%-5d%-5d", 10, 20);*/
		int a=10;
		int b=2;
		int c=a<<b;
		int d=a>>b;
		System.out.println(Integer.toBinaryString(a));
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
	}

}

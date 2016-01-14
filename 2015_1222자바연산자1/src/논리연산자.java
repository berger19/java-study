/*
 * 	논리연산자 ==>결관값(true/false) =>boolean
 *  조건&&조건
 * 	=====================================
 *             &&             ||
 *  =====================================
 *   t   t      t             t
 *  =====================================
 *   t   f      f             t
 *  =====================================
 *   f   t      f             t
 *  =====================================
 *   f   f      f             f
 *   
 *   최적화 연산 처리
 *   &&는 앞에 있는 조건이 F 이면 뒤에 있는 조건은 처리 하지 않음
 *   ||는 앞에 있는 조건이 T 이면 뒤에 있는 조건은 처리 하지 않음
 *   
 * 
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result=(a<b && ++b==a);
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int c=10;
		int d=9;
		boolean result1=(c<d || ++d==c);
		System.out.println("result1=" + result1);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
				
	}

}

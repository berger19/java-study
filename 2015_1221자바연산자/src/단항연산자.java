
public class 단항연산자 {
/*
 *=>단항연산자
 * 	++,-- 증감연산자
 * 		++,--
 * 		a++(후치연산자 : 다른 연산후에 증가), ++a(전치연산자 : 증사후 다른연사 수행)
 * 		int a=10
 * 		int b=a++ =>a=11 / b=10
 * 
 * 		int b=++a
 * 	! 부정연산자
 * (type)형변환 연산자
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=--a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c=10;
		int d=++c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int e=10;
		int f=e++;
		System.out.println("e="+e);
		System.out.println("f="+f);
		
		int g=10;
		int h=g--;
		System.out.println("g="+g);
		System.out.println("h="+h);
		
	}

}

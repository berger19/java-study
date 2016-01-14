
/*
 * 관계연산자 => 괄과값(true/false) boolean
 * == 같다
 * != 같지않다
 * < 작다
 * > 크다
 * <= 작거나 같다
 * >= 크거나 같다
 * 
 * 
 */
public class 관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=9;
		boolean result= (a == ++b); //b=10
		System.out.println("b="+b);
		System.out.println("result="+result);
		
		result= (a == b++); //b=10
		System.out.println("b="+b);//11
		System.out.println("result="+result);
		
		result= (a == b); // b=11
		System.out.println("b="+b);
		System.out.println("result="+result);*/
		
		int a=10;
		int b=9;
		boolean result=(a!=b);//true b:9
		System.out.println("result="+result);
		int c=++b;
		result=(a!=c);//b=10
		System.out.println("result="+result);
		int d=c++;//c=10
		result=(a!=d);
		System.out.println("result="+result);
		int e=--d;//d=9
		result=(a!=e);
		System.out.println("result="+result);
		
				
	}

}

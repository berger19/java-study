/*
 *  3,5,7배수
 */
public class 조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		if(num%3==0)
			System.out.println(num+"는(은) 3의배수");
		if(num%5==0)
			System.out.println(num+"는(은) 5의배수");
		if(num%7==0)
			System.out.println(num+"는(은) 7의배수");//단일 if문
		
		int num1=10;
		if(num1%2==0)
			System.out.println(num1+"는(은) 짝수다");
		    System.out.println("Program End");
		
		int num2=10;
		if(num2%2!=0)
			System.out.println(num2+"는(은) 홀수다");
		    System.out.println("Program End");
		    
		
	}

}

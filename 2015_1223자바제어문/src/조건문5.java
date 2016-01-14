/*
 *  선택if
 *  	1.형식
 *  		if(조건문) //T
 *  			문장1
 *  		else //F
 *  			문장2
 *  
 *  		if(조건문) //T
 *  		{
 *  		문장1
 *  		문장2
 * 			}
 * 			else //F
 * 			{
 * 			문장1
 * 			문장2
 * 			}
 * 
 */
import java.util.Scanner;
public class 조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100사이의 정수 입력");
		int num=scan.nextInt();
		if(num<1 || num>100){
			System.out.println("잘못된 입력입니다");
		}
		else{
			System.out.println("정상입력입니다");
		}
		
		if(num%2==0){
			System.out.println(num+"는 짝수다");
		}
		else{
			System.out.println(num+"는 홀수다");
		}
		
	}

}

/*
 * 		단항연산자
 * 		    1. 형식 
 * 				전치연산자    int a=10;
 * 							  int b=++a
 * 
 * 				후치연산자    int a=10
 * 							  int b=a++
 * 
 * 		부정연산자(조건문 => if)
 * 			boolean bCheck=false;
 * 			bCheck=!bCheck;
 * 			bCheck=true
 * 
 * 		이항연산자
 * 			1.산술연산자
 * 				=> 형변환( => 연산시 큰 데이터형으로 변환)
 * 						ex) int +long = long
 * 							 int+int+double =double
 * 				=> / 연산시 '0'으로 나누면 error
 * 					정수/정수 = 정수(실수점 제외)
 * 				=>  %
 * 					남는 값을 항상 왼쪽편의 부호를 따른다
 * 					-5%2=-1
 * 					5%-2=1
 * 
 * 			2.관계연산자(==, !=, < , >, <= , >=)
 * 				결과값 : true / false (boolean으로 연산)
 * 
 * 			3.논리연산자( &&, || )
 *				 && ===> 양쪽에 true => true
 *				 || ===> 한쪽이 true = true
 *
 * 			4.대입연산자( =, +=, -=)
 * 				int a=10
 * 					a+=1
 * 					b-=1
 * 
 */

// 년도를 입력 받아 윤년인지 여부를 확인
/*
 * 		윤년의 조건 ==> 4년에 한번씩 윤년 / 100년에 한번씩 제외
 *						   400년마다 윤년
 *
 *			if((year%4==0 && year%100!=0) || (year%400))
 *				윤년 계산하는 조건 입력 == > 한쪽만 true일 경우 true (|| 사용)
 */
//	제어문
/*		기본 조건문
 * 		if(조건문){
 * 			조건문이 true 일때 실행
 *    }
 *     else{
 *     		조건문이 false 일때 실행
 *     }
 *     
 *     
 *     다중if문
 *     if(조건문){
 *     }
 *     else if(조건문){
 *     }
 *     else if(조건문){
 *     }
 *     else{
 *     } // 생략이 가능하다.
 *     
 *     반복문
 *        
 * 
 */
import java.util.Scanner;
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력하시오");
		int year=scan.nextInt();
		if((year%4==0 && year%100==0) || (year%400==0))
			System.out.println(year+"년도는 윤년입니다.");
		else{
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}

	}

}

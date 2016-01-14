/*
 * 	제어문 : 프로그램에 맞게 제어를 하는 프로그램
 * 	조건문
 * 	(1)단일 IF
 * 		1. 형식
 * 			=>if(조건문)
 * `			문장  ====>조건문이 true면 문장 수행
 * 				   ====>조건문이 false면 문장을 수행하지 않음
 * 			=>여러개의 문장을 동시에 제어
 * 				if(조건문)
 * 				{
 * 					문장1 //제어함
 * 					문장2 //제어 안함
 * 				}
 *              ****** 자바에서 제어문은 {}이 없는 경우에
 *              	   바로 밑에 있는 문장 하나만 제어
 *           =>조건이 true, false 일때 다른 문장을 수행
 *           	if(조건문)
 *                 문장1
 *              else
 *                 문장2
 *			
 *
 * 
 * 
 */
import java.util.Scanner;
//Scanner : 키보드 입력값을 받는경우
public class 조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수  Math.random()==>>무작위로 숫자를 뽑아주며, 기본적으로 0.0~0.99를 뽑아주며
		//					  1~100까지 설정을 하면 이안에서 뽑아냄
		/*int rand=(int)(Math.random()*100)+1;
		System.out.println("rand="+rand);*/
		/*Scanner scan=new Scanner(System.in);
		System.out.println("정수입력");
		int num=scan.nextInt();
		System.out.println("num="+num);*/
		
		int com=(int)(Math.random()*3);
		Scanner scan = new Scanner(System.in);//System.in 키보드 입력값
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		
		if(com==0)
			System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위");
		if(com==2)
			System.out.println("컴퓨터:보");
			
		if(user==0)
			System.out.println("사용자:가위");
		if(user==1)
			System.out.println("사용자:바위");
		if(user==2)
			System.out.println("사용자:보");
		//결과
		//컴퓨터 =>가위,바위,보			
		/*	if(com==0){
				if(user==0)
					System.out.println("비겼다");
				if(user==1)
					System.out.println("사용자가이겼다");
				if(user==2)
					System.out.println("사용자가졌다");
			}		
			if(com==1){
				if(user==0)
					System.out.println("사용자가이겼다");
				if(user==1)
					System.out.println("비겼다");
				if(user==2)
					System.out.println("사용자가졌다");
			}
			if(com==2){
				if(user==0)
					System.out.println("사용자가졌다");
				if(user==1)
					System.out.println("사용자가이겼다");
				if(user==2)	
					System.out.println("비겼다");*/
				
				/*
				 * com-user
				 * 	컴퓨터(com)
				 * 	0(가위)
				 * 		사용자(user)
				 * 		0(가위)==> 0        비김
				 * 		1(바위)==> -1  사용자가이김
				 * 		2(보)==> -2  사용자가짐
				 *	1(바위)
				 *		0 ==> 1 사용자가짐
				 *		1 ==> 0 비김
				 *		2 ==> -1 사용자가이김
				 *	2(보)
				 *		0 ==> 2 사용자가 이김
				 *		1 ==> 1 사용자가짐
				 *		2 ==> 0비김
				 * 사용자가 이긴경우 ==> -1,2 일때
				 * 사용자가 진경우 ==> -2, 1일때
				 * 비긴경우 ==> 0
				 * 
				 */
				
				int res=com-user;
				if(res==-1 || res==2)
					System.out.println("사용자가 이겼다");
				if(res==-2 || res==1)
					System.out.println("사용자가 졌다");
				if(res==0)
					System.out.println("비겼다");
		
	}

}

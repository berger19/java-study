/*
 * 정수를 입력을 받아서 구구단을 출력
 * 
 * 		3
 * 		3*1=3
 * 		--
 * 		--
 * 		3*9=27
 */
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scan=new Scanner(System.in);
		System.out.print("정수(2~9)입력");
		int dan=scan.nextInt();
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}*/
		
		//int sum=0;
	/*	for(int i=1;i<=100;i++){
			sum+=i;
			System.out.println(i+":"+sum);
		}
		System.out.println("sum="+sum);*/ // 총합값
		//1~100 : 짝수의 합, 홀수의 합, 전체의 합을 구한다.
		int sum1=0;
		int sum2=0;
		int Total=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum1+=i;
			}
			else{
				sum2+=i;
			}
			Total+=i;
			System.out.println(i+":"+Total);
		}
		System.out.println("1~100까지 짝수의 합 =" + sum1);
		System.out.println("1~100까지 홀수의 합 =" + sum2);
		System.out.println("Total="+Total);
		
		
	}

}

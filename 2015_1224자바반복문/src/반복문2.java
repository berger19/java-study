/*
 * ������ �Է��� �޾Ƽ� �������� ���
 * 
 * 		3
 * 		3*1=3
 * 		--
 * 		--
 * 		3*9=27
 */
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scan=new Scanner(System.in);
		System.out.print("����(2~9)�Է�");
		int dan=scan.nextInt();
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}*/
		
		//int sum=0;
	/*	for(int i=1;i<=100;i++){
			sum+=i;
			System.out.println(i+":"+sum);
		}
		System.out.println("sum="+sum);*/ // ���հ�
		//1~100 : ¦���� ��, Ȧ���� ��, ��ü�� ���� ���Ѵ�.
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
		System.out.println("1~100���� ¦���� �� =" + sum1);
		System.out.println("1~100���� Ȧ���� �� =" + sum2);
		System.out.println("Total="+Total);
		
		
	}

}

/*
 *  ����if
 *  	1.����
 *  		if(���ǹ�) //T
 *  			����1
 *  		else //F
 *  			����2
 *  
 *  		if(���ǹ�) //T
 *  		{
 *  		����1
 *  		����2
 * 			}
 * 			else //F
 * 			{
 * 			����1
 * 			����2
 * 			}
 * 
 */
import java.util.Scanner;
public class ���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100������ ���� �Է�");
		int num=scan.nextInt();
		if(num<1 || num>100){
			System.out.println("�߸��� �Է��Դϴ�");
		}
		else{
			System.out.println("�����Է��Դϴ�");
		}
		
		if(num%2==0){
			System.out.println(num+"�� ¦����");
		}
		else{
			System.out.println(num+"�� Ȧ����");
		}
		
	}

}

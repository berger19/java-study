/*
 * 		���׿�����
 * 		    1. ���� 
 * 				��ġ������    int a=10;
 * 							  int b=++a
 * 
 * 				��ġ������    int a=10
 * 							  int b=a++
 * 
 * 		����������(���ǹ� => if)
 * 			boolean bCheck=false;
 * 			bCheck=!bCheck;
 * 			bCheck=true
 * 
 * 		���׿�����
 * 			1.���������
 * 				=> ����ȯ( => ����� ū ������������ ��ȯ)
 * 						ex) int +long = long
 * 							 int+int+double =double
 * 				=> / ����� '0'���� ������ error
 * 					����/���� = ����(�Ǽ��� ����)
 * 				=>  %
 * 					���� ���� �׻� �������� ��ȣ�� ������
 * 					-5%2=-1
 * 					5%-2=1
 * 
 * 			2.���迬����(==, !=, < , >, <= , >=)
 * 				����� : true / false (boolean���� ����)
 * 
 * 			3.��������( &&, || )
 *				 && ===> ���ʿ� true => true
 *				 || ===> ������ true = true
 *
 * 			4.���Կ�����( =, +=, -=)
 * 				int a=10
 * 					a+=1
 * 					b-=1
 * 
 */

// �⵵�� �Է� �޾� �������� ���θ� Ȯ��
/*
 * 		������ ���� ==> 4�⿡ �ѹ��� ���� / 100�⿡ �ѹ��� ����
 *						   400�⸶�� ����
 *
 *			if((year%4==0 && year%100!=0) || (year%400))
 *				���� ����ϴ� ���� �Է� == > ���ʸ� true�� ��� true (|| ���)
 */
//	���
/*		�⺻ ���ǹ�
 * 		if(���ǹ�){
 * 			���ǹ��� true �϶� ����
 *    }
 *     else{
 *     		���ǹ��� false �϶� ����
 *     }
 *     
 *     
 *     ����if��
 *     if(���ǹ�){
 *     }
 *     else if(���ǹ�){
 *     }
 *     else if(���ǹ�){
 *     }
 *     else{
 *     } // ������ �����ϴ�.
 *     
 *     �ݺ���
 *        
 * 
 */
import java.util.Scanner;
public class �ڹٿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵�� �Է��Ͻÿ�");
		int year=scan.nextInt();
		if((year%4==0 && year%100==0) || (year%400==0))
			System.out.println(year+"�⵵�� �����Դϴ�.");
		else{
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
		}

	}

}

/*
 * 	��� : ���α׷��� �°� ��� �ϴ� ���α׷�
 * 	���ǹ�
 * 	(1)���� IF
 * 		1. ����
 * 			=>if(���ǹ�)
 * `			����  ====>���ǹ��� true�� ���� ����
 * 				   ====>���ǹ��� false�� ������ �������� ����
 * 			=>�������� ������ ���ÿ� ����
 * 				if(���ǹ�)
 * 				{
 * 					����1 //������
 * 					����2 //���� ����
 * 				}
 *              ****** �ڹٿ��� ����� {}�� ���� ��쿡
 *              	   �ٷ� �ؿ� �ִ� ���� �ϳ��� ����
 *           =>������ true, false �϶� �ٸ� ������ ����
 *           	if(���ǹ�)
 *                 ����1
 *              else
 *                 ����2
 *			
 *
 * 
 * 
 */
import java.util.Scanner;
//Scanner : Ű���� �Է°��� �޴°��
public class ���ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����  Math.random()==>>�������� ���ڸ� �̾��ָ�, �⺻������ 0.0~0.99�� �̾��ָ�
		//					  1~100���� ������ �ϸ� �̾ȿ��� �̾Ƴ�
		/*int rand=(int)(Math.random()*100)+1;
		System.out.println("rand="+rand);*/
		/*Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�");
		int num=scan.nextInt();
		System.out.println("num="+num);*/
		
		int com=(int)(Math.random()*3);
		Scanner scan = new Scanner(System.in);//System.in Ű���� �Է°�
		System.out.print("����(0),����(1),��(2) �Է�:");
		int user=scan.nextInt();
		
		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
			
		if(user==0)
			System.out.println("�����:����");
		if(user==1)
			System.out.println("�����:����");
		if(user==2)
			System.out.println("�����:��");
		//���
		//��ǻ�� =>����,����,��			
		/*	if(com==0){
				if(user==0)
					System.out.println("����");
				if(user==1)
					System.out.println("����ڰ��̰��");
				if(user==2)
					System.out.println("����ڰ�����");
			}		
			if(com==1){
				if(user==0)
					System.out.println("����ڰ��̰��");
				if(user==1)
					System.out.println("����");
				if(user==2)
					System.out.println("����ڰ�����");
			}
			if(com==2){
				if(user==0)
					System.out.println("����ڰ�����");
				if(user==1)
					System.out.println("����ڰ��̰��");
				if(user==2)	
					System.out.println("����");*/
				
				/*
				 * com-user
				 * 	��ǻ��(com)
				 * 	0(����)
				 * 		�����(user)
				 * 		0(����)==> 0        ���
				 * 		1(����)==> -1  ����ڰ��̱�
				 * 		2(��)==> -2  ����ڰ���
				 *	1(����)
				 *		0 ==> 1 ����ڰ���
				 *		1 ==> 0 ���
				 *		2 ==> -1 ����ڰ��̱�
				 *	2(��)
				 *		0 ==> 2 ����ڰ� �̱�
				 *		1 ==> 1 ����ڰ���
				 *		2 ==> 0���
				 * ����ڰ� �̱��� ==> -1,2 �϶�
				 * ����ڰ� ����� ==> -2, 1�϶�
				 * ����� ==> 0
				 * 
				 */
				
				int res=com-user;
				if(res==-1 || res==2)
					System.out.println("����ڰ� �̰��");
				if(res==-2 || res==1)
					System.out.println("����ڰ� ����");
				if(res==0)
					System.out.println("����");
		
	}

}

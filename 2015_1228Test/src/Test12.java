/*
 * 			���� : ����� �������� �޸� �ּ� ��Ī
 * 					���� ������ ���� ����
 * 					������ �����ؼ� ����� ����
 * 			==========================
 * 			ó��
 * 				=������
 * 				=���׿�����
 * 				=���������
 * 				=��������
 * 				=���迬����
 * 				=���Կ�����(=, +=, -=)
 * 			=���
 * 				=���ǹ�(if / if~else / if~else if....else)
 * 				=���ù�(switch~case)
 * 				=�ݺ���(for, while)
 * 				=�ݺ����(break, continue)	
 * 
 * 			break : �ݺ������� �ߴ��� ��
 * 			continue	: Ư���κ��� ���� �ϰ� ���ư� =>for�� ��쿡��(���������� ������)/while�� ���(���ǽ����� ������)
 * 
 */
//���� �߱�����
/*
 * 		3   4   5 => 1 2 3(0S 1B)
 * 					=> 4 5 6(0S 2B)
 * 					=> 3 5 4(1S 2B)
 * 					=> 3 4 5(3S 0B) =>break 
 */
/*
 * 			1. ���� �߻� ===> ���� 3�� ������
 * 			2. �Է¿�û ====> ����� 3�� ���� �Է�
 * 			3. �Է°���, �������� ��
 * 			4. ��Ʈ����
 * 			5. 3S���� Ȯ�� => ���� ������ 2������(continue)
 * 			6. break ���ӳ�
 */
import java.util.Scanner;
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com={7,5,8};
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("���ڸ� ������ �Է��ϼ��� : ");
			int input=scan.nextInt();
			if(input<100 || input>999){
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0]){
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�.");
			}
			//ó����
			int s=0;
			int b=0;
			for(int i=0 ; i<3 ; i++){
				for(int j=0 ; j<3 ; j++){
					if(com[i]==user[j]){
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//��� ���
			System.out.printf("Input Number : %d, Relsult : %dS-%dB\n", input,s,b);
			System.out.println("==========================");
			System.out.print("S : ");
			for(int i=0 ; i<s ; i++){
				System.out.print("��");
			}
			System.out.println();
			System.out.print("B : ");
			for(int i=0 ; i<b ; i++){
				System.out.print("��");
			}
			System.out.println();
			System.out.println("===========================");
			if(s==3)
				System.out.println("�����Դϴ�.");
				System.out.println("\"Game Over!!\"");
				System.out.println();
				break;
			
		}
		
	}

}

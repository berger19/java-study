import java.util.Scanner;

/*
 * 		1. ��� ���(�ߺ����� ���� ���� �Ѵ� => int[] com
 * 					   �Է°��ϰ� ����� �Ѵ� => int[] user
 * 					   ���ΰ� ���ں� => s, b
 * 					   ��Ʈ�� ���� => s,b
 * 					   ���� => s==3
 * 
 * 			test coding
 * 			aba(X)   abba(O) �¿� ��Ī���� ����üũ�ϰ� t/f���� �����ϴ� �ڵ�
 */
public class ���ھ߱����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		int[] user=new int[3];
		int s,b;
		//���� ���� �ߺ����� ���� �߻�
		int su=0; // ���� �����ϴ� ����
		boolean bDash=false; //�ߺ����� Ȯ���ϴ� ����
		for(int i=0; i<3; i++){
			bDash=true;
			while(bDash){
				su=(int)(Math.random()*9)+1;//���ڸ� ���ڷ� ���ϱ� ���� 1~9
				bDash=false;
				for(int j=0; j<i; j++){
					if(com[j]==su){
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
		}
/*		for(int i=0; i<3; i++){
			System.out.print(com[i]+"  ");
		}*/
		Scanner	scan=new Scanner(System.in);
		//������ ���������� ������ ������ while(Ƚ�� ����)
		while(true){
			//����� �Է�
			System.out.print("���ڸ� ������ �Է��ϼ��� : ");
			int input=scan.nextInt();
			//���ڸ� ������ �ƴϸ� ����ó�� �ؾ���
			if(input<100 || input>999){
				System.out.println("���ڸ� ������ �Է��ؾ� �մϴ�.");
				continue;//for�� �϶��� ���������� �̵� / while���� ���ǽ����� �̵���
			}
			//���ڰ� ��
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]){
				System.out.println("�ߺ��� ���� ����� �� ������.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0){
				System.out.println("0�� �Է��� �� �����ϴ�.");
				continue;
			}
			s=0;
			b=0; //������ ���ڰ� �����ǹǷ� ���⼭ ��� ������ �ʱ�ȭ �����ش�.
			for(int i=0; i<3; i++){ //com
				for(int j=0; j<3; j++){ //user
					if(com[i]==user[j]){  // �񱳽� �������� �ִ��� ���� �˻�
						if(i==j)// �迭���� ���� �ڸ��� ������ ��Ʈ����ũ �̹Ƿ�
							s++;
						else
							b++;
							
						}
					}
				}
			System.out.printf("Input Number : %d, Result : %dS-%dB\n",input,s,b);
			if(s==3)
				System.out.println("�����Դϴ�.");
				break;
			}
			//��Ʈ �ֱ�
			//������ ���� ����
			
		}
	}


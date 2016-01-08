/*
 * ��ɼ���
 * 		1. �ߺ����� ���� �߻�
 *    ===============
 * 		2. ����� �Է°� �䱸
 * 		3. ������ �Է°� ��
 * 		4. ��Ʈ�� �����Ѵ�
 * 		5. ���Ῡ�� Ȯ���Ѵ�
 *    =============== ���� ���ư��� ��
 */
import java.util.Scanner;
public class �޼ҵ���ھ߱����� {
	/*
	 * �������� : ������ / ���������� �ݵ�� �ʱ�ȭ�� �ȴ�.(�����Է�/ �ƴϸ� scan.nextInt()/�ƴϸ� Math.random())
	 * 				=====> {}�ȿ����� ����
	 * 
	 * 		�������� ����
	 * 			1. �޼ҵ�ȿ��� ����Ǵ°� 
	 * 			2. �Ű�����
	 * 			3. ��������, ��������, ����ġ����, �÷��׺���
	 */
	
		//����
	static int[] getRand(){
		int[] com=new int[3];
		int su=0; //������ �߻��� ������ ����
		boolean bDash=false; //�ߺ����� Ȯ��
		for(int i=0; i<3; i++){
			bDash=true;
			while(bDash){ //���� �߻�, �ߺ�üũ
				su=(int)(Math.random()*9)+1; // 1~9����
				bDash=false;
				for(int j=0; j<i; j++){
					if(com[i]==su){
						bDash=true;
						break; //continue �� break�� �ڽ��� �ݺ��������� / ��� ���ξȿ� for ���� �����Ѵ�.
					}
				}
			}
			com[i]=su;
		}
		return com; // ���ϰ��� 1���� / �����Ͱ� ������=�迭, Ŭ����
	}
	/*====================================================*/
		//������Է�
		static int[] userInput(){
			Scanner scan=new Scanner(System.in);
			int[] user=new int[3];
			int input=0;
			while(true){
				System.out.print("���ڸ� ������ �Է��ϼ��� : ");
				input=scan.nextInt();
				if(input<100 || input>999){
					System.out.println("���ڸ� ������ �Է��ؾ� �մϴ�.");
					continue; // while���� ���ǽ����� ���ư�
				}
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]){
					System.out.println("�ߺ��� ���� ����� �� �����ϴ�.");
					continue;
				}
				if(user[0]==0 || user[1]==0 || user[2]==0){
					System.out.println("0�� �Է��� �� �����ϴ�.");
					continue;
				}
				break;
				
			}
			return user;
		}
/*		=================================================*/
		//��
		static int comapare(int[] com, int[] user){
			int s=0;
			int b=0;
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(com[i]==user[j]){
						if(i==j)// �迭���� ���� �ڸ��� ������ ��Ʈ����ũ �̹Ƿ�
							s++;
						else
							b++;
					}
				}
			}
			hint(user, s, b);
			return s;
		}
/*		============================================================================*/
		//��Ʈ
		static void hint(int[] user, int s, int b){
			System.out.printf("Input Number : %d-%d-%d, Reasult : %dS-%dB\n",user[0], user[1], user[2], s, b);
		}
		//����
		static boolean isEnd(int s){
			boolean bCheck=false;
			if(s==3){
				bCheck=true;
				System.out.println("Game Over!!");
			}
				return bCheck;
		}
		/*====================================================================*/
		//����
	static void process(){
		int[] com=getRand();
		while(true){
			int[] user=userInput();
			int s=comapare(com,user);
			if(isEnd(s)){
				Scanner scan=new Scanner(System.in);
				System.out.print("������ �ٽ��ұ��?(y/n)?");
				String res=scan.next();
				char ch=res.charAt(0);
				if(ch=='y'){
					System.out.println("�������� �����Ͽ����ϴ�.");
					process();
				}	
				else{
					System.out.println("Game Over!!");
					System.exit(0);
				}
			}
		}
	}
		
		/*int[] user=userInput();
		for(int i=0; i<3; i++){
			System.out.print(com[i]+"  ");
		}
		System.out.println();
		for(int i=0; i<3; i++){
			
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return�� ��� ���α׷��� ������ �ǹ������� void�� ������ ��������
		process();
	}

}

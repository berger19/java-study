import java.util.Scanner;

/*
 * 		1~45���� 6���� �ߺ����� ���� �߻�
 * 		����ڰ� 6�� �Է�
 * 		3=>4
 * 		4=>3
 * 		5=>2
 * 		6=>1
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] com=new int[6];
		int[] user=new int[6];
		int su=0; // ���� �����ϴ� ����
		boolean bDash=false; //�ߺ����� Ȯ���ϴ� ����
		for(int i=0; i<6; i++){
			bDash=true;
			while(bDash){
				su=(int)(Math.random()*45)+1;//���ڸ� ���ڷ� ���ϱ� ���� 1~45
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
		for(int i=0; i<6; i++){
			System.out.println("1~45���� ������ �Է��ϼ��� : ");
			int no=scan.nextInt();
			if(no<0 || no>45){
				System.out.println("1~45���� ������ �Է��ϼ���");
				i--;
				continue;
			}
			user[i]=no;
		}
		System.out.printf("�ζ� ��÷��ȣ : ");
		for(int i=0; i<6; i++){
			System.out.print(com[i]+"\t");
		}
		System.out.println();
		System.out.printf("���� �Է°� : ");
		for(int i=0; i<6; i++){
			System.out.print(user[i]+"\t");
		}
		System.out.println();
		int count=0;
		for(int i=0; i<6; i++){
			if(com[i]==user[i]){
				count++;
			}
		}
		switch(count){
		case 0:
		case 1:
		case 2: 
			System.out.print("��"); 
			break;
		case 3: 
			System.out.print("4�� ��÷"); 
			break;
		case 4: 
			System.out.print("3�� ��÷"); 
			break;
		case 5: 
			System.out.print("2�� ��÷"); 
			break;
		case 6: 
			System.out.print("1�� ��÷"); 
			break;
		}
	}

}

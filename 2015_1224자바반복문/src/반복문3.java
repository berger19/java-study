/*
 * 
 */
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//������ ������ �߻��Ѵ�. => 1~100���� �߻�//(Math.random()*100) =>�Ǽ��� ǥ��
		int com=(int)(Math.random()*100)+1;//(1.0~100.00)�ϹǷ� int���� (Math.random() 
		int count=0;                                   //=> �Ǽ��� ǥ��(0.0~0.99)ǥ��
		for(;;){//���� �����߻��ϴ� ��					
			System.out.print("1~100���� ������ ���� �Է�");
			int user=scan.nextInt();
			if(user<1 || user>100){
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			++count;
			//��
			if(com>user){
				System.out.println("�Է°����� �������� �Է��ϼ���.");
			}
			else if(user>com){
				System.out.println("�Է°����� �������� �Է��ϼ���.");
			}
			else{
				System.out.println("Game Over");
				System.out.println("�Է�Ƚ�� : " + count);
				break;
			}
	
		}

	}
}
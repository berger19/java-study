//While��
//���� �Է¹޾Ƽ� => �ش� ���� ���
//�Է°�
import java.util.Scanner;
public class �ݺ���2 {
	static void gugudan(){
		Scanner scan=new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int dan=scan.nextInt();
		//���� �޾Ƽ� �������� ����ض�
		int i=1;
		while(i<=9){
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		System.out.println();
		System.out.println("do~while�� ó��");
		i=1;//�������� �ٲ��� ������ int�� ���� �ʰ� ���� ������ �ʱ�ȭ ��Ű�°��� ����(���� ���� ����)-��Ͼȿ���
		do{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}while(i<=9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �Է��ض�
		�ݺ���2.gugudan();
	}
}

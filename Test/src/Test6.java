import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print(" ���̸� �Է��ϼ��� : ");
		int num=scan.nextInt();
		
		if(num<15)
			System.out.println("��ȭ�� ������ �� �����ϴ�.");
		else if(num>=15 && num<19)
			System.out.println("������ ������ ��� ��ȭ�� ������ �� �ֽ��ϴ�.");
		else if(num>=19)
			System.out.println("��ȭ�� ������ �� �ֽ��ϴ�.");

	}

}

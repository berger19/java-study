import java.util.Scanner;
public class ����5_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է°� : ");
		int  num=scan.nextInt();
		if(num<0)
			System.out.println("0�̸�");
		else if(num>=0 && num<100)
			System.out.println("0�̻� 100�̸�");
		else if(num>=100 && num<200)
			System.out.println("100 �̻� 200�̸�");
		else if(num>=200 && num<300)
			System.out.println("200�̻� 300�̸�");
		else
			System.out.println("300 �̻�");
		
	}

}

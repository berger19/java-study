/*
 *    �� �� ���� �޾Ƽ� �ش� ������ ���
 *    1. ��������
 *    2. �� ���� 1. 1. 1 => 2015.12.31=>%7 (������ ����)
 */
import java.util.Scanner;
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�");
		int year=scan.nextInt();
		
		System.out.print("�� �Է�");
		int month=scan.nextInt();
		
		System.out.print("�� �Է�");
		int day=scan.nextInt();
		//���⵵
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		int[] lastDay={
				31,28,31,30,31,30,31,31,30,31,30,31
		};
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		// 2015�� 12�� 28�� ���� ��� ��
		for(int i=0;i<month-1;i++){
			total+=lastDay[i];
		}
		total+=day;
		int week=total%7;
		switch(week){
		case 0:
			System.out.println("�Ͽ��� �Դϴ�.");
			break;
		case 1:
			System.out.println("������ �Դϴ�.");
			break;
		case 2:
			System.out.println("ȭ���� �Դϴ�.");
			break;
		case 3:
			System.out.println("������ �Դϴ�.");
			break;
		case 4:
			System.out.println("����� �Դϴ�.");
			break;
		case 5:
			System.out.println("�ݿ��� �Դϴ�.");
			break;
		case 6:
			System.out.println("����� �Դϴ�.");
			break;
			
		}
	}

}

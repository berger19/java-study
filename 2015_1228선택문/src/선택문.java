/*
 * 		���ప�� 1���϶� �����
 * 		switch~case
 * 				
 * 				switch(����/����){
 * 					case ����/����:
 * 						���۹���
 * 						break;
 * 					case ����/����:
 * 						���۹���
 * 						break;
 * 					case ����/����:
 * 						���۹���
 * 						break;
 * 					case ����/����:
 * 						���۹���
 * 						break;
 * 					default:
 * 						���๮��
 * 
 */
import java.util.Scanner;
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 3�� �ޱ�
		//swithch~case�� �̿��ؼ� ���� ���
		Scanner scan=new Scanner(System.in);
		System.out.print("�������� : ");
		int kor=scan.nextInt();
		System.out.print("�������� : ");
		int eng=scan.nextInt();
		System.out.print("�������� : ");
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		
		switch(avg/10){
		case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;
		default:
			System.out.println("F����");
		}
	
	}

}

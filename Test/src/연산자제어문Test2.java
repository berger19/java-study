import java.util.Scanner;
public class ���������Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���������Է� : ");
		int kor=scan.nextInt();
		System.out.println("���������Է� : ");
		int eng=scan.nextInt();
		System.out.println("���������Է� : ");
		int math=scan.nextInt();
		
		int Total=kor+eng+math;
		double avg=Total/3.0;
		
		System.out.println("���� : " + Total);
		System.out.printf("��� : %.2f", avg);
		
		
	}

}

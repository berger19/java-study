import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� : ");
		int  kor=scan.nextInt();
		System.out.println("�������� : ");
		int  math=scan.nextInt();
		System.out.println("�������� : ");
		int  eng=scan.nextInt();
		
		int Total=kor+math+eng;
		double Avg=Total/3.0;
		
		System.out.println("���� : "+kor);
		System.out.println("���� : "+math);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+Total);
		System.out.printf("��� : %.2f", Avg);
		
	}

}

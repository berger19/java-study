import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù��° �Ǽ� : ");
		double d1=scan.nextDouble(); //�Ǽ� ǥ��
		System.out.print("�ι�° �Ǽ� : ");
		double d2=scan.nextDouble();
		
		System.out.println("======�����======");
		System.out.printf("%.2f+%.2f=%.2f\n",d1,d2,d1+d2);
		System.out.printf("%.2f-%.2f=%.2f\n",d1,d2,d1-d2);
		System.out.printf("%.2f*%.2f=%.2f\n",d1,d2,d1*d2);
		
		
	}

}

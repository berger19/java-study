import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num=scan.nextInt();
		
		if(num%3==0)
			System.out.println(num+"��(��) 3�� ����Դϴ�.");
		if(num%5==0)
			System.out.println(num+"��(��) 5�� ����Դϴ�.");
		if(num%8==0)
			System.out.println(num+"��(��) 8�� ����Դϴ�.");
	}

}

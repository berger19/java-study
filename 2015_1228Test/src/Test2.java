import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� : ");
		int  i=scan.nextInt();
		if(i%2==0){
			System.out.println(i+"��(��) ¦���Դϴ�.");
		}else{
			System.out.println(i+"��(��) Ȧ���Դϴ�");
		}
	}

}

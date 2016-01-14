import java.util.Scanner;
public class 문제5_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력값 : ");
		int  num=scan.nextInt();
		if(num<0)
			System.out.println("0미만");
		else if(num>=0 && num<100)
			System.out.println("0이상 100미만");
		else if(num>=100 && num<200)
			System.out.println("100 이상 200미만");
		else if(num>=200 && num<300)
			System.out.println("200이상 300미만");
		else
			System.out.println("300 이상");
		
	}

}

import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���������Է� : ");
		int  kor=scan.nextInt();
		System.out.print("���������Է� : ");
		int  eng=scan.nextInt();
		
		int total=kor+eng;
		int avg=(kor+eng)/2;
		
		if(avg<=100 && avg>=90)
			System.out.print("���� : "+"A");
		else if(avg<=90 && avg>=80)
				System.out.print("���� : "+"B");
		else if(avg<=80 && avg>=70)
			System.out.print("���� : "+"C");
		else if(avg<=70 && avg>=60)
			System.out.print("���� : "+"D");
		else
			System.out.print("���� : "+"F");	
		
	}

}

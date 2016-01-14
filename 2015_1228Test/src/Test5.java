import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수입력 : ");
		int  kor=scan.nextInt();
		System.out.print("영어점수입력 : ");
		int  eng=scan.nextInt();
		
		int total=kor+eng;
		int avg=(kor+eng)/2;
		
		if(avg<=100 && avg>=90)
			System.out.print("학점 : "+"A");
		else if(avg<=90 && avg>=80)
				System.out.print("학점 : "+"B");
		else if(avg<=80 && avg>=70)
			System.out.print("학점 : "+"C");
		else if(avg<=70 && avg>=60)
			System.out.print("학점 : "+"D");
		else
			System.out.print("학점 : "+"F");	
		
	}

}

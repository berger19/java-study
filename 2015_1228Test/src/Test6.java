import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수입력 : ");
		int  kor=scan.nextInt();
		System.out.print("영어점수입력 : ");
		int  eng=scan.nextInt();
		
		int total=kor+eng;
		int avg=((kor+eng)/2)/10;
		
		switch(avg){
		case(10):
			System.out.println("A");
			break;
		case(9):
			System.out.println("A");
			break;
		case(8):
			System.out.println("B");
			break;
		case(7):
			System.out.println("C");
			break;
		case(6):
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
		}
	}

}

import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 : ");
		int  kor=scan.nextInt();
		System.out.println("수학점수 : ");
		int  math=scan.nextInt();
		System.out.println("영어점수 : ");
		int  eng=scan.nextInt();
		
		int Total=kor+math+eng;
		double Avg=Total/3.0;
		
		System.out.println("국어 : "+kor);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+Total);
		System.out.printf("평균 : %.2f", Avg);
		
	}

}

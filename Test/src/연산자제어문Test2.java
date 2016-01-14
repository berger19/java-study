import java.util.Scanner;
public class 연산자제어문Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("국어점수입력 : ");
		int kor=scan.nextInt();
		System.out.println("영어점수입력 : ");
		int eng=scan.nextInt();
		System.out.println("수학점수입력 : ");
		int math=scan.nextInt();
		
		int Total=kor+eng+math;
		double avg=Total/3.0;
		
		System.out.println("총점 : " + Total);
		System.out.printf("평균 : %.2f", avg);
		
		
	}

}

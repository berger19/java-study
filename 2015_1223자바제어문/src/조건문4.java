import java.util.Scanner;
public class 조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("국어점수입력:");
		int mis=scan.nextInt();
		System.out.println("수학점수입력:");
		int db=scan.nextInt();
		System.out.println("영어점수입력:");
		int cs=scan.nextInt();
		
		int total=mis+cs+db;
		double avg=total/3.0;
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n", avg);
		
		
/*		System.out.println("국어점수:");
		int kor=scan.nextInt();
		System.out.println("수학점수:");
		int math=scan.nextInt();
		System.out.println("영어점수:");
		int eng=scan.nextInt();
		
		int total=kor+math+eng;
		double avg=total/3.0;
		System.out.println("total="+total);
		System.out.printf("평균:%.2f\n",avg);*/
		
		/*
		 * 학점 산출
		 */
		
		
		if (mis<=100 && mis>=90)
			System.out.println("A");
		if (mis<90 && mis>=80)
			System.out.println("B");
		if (mis<80 && mis>=70)
			System.out.println("C");
		if (mis<70 && mis>=60)
			System.out.println("D");
		if (mis<60)
			System.out.println("F");
		

		if (db<=100 && db>=90)
			System.out.println("A");
		if (db<90 && db>=80)
			System.out.println("B");
		if (db<80 && mis>=70)
			System.out.println("C");
		if (db<70 && db>=60)
			System.out.println("D");
		if (db<60)
			System.out.println("F");
		

		if (cs<=100 && cs>=90)
			System.out.println("A");
		if (cs<90 && cs>=80)
			System.out.println("B");
		if (cs<80 && cs>=70)
			System.out.println("C");
		if (cs<70 && cs>=60)
			System.out.println("D");
		if (cs<60)
			System.out.println("F");
		
		




	}

}

import java.util.Scanner;
public class ���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���������Է�:");
		int mis=scan.nextInt();
		System.out.println("���������Է�:");
		int db=scan.nextInt();
		System.out.println("���������Է�:");
		int cs=scan.nextInt();
		
		int total=mis+cs+db;
		double avg=total/3.0;
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n", avg);
		
		
/*		System.out.println("��������:");
		int kor=scan.nextInt();
		System.out.println("��������:");
		int math=scan.nextInt();
		System.out.println("��������:");
		int eng=scan.nextInt();
		
		int total=kor+math+eng;
		double avg=total/3.0;
		System.out.println("total="+total);
		System.out.printf("���:%.2f\n",avg);*/
		
		/*
		 * ���� ����
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

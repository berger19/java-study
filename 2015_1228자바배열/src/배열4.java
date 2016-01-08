/*
 *    년 월 일을 받아서 해당 요일을 계산
 *    1. 윤년조건
 *    2. 총 날수 1. 1. 1 => 2015.12.31=>%7 (요일이 나옴)
 */
import java.util.Scanner;
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력");
		int year=scan.nextInt();
		
		System.out.print("월 입력");
		int month=scan.nextInt();
		
		System.out.print("일 입력");
		int day=scan.nextInt();
		//전년도
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		int[] lastDay={
				31,28,31,30,31,30,31,31,30,31,30,31
		};
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		// 2015년 12월 28일 까지 계산 함
		for(int i=0;i<month-1;i++){
			total+=lastDay[i];
		}
		total+=day;
		int week=total%7;
		switch(week){
		case 0:
			System.out.println("일요일 입니다.");
			break;
		case 1:
			System.out.println("월요일 입니다.");
			break;
		case 2:
			System.out.println("화요일 입니다.");
			break;
		case 3:
			System.out.println("수요일 입니다.");
			break;
		case 4:
			System.out.println("목요일 입니다.");
			break;
		case 5:
			System.out.println("금요일 입니다.");
			break;
		case 6:
			System.out.println("토요일 입니다.");
			break;
			
		}
	}

}

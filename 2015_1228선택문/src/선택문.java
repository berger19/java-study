/*
 * 		실행값이 1개일때 사용함
 * 		switch~case
 * 				
 * 				switch(정수/문자){
 * 					case 정수/문자:
 * 						실핼문장
 * 						break;
 * 					case 정수/문자:
 * 						실핼문장
 * 						break;
 * 					case 정수/문자:
 * 						실핼문장
 * 						break;
 * 					case 정수/문자:
 * 						실핼문장
 * 						break;
 * 					default:
 * 						실행문장
 * 
 */
import java.util.Scanner;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수 3개 받기
		//swithch~case를 이용해서 학점 출력
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor=scan.nextInt();
		System.out.print("영어점수 : ");
		int eng=scan.nextInt();
		System.out.print("수학점수 : ");
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		
		switch(avg/10){
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
	
	}

}

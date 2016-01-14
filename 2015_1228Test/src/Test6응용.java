//총점, 평균, 학점, 등수(3명의 학생 점수로 산출)
/*
 * 배열(array)
 * 	=연속적인 메모리 배치
 * 	=같은 데이터형을 모아서 관리
 * 	형식
 * 		데이터형[] 배열명; => 권장사항
 * 		데이터형 배열명[]; => (c언어 형식)
 * 
 * 		예)
 * 			int[](인트변수의 메모리 생성) a(변수명)=new int[5](a의 변수에 5개의 변수를 넣을 수 있음을 의미)
 * 			int[] a=new int[5];
 * 			int[] a={1,2,3,4,5};
 */
import java.util.Scanner;
public class Test6응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; // new가 들어가면 변수들의 값이 초기화
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hak=new char[3];
		int[] rank=new int[3];
		//int[] [] jumsu=new int[3] [7]; =>이차원 배열
		Scanner scan=new Scanner(System.in);
		for(int i=0 ; i<3 ; i++){
			System.out.printf("%d번째 국어점수 입력", (i+1));
			kor[i]=scan.nextInt();
			System.out.printf("%d번째 영어점수 입력", (i+1));
			eng[i]=scan.nextInt();
			System.out.printf("%d번째 수학점수 입력", (i+1));
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//등수

		for(int i=0 ; i<3 ; i++){
			rank[i]=1;
			for(int j=0 ; j<3 ; j++){
				if(total[i]<total[j]){
					rank[i]++;
				}
			}
		}
	//학점

		char score='A';
		for(int i=0 ; i<3 ; i++){
			switch((int)avg[i]/10){
			case 10:
				score='A';
				break;
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
			}
		hak[i]=score;
		}

		System.out.printf("%5s%5s%5s%7s%10s%10s%10s\n","국어","영어","수학","총점","평균","등수","학점");
		for(int i=0 ; i<3 ; i++){
			System.out.printf("%5d%5d%5d%7d%10.2f%10d%10c\n", kor[i], eng[i], math[i], total[i], avg[i],rank[i],hak[i]);
		}
	}

}

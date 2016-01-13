/*
 * 		메소드 구성요소
 * 			=>결과값(리턴형)
 * 			=>입력값(사용자) => 매개변수(지역변수) 
 * 				: 메소드 안에서 사용하는 변수
 * 					* 사용자 입력값
 * 					*다른 메소드로 전송
 * 					============>전체에서 사용하는 변수를 준다.(맴버변수)
 * 					변수) 맴버변수 : 프로그램 종료시에 사라진다.
 * 									= instance변수 : 저장이 따로 되는 변수(객체변수)
 * 									= static변수 : 저장공간이 1개다.(공유변수)
 * 					        지역변수 = {}안에서만 사용되는 변수({}가 닫히면 해당 변수는 사라진다.)
 * 
 * 		=> 형식)
 * 					=====================
 * 						리턴형				매개변수
 * 					=====================
 * 						  O					O
 * 					=====================
 * 						  O                    X
 * 					=====================
 * 					      X                    O		=> 리턴형이 없는 경우에는 void를 붙인다.
 * 					=====================
 * 						  X                    X
 * 					=====================
 * 
 * 				1) string substring(int a, int b)
 * 				2) double random()
 * 				3) void print(String s)
 * 				4) void actionPerformd
 * 
 * 				=> 형식)
 * 						선언부 => 인터페이스 , 추상클래스
 * 						구현부 => 
 * 						String substring(int s, int e) ==> 여기까지가 선언부	
 *						}
 *							구현부
 * 						{
 * 
 * 		=> String 클래스
 * 			사용법 
 * 				String   s      =      값
 * 				====	  =변수           ==
 * 				데이터형(사용자 정의)
 * 
 * 				같은값을 새로운 메모리에 저장 : new
 * 				String s1=new String("aaa")
 * 				String s2=new String("aaa")
 * 				String s3=new String("aaa")
 *				String s4=new String("aaa")
 *				String s5=new String("aaa")
 *				String s6=new String("aaa") //각각 다른 주소값을 가진다.
 *
 *		=> 주요기능
 *			1) subString
 *			2) indexOf, lastTndexOf
 *			3) StsrtsWith, endsWith
 *			4) trim()
 *			5) length()
 *			6) valueOf
 *			7) split
 *			8) replace, replaceAll
 *			9)charAt
 *==================================================
 *		이차원 배열 : 일차원 배열 여러개를 모아서 관리
 *			형식)
 * 				데이터형[행][열] 배열명 ;
 * 				데이터형 배열명[행][열];
 * 				데이터형[행] 배열명[열];
 * 
 * 				행 : 줄수 or 사람수 => 일차 for문
 * 				열 : 데이터 갯수 => 이차 for문
 * 
 * 				예) 5명의 학생   
 * 						국어, 영어, 수학, 총점, 평균. 학점
 * 				[5][6]
 * 
 * 			int[][] arr=new int[5][5];
 * 			int k=0;
 * 			for(int i=0; i<5; i++){
 * 				for(int j=0; j<=i; j++){
 * 					arr[i][j]=k;
 * 					k++;
 * 			}
 * 		}
 */					
public class 메소드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	메소드1 a=new 메소드1();
		System.out.println(a);*/
		int[][] arr=new int[5][5];
		int k=1;
		for(int i=0; i<5; i++){
			for(int j=i; j<=4; j++){
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<5;j++)
				if(arr[i][j]==0){
					System.out.print("\t");
				}else{
					System.out.print(arr[i][j]+"\t");
				}
			System.out.println("\n");
			
		}

	}

}

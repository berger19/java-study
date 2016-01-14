

/*
 * 		기능 : 1) 난수 발생 ==> 배열에 저장
 * 				2) 출력 ==> 출력(배열된 숫자들)
 * 				3) 입력하게 만듬 ==> 정수를 입력
 * 				4) 종료하는지 여부 ==> 배열의 순서를 따져본다.(1~\9까지 가는지)
 * 				5) 퍼즐 조립하는 것 ==>
 * 
 * 		변수
 * 			1) 변수의 종류
 *															메모리위치          메모리저장시점 				
 * 				static(공통변수,클래스변수)				mathod          컴파일시 자동 저장(클래스 전체)
 * 				==>메모리 공간 1개(주소값 1개로 사용)
 * 				instance(객체변수,개별변수)			heap             new연산자 사용시에 저장(클래스전체)
 * 				===>변수 개수만큼 메모리 공간을 사용
 * 				local(일반지역변수)						stack            메소드 호출시에 저장(메소드안에서만 사용됨)
 * 
 */
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
public class 퍼즐게임 {
	static int[][] panCount=new int[3][3];
	static int brow, bcol;
	//맴버변수 => 자동으로 초기화 시킨다.
	//난수 발생
	static void getRand(){
		int[] temp=new int[9];
		int su=0;
		boolean bDash=false;
		for(int i=0; i<9; i++){
			bDash=true;
			while(bDash){
				//난수 발생
				su=(int)(Math.random()*9);
				bDash=false;
				for(int j=0; j<i; j++){
					if(temp[j]==su){
						bDash=true;
						break;//중복검사
					}
				}
			}
			temp[i]=su;
			panCount[i/3][i%3]=temp[i];//1차원을 2차원으로 바꾸는 공식(for문안의 i값 활용)
			if(su==8){
				brow=i/3;
				bcol=i%3;
			}
		}
	}
	static void display(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i==brow && j==bcol)
					System.out.print("\t");
				else
					System.out.print((panCount[i][j]+1)+"\t");
			}
			System.out.println("\n");
		}
	}
	static void process(){
		getRand();
		display();
		System.out.println();
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("1~8까지  정수를 입력하세요 : ");
			int input=scan.nextInt();
			int a=0;
			int b=0;
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if((panCount[i][j]+1)==input){
						a=i;
						b=j;
						break;
					}

				}
			}
			panCount[brow][bcol]=panCount[a][b];
			panCount[a][b]=8;
			brow=a;
			bcol=b;
			display();
			if(isEnd()){
				System.out.println("Game Over");
				break;
			}
		}
		
	}
	static boolean isEnd(){
		int k=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3;j++){
				if(panCount[i][j]!=k)
					return false;
					k++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

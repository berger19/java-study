/*
 * 기능설정
 * 		1. 중복없는 난수 발생
 *    ===============
 * 		2. 사용자 입력값 요구
 * 		3. 난수와 입력값 비교
 * 		4. 힌트를 제시한다
 * 		5. 종료여부 확인한다
 *    =============== 루프 돌아가는 곳
 */
import java.util.Scanner;
public class 메소드숫자야구게임 {
	/*
	 * 지역변수 : 사용범위 / 지역변수는 반드시 초기화가 된다.(직접입력/ 아니면 scan.nextInt()/아니면 Math.random())
	 * 				=====> {}안에서만 사용됨
	 * 
	 * 		지역변수 종류
	 * 			1. 메소드안에서 선언되는것 
	 * 			2. 매개변수
	 * 			3. 누적변수, 루프변수, 스위치변수, 플러그변수
	 */
	
		//난수
	static int[] getRand(){
		int[] com=new int[3];
		int su=0; //난수를 발생시 저장할 변수
		boolean bDash=false; //중복여부 확인
		for(int i=0; i<3; i++){
			bDash=true;
			while(bDash){ //난수 발생, 중복체크
				su=(int)(Math.random()*9)+1; // 1~9까지
				bDash=false;
				for(int j=0; j<i; j++){
					if(com[i]==su){
						bDash=true;
						break; //continue 와 break는 자신의 반복문만제어 / 상기 가로안에 for 문만 제어한다.
					}
				}
			}
			com[i]=su;
		}
		return com; // 리턴값은 1개다 / 데이터가 여러개=배열, 클래스
	}
	/*====================================================*/
		//사용자입력
		static int[] userInput(){
			Scanner scan=new Scanner(System.in);
			int[] user=new int[3];
			int input=0;
			while(true){
				System.out.print("세자리 정수를 입력하세요 : ");
				input=scan.nextInt();
				if(input<100 || input>999){
					System.out.println("세자리 정수만 입력해야 합니다.");
					continue; // while문의 조건식으로 돌아감
				}
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]){
					System.out.println("중복된 수는 사용할 수 없습니다.");
					continue;
				}
				if(user[0]==0 || user[1]==0 || user[2]==0){
					System.out.println("0은 입력할 수 없습니다.");
					continue;
				}
				break;
				
			}
			return user;
		}
/*		=================================================*/
		//비교
		static int comapare(int[] com, int[] user){
			int s=0;
			int b=0;
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(com[i]==user[j]){
						if(i==j)// 배열에서 같은 자리에 있으면 스트라이크 이므로
							s++;
						else
							b++;
					}
				}
			}
			hint(user, s, b);
			return s;
		}
/*		============================================================================*/
		//힌트
		static void hint(int[] user, int s, int b){
			System.out.printf("Input Number : %d-%d-%d, Reasult : %dS-%dB\n",user[0], user[1], user[2], s, b);
		}
		//종료
		static boolean isEnd(int s){
			boolean bCheck=false;
			if(s==3){
				bCheck=true;
				System.out.println("Game Over!!");
			}
				return bCheck;
		}
		/*====================================================================*/
		//조립
	static void process(){
		int[] com=getRand();
		while(true){
			int[] user=userInput();
			int s=comapare(com,user);
			if(isEnd(s)){
				Scanner scan=new Scanner(System.in);
				System.out.print("게임을 다시할까요?(y/n)?");
				String res=scan.next();
				char ch=res.charAt(0);
				if(ch=='y'){
					System.out.println("새게임을 시작하였습니다.");
					process();
				}	
				else{
					System.out.println("Game Over!!");
					System.exit(0);
				}
			}
		}
	}
		
		/*int[] user=userInput();
		for(int i=0; i<3; i++){
			System.out.print(com[i]+"  ");
		}
		System.out.println();
		for(int i=0; i<3; i++){
			
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return은 상기 프로그램이 끝남을 의미하지만 void가 붙으면 생략가능
		process();
	}

}

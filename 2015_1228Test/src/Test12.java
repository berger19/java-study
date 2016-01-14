/*
 * 			변수 : 저장된 데이터의 메모리 주소 별칭
 * 					단일 데이터 저장 가능
 * 					변수는 변경해서 사용이 가능
 * 			==========================
 * 			처리
 * 				=연산자
 * 				=단항연산자
 * 				=산술연산자
 * 				=논리연산자
 * 				=관계연산자
 * 				=대입연산자(=, +=, -=)
 * 			=제어문
 * 				=조건문(if / if~else / if~else if....else)
 * 				=선택문(switch~case)
 * 				=반복문(for, while)
 * 				=반복제어문(break, continue)	
 * 
 * 			break : 반복수행을 중단할 때
 * 			continue	: 특정부분을 제외 하고 돌아감 =>for일 경우에는(증가식으로 내려감)/while일 경우(조건식으로 내려감)
 * 
 */
//숫자 야구게임
/*
 * 		3   4   5 => 1 2 3(0S 1B)
 * 					=> 4 5 6(0S 2B)
 * 					=> 3 5 4(1S 2B)
 * 					=> 3 4 5(3S 0B) =>break 
 */
/*
 * 			1. 난수 발생 ===> 숫자 3개 저장함
 * 			2. 입력요청 ====> 사용자 3개 정수 입력
 * 			3. 입력값과, 난수값을 비교
 * 			4. 힌트제공
 * 			5. 3S인지 확인 => 맞지 않으면 2번으로(continue)
 * 			6. break 게임끝
 */
import java.util.Scanner;
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com={7,5,8};
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("세자리 정수를 입력하세요 : ");
			int input=scan.nextInt();
			if(input<100 || input>999){
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0]){
				System.out.println("중복된 수는 사용할 수 없습니다.");
			}
			//처리비교
			int s=0;
			int b=0;
			for(int i=0 ; i<3 ; i++){
				for(int j=0 ; j<3 ; j++){
					if(com[i]==user[j]){
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//결과 출력
			System.out.printf("Input Number : %d, Relsult : %dS-%dB\n", input,s,b);
			System.out.println("==========================");
			System.out.print("S : ");
			for(int i=0 ; i<s ; i++){
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B : ");
			for(int i=0 ; i<b ; i++){
				System.out.print("○");
			}
			System.out.println();
			System.out.println("===========================");
			if(s==3)
				System.out.println("정답입니다.");
				System.out.println("\"Game Over!!\"");
				System.out.println();
				break;
			
		}
		
	}

}

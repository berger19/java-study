import java.util.Scanner;

/*
 * 		1. 기능 잡기(중복없는 난수 여야 한다 => int[] com
 * 					   입력값하고 맞춰야 한다 => int[] user
 * 					   서로간 숫자비교 => s, b
 * 					   힌트를 제시 => s,b
 * 					   종료 => s==3
 * 
 * 			test coding
 * 			aba(X)   abba(O) 좌우 대칭인지 오류체크하고 t/f인지 구분하는 코딩
 */
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		int[] user=new int[3];
		int s,b;
		//이후 부터 중복없는 난수 발생
		int su=0; // 난수 저장하는 변수
		boolean bDash=false; //중복여부 확인하는 변수
		for(int i=0; i<3; i++){
			bDash=true;
			while(bDash){
				su=(int)(Math.random()*9)+1;//한자리 숫자로 비교하기 때문 1~9
				bDash=false;
				for(int j=0; j<i; j++){
					if(com[j]==su){
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
		}
/*		for(int i=0; i<3; i++){
			System.out.print(com[i]+"  ");
		}*/
		Scanner	scan=new Scanner(System.in);
		//게임이 끝날때까지 돌리기 때문에 while(횟수 지정)
		while(true){
			//사용자 입력
			System.out.print("세자리 정수를 입력하세요 : ");
			int input=scan.nextInt();
			//세자리 정수가 아니면 오류처리 해야함
			if(input<100 || input>999){
				System.out.println("세자리 정수만 입력해야 합니다.");
				continue;//for문 일때는 증가식으로 이동 / while문은 조건식으로 이동함
			}
			//숫자간 비교
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]){
				System.out.println("중복된 수는 사용할 수 없습다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0){
				System.out.println("0은 입력할 수 없습니다.");
				continue;
			}
			s=0;
			b=0; //위에서 숫자가 누적되므로 여기서 상기 변수를 초기화 시켜준다.
			for(int i=0; i<3; i++){ //com
				for(int j=0; j<3; j++){ //user
					if(com[i]==user[j]){  // 비교시 같은수가 있는지 여부 검색
						if(i==j)// 배열에서 같은 자리에 있으면 스트라이크 이므로
							s++;
						else
							b++;
							
						}
					}
				}
			System.out.printf("Input Number : %d, Result : %dS-%dB\n",input,s,b);
			if(s==3)
				System.out.println("정답입니다.");
				break;
			}
			//힌트 주기
			//조건이 맞음 종료
			
		}
	}


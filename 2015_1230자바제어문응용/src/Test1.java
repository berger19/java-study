import java.util.Scanner;

/*
 * 		1~45까지 6개의 중복없는 난수 발생
 * 		사용자가 6개 입력
 * 		3=>4
 * 		4=>3
 * 		5=>2
 * 		6=>1
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] com=new int[6];
		int[] user=new int[6];
		int su=0; // 난수 저장하는 변수
		boolean bDash=false; //중복여부 확인하는 변수
		for(int i=0; i<6; i++){
			bDash=true;
			while(bDash){
				su=(int)(Math.random()*45)+1;//한자리 숫자로 비교하기 때문 1~45
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
		for(int i=0; i<6; i++){
			System.out.println("1~45까지 정수를 입력하세요 : ");
			int no=scan.nextInt();
			if(no<0 || no>45){
				System.out.println("1~45까지 정수로 입력하세요");
				i--;
				continue;
			}
			user[i]=no;
		}
		System.out.printf("로또 당첨번호 : ");
		for(int i=0; i<6; i++){
			System.out.print(com[i]+"\t");
		}
		System.out.println();
		System.out.printf("본인 입력값 : ");
		for(int i=0; i<6; i++){
			System.out.print(user[i]+"\t");
		}
		System.out.println();
		int count=0;
		for(int i=0; i<6; i++){
			if(com[i]==user[i]){
				count++;
			}
		}
		switch(count){
		case 0:
		case 1:
		case 2: 
			System.out.print("꽝"); 
			break;
		case 3: 
			System.out.print("4등 당첨"); 
			break;
		case 4: 
			System.out.print("3등 당첨"); 
			break;
		case 5: 
			System.out.print("2등 당첨"); 
			break;
		case 6: 
			System.out.print("1등 당첨"); 
			break;
		}
	}

}

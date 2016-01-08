/*
 * 
 */
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//임의의 난수를 발생한다. => 1~100사이 발생//(Math.random()*100) =>실수를 표현
		int com=(int)(Math.random()*100)+1;//(1.0~100.00)하므로 int붙임 (Math.random() 
		int count=0;                                   //=> 실수를 표현(0.0~0.99)표현
		for(;;){//무한 루프발생하는 식					
			System.out.print("1~100까지 사이의 정수 입력");
			int user=scan.nextInt();
			if(user<1 || user>100){
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			++count;
			//비교
			if(com>user){
				System.out.println("입력값보다 높은수를 입력하세요.");
			}
			else if(user>com){
				System.out.println("입력값보다 낮은수를 입력하세요.");
			}
			else{
				System.out.println("Game Over");
				System.out.println("입력횟수 : " + count);
				break;
			}
	
		}

	}
}
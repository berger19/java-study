//While문
//단을 입력받아서 => 해당 단을 출력
//입력값
import java.util.Scanner;
public class 반복문2 {
	static void gugudan(){
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력 : ");
		int dan=scan.nextInt();
		//단을 받아서 구구단을 출력해라
		int i=1;
		while(i<=9){
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		System.out.println();
		System.out.println("do~while문 처리");
		i=1;//변수명이 바뀌지 않으면 int를 넣지 않고 위의 변수를 초기화 시키는것을 선언(변수 재사용 가능)-블록안에서
		do{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}while(i<=9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단을 입력해라
		반복문2.gugudan();
	}
}

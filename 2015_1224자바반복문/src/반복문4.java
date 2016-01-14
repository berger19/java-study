/*
 * 		for
 * 			형식)
 * 							1		2		5	
 * 					for(초기화;조건식;증가식){
 * 							실행문장	3
 * 							실행문장	4
 * 					}
 * 					1=>2=>3=>4=>5
 * 					  =>2=>3=>4=>5
 * 						................... 계속 반복되다가 2번이 false면 종료
 * 					for(;;) =>무한 루프이므로 문장 끝에 break걸어줌
 * 							  =>continu 이전에 걸린 조건문을 제외하고 처음단계부터 다시 실행됨
 */
// 1-2+3-4+5-6+7-8+9-10

public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=0;
		for(int i=1;i<=10;i++){
		if(i%2==1)
			val+=i;
		else
			val-=i;
		}
		System.out.println("산술결과 : " + val);
		
		for(char ch='A'; ch<='Z'; ch++){
			System.out.println(ch+" ");
			System.out.println((char)(ch+32)+" ");
		}
	}
}
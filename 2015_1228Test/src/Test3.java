/*
 * 		1~100 루프(반복문) === 기술면접문제
 * 				for : 반복횟수 지정
 * 				while : 반복횟수가 지정이 없는 경우 ==> 선조건
 * 				do~while : 반드시 한번 이상 수행 ==> 후조건
 * 
 * 
 */


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		for(int i=1; i<=100; i++){
				if(i%2==0){
					num1+=i;
				}else{
					num2+=i;	
				}
			}
		System.out.println("홀수의 합 : " +num2);
		System.out.println("짝수의 합 : " +num1);
		/*
		 * 단항연산자
		 * 		=증감연산자(++, --)
		 * 			한개 증가 또는 한개 감소 시키는 역활 수행(전치연산자=먼저 증가후 연산, 후치연산자=연산수행후 증가)
		 * 		=부정연산자(!) : boolean연사자 사용
		 * 			true => false
		 * 			false => true
		 * 	
		 */
	}
}


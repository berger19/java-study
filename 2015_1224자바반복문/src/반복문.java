/*
 * 	자바 => 반복문
 * 		for  :  반복 횟수가 지정이 된 경우에 주로 사용
 * 		while  :  반복횟수가 지정이 되지 않을 경우에 주로 사용(무한반복)
 *     ========================================> 위둘은 수행을 안할 수 있다.
 *     																			조건을 먼저 거치므로 수행 안할 수 있음
 *     for(조건문){ ====>조건이 맞지 않으면 실행 안됨
 *     	실행문장
 *     }
 *     
 *     while(조건문){ ===> 조건이 맞지 않으면 실행 안됨
 *     실행문장
 *     }
 *     
 * 		do~while  : 무조건 한번 이상 수행해야 할 때 사용 =>먼저 수행 후 조건을 거치므로 한번 이상은 수행
 * 
 * 		do{
 * 			실행문장 === 첫번째
 * 		}while(조건문) == 두번째로 실행 되므로 한번은 돌아감
 * 
 *                  1      2      4
 * 		ex) for(초기값;조건식;증가식){
 * 			반복실행문장 3
 * 			}
 * 					1 => 2  =>3  =>4
 * 					   =>2   =>3  =>4
 *                    =>2   =>3  =>4 (4번이 수행되고 2번으로 갔을때 false이 될때 수행이 끝남)
 * 
 * 
 * 			for(int i=1;i<=10;i++){
 *                 문장
 *                 }
 * 
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
			System.out.print("정수= "+i+"\t");
		}
	}

}

/*
 * 		반복문
 * 			for=지정된 횟수
 * 				for(;;) => 무한루프(break로 멈춤)
 * 			while=지정이 없는 횟수
 * 				초기값 
 * 				while(조건식){
 * 					실행문장;
 * 					증가식;
 * 				}	=>조건식이 false면 종료
 *				 
 * 			do~while=한번이상 수행
 * 				초기값
 * 				do{
 * 					반복수행문장
 * 					중거식
 * 				}while(조건식);	
 * 				
 * 				int i=1
 * 				do{
 * 					system.out.println("i="+i);
 * 					i++;
 * 				}while(i<=10);
 * 
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For문 수행");
		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("While문 수행");
		int i=1;
		while(i<=10){
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		System.out.println("Do~While문 수행");
		i=1;
		do{
			System.out.print(i+"\t");
			i++;
		}while(i<=10);
		
	}

}

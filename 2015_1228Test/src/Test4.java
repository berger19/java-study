// 1~100 까지 출력
/*
 *   이차 for문
 *   for(초기값;조건식;증가식) => 줄수(y축)
 *   		for(초기값;조건식;증가식) => 열수(X축) =>for문 안에 for문은 안의 for문을 하나의 문장으로 볼것
 * 
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1 ; i<=100 ; i++){
			for(int j=1; j<=10; j++){
				System.out.print(i+"\t");
			}
		System.out.println();
		}
	}

}

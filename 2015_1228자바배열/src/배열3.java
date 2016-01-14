// 난수를 발생 5개 ==> 최대값, 최소값 출력
/*
 *     ===========
 *        0 0 0 0 0
 *     ===========
 */
public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		for(int i=0;i<score.length;i++){
			score[i]=(int)(Math.random()*100)+1;
		}
		int max=0; //난수 발생시 구역을 정함에 있어서 최대값은 최소값으로 가져다 나와야 거기서 부터 시작한다
		int min=100; //
		for(int i=0;i<score.length;i++){
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		System.out.println("실제 난수값");
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+"  ");
		}
			
	}

}

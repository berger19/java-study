
public class 반복문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
/*			if(i==5 || i==7) continue;
				System.out.println("i="+i);*/
			if(i%2==0) continue;//홀수 출력 continue(상기값 제외하고돌림) 안붙으면 짝수 출력
				System.out.println("i="+i);
		}
	}

}

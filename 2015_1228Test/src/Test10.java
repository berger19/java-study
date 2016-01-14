// 1~100의 3의 배수를 구하고 3의 배수의 합을 구하라
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int val=0;
		do{
			if(i%3==0){
				val+=i;
				System.out.print(i+"\t");
			}
			i++;
		}while(i<=100);
		System.out.print("\n3의 배수의 합 : "+val );
	}

}

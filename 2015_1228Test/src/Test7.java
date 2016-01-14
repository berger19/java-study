
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		for(int i=1 ; i<=50 ; i++){
			if(i%5==0){
				System.out.print(i+"\t");
				num1+=i;
			}
		}
		System.out.println();
		System.out.print("5의 배수의 합 : "+num1);
	}

}

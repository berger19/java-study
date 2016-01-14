
public class bookTest5_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		while(num<=1000){
			if(num%2==0 || num%7==0){
				System.out.print(num+"\t");
				sum+=num;
			}
			num++;
		}
		System.out.println();
		System.out.println("2또는 7의 배수의 합은 : "+sum);
	}

}

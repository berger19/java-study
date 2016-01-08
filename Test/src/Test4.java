import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		
		if(num%2==0){
			System.out.println(num+"은(는) 짝수");
		}
		else{
			System.out.println(num+"은(는) 홀수");
		}

	}
}


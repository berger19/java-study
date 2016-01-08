import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 : ");
		int  i=scan.nextInt();
		if(i%2==0){
			System.out.println(i+"은(는) 짝수입니다.");
		}else{
			System.out.println(i+"은(는) 홀수입니다");
		}
	}

}

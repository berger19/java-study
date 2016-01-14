import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("´ÜÀÔ·Â : ");
		int  dan=scan.nextInt();
		
		for(int i=1 ; i<=9 ; i++){
				System.out.print(dan+"*"+i+"="+dan*i+"\t");
				System.out.println();
				
			}
		}
	}



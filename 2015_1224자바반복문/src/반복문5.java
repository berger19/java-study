/*
 * 			���� �߻� ===> O , X
 */
import java.util.Scanner;
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(int i=1; i<=10; i++){
			int dap=(int)(Math.random()*2);//0,1 �ΰ��� ���ڸ� ���� �߻���Ŵ
			System.out.print("X(0), O(1)");
			int user=scan.nextInt();
			if(dap==0){
				System.out.println("X");
			}
			if(dap==1){
				System.out.println("O");
			}
			if(user==0){
				System.out.println("X");
			}
			if(user==1){
				System.out.println("O");
			}
			if(dap==user){
				count++;
			}
			System.out.println("ä����� : " + (count*10)+"��");
			
		}
		
	}

}

import java.util.Scanner;

// charAt : ���ڿ����� ���ϴ� ���ڸ� �Ѱ� �޴´�.
/*
 * 		string str="abcdef";
 * 		char c=str.charAt(1);  => ���� b�� ��µȴ�. 0���� ����
 */

public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ��� �Է��Ͻÿ� : ");
		String data=scan.next();
		int count=0;
		for(int i=0; i<data.length(); i++){
			char c=data.charAt(i);
			if(c=='a' || c=='A'){
				count++;
			}
		}
		System.out.println("a �Ǵ� A�� �� "+count+"��");
	}

}

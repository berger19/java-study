import java.util.Scanner;

// charAt : 문자열에서 원하는 문자를 한개 받는다.
/*
 * 		string str="abcdef";
 * 		char c=str.charAt(1);  => 값은 b로 출력된다. 0부터 시작
 */

public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳을 입력하시요 : ");
		String data=scan.next();
		int count=0;
		for(int i=0; i<data.length(); i++){
			char c=data.charAt(i);
			if(c=='a' || c=='A'){
				count++;
			}
		}
		System.out.println("a 또는 A가 총 "+count+"개");
	}

}

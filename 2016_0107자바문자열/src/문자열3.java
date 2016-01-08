import java.util.Scanner;

public class 문자열3 {
	static String calc(int a, char op, int b){
		String str="";
		int res=0;
		switch (op) {
		case '+':
			res=a+b;
			str=String.valueOf(res);
			break;
		case '-':
			res=a-b;
			str=String.valueOf(res);
			break;
		case '*':
			res=a*b;
			str=String.valueOf(res);
			break;
		case '/':
			if(b==0)
				str="0으로 나눌수 없습니다.";
			else{
				res=a/b;
				str=String.valueOf(res);
			}break;
		default:
			str="잘못된 연산자 입니다.";
		}
		return str;
	}
	static void process(){
	Scanner scan=new Scanner(System.in);
	System.out.print("첫번째 정수를 입력하세요 : ");
	int a=scan.nextInt();
	System.out.print("연산자 입력(+-*/) : ");
	String op=scan.next();
	System.out.print("두번째 정수를 입력하세요 : ");
	int b=scan.nextInt();
	String result=calc(a,op.charAt(0),b);
	System.out.print("결과 : "+result);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		process();
	}

}

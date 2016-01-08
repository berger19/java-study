import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print(" 나이를 입력하세요 : ");
		int num=scan.nextInt();
		
		if(num<15)
			System.out.println("영화를 관람할 수 없습니다.");
		else if(num>=15 && num<19)
			System.out.println("성인을 동반한 경우 영화를 관람할 수 있습니다.");
		else if(num>=19)
			System.out.println("영화를 관람할 수 있습니다.");

	}

}

//���Ǽ� 5���� �Է� �޾� �ּҰ� �ִ밪 �̾� ����
import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=new int[5];
		int max=0, min=100;
		for(int i=0; i<5; i++){
			val[i]=(int)(Math.random()*100)+1;
			System.out.print(val[i]+"\t");
		}
		System.out.println();
		
		for(int i=0 ; i<5 ; i++){
			if(max<val[i])
				max=val[i];
			if(min>val[i])
				min=val[i];
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}

}
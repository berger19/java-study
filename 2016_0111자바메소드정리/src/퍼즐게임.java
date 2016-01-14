

/*
 * 		��� : 1) ���� �߻� ==> �迭�� ����
 * 				2) ��� ==> ���(�迭�� ���ڵ�)
 * 				3) �Է��ϰ� ���� ==> ������ �Է�
 * 				4) �����ϴ��� ���� ==> �迭�� ������ ��������.(1~\9���� ������)
 * 				5) ���� �����ϴ� �� ==>
 * 
 * 		����
 * 			1) ������ ����
 *															�޸���ġ          �޸�������� 				
 * 				static(���뺯��,Ŭ��������)				mathod          �����Ͻ� �ڵ� ����(Ŭ���� ��ü)
 * 				==>�޸� ���� 1��(�ּҰ� 1���� ���)
 * 				instance(��ü����,��������)			heap             new������ ���ÿ� ����(Ŭ������ü)
 * 				===>���� ������ŭ �޸� ������ ���
 * 				local(�Ϲ���������)						stack            �޼ҵ� ȣ��ÿ� ����(�޼ҵ�ȿ����� ����)
 * 
 */
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
public class ������� {
	static int[][] panCount=new int[3][3];
	static int brow, bcol;
	//�ɹ����� => �ڵ����� �ʱ�ȭ ��Ų��.
	//���� �߻�
	static void getRand(){
		int[] temp=new int[9];
		int su=0;
		boolean bDash=false;
		for(int i=0; i<9; i++){
			bDash=true;
			while(bDash){
				//���� �߻�
				su=(int)(Math.random()*9);
				bDash=false;
				for(int j=0; j<i; j++){
					if(temp[j]==su){
						bDash=true;
						break;//�ߺ��˻�
					}
				}
			}
			temp[i]=su;
			panCount[i/3][i%3]=temp[i];//1������ 2�������� �ٲٴ� ����(for������ i�� Ȱ��)
			if(su==8){
				brow=i/3;
				bcol=i%3;
			}
		}
	}
	static void display(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i==brow && j==bcol)
					System.out.print("\t");
				else
					System.out.print((panCount[i][j]+1)+"\t");
			}
			System.out.println("\n");
		}
	}
	static void process(){
		getRand();
		display();
		System.out.println();
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("1~8����  ������ �Է��ϼ��� : ");
			int input=scan.nextInt();
			int a=0;
			int b=0;
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if((panCount[i][j]+1)==input){
						a=i;
						b=j;
						break;
					}

				}
			}
			panCount[brow][bcol]=panCount[a][b];
			panCount[a][b]=8;
			brow=a;
			bcol=b;
			display();
			if(isEnd()){
				System.out.println("Game Over");
				break;
			}
		}
		
	}
	static boolean isEnd(){
		int k=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3;j++){
				if(panCount[i][j]!=k)
					return false;
					k++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

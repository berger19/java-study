/*
 * 		for
 * 			����)
 * 							1		2		5	
 * 					for(�ʱ�ȭ;���ǽ�;������){
 * 							���๮��	3
 * 							���๮��	4
 * 					}
 * 					1=>2=>3=>4=>5
 * 					  =>2=>3=>4=>5
 * 						................... ��� �ݺ��Ǵٰ� 2���� false�� ����
 * 					for(;;) =>���� �����̹Ƿ� ���� ���� break�ɾ���
 * 							  =>continu ������ �ɸ� ���ǹ��� �����ϰ� ó���ܰ���� �ٽ� �����
 */
// 1-2+3-4+5-6+7-8+9-10

public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=0;
		for(int i=1;i<=10;i++){
		if(i%2==1)
			val+=i;
		else
			val-=i;
		}
		System.out.println("������ : " + val);
		
		for(char ch='A'; ch<='Z'; ch++){
			System.out.println(ch+" ");
			System.out.println((char)(ch+32)+" ");
		}
	}
}
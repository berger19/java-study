/*
 * 		�ݺ���
 * 			for=������ Ƚ��
 * 				for(;;) => ���ѷ���(break�� ����)
 * 			while=������ ���� Ƚ��
 * 				�ʱⰪ 
 * 				while(���ǽ�){
 * 					���๮��;
 * 					������;
 * 				}	=>���ǽ��� false�� ����
 *				 
 * 			do~while=�ѹ��̻� ����
 * 				�ʱⰪ
 * 				do{
 * 					�ݺ����๮��
 * 					�߰Ž�
 * 				}while(���ǽ�);	
 * 				
 * 				int i=1
 * 				do{
 * 					system.out.println("i="+i);
 * 					i++;
 * 				}while(i<=10);
 * 
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For�� ����");
		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("While�� ����");
		int i=1;
		while(i<=10){
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		System.out.println("Do~While�� ����");
		i=1;
		do{
			System.out.print(i+"\t");
			i++;
		}while(i<=10);
		
	}

}

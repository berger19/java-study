/*
 * 		1~100 ����(�ݺ���) === �����������
 * 				for : �ݺ�Ƚ�� ����
 * 				while : �ݺ�Ƚ���� ������ ���� ��� ==> ������
 * 				do~while : �ݵ�� �ѹ� �̻� ���� ==> ������
 * 
 * 
 */


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		for(int i=1; i<=100; i++){
				if(i%2==0){
					num1+=i;
				}else{
					num2+=i;	
				}
			}
		System.out.println("Ȧ���� �� : " +num2);
		System.out.println("¦���� �� : " +num1);
		/*
		 * ���׿�����
		 * 		=����������(++, --)
		 * 			�Ѱ� ���� �Ǵ� �Ѱ� ���� ��Ű�� ��Ȱ ����(��ġ������=���� ������ ����, ��ġ������=��������� ����)
		 * 		=����������(!) : boolean������ ���
		 * 			true => false
		 * 			false => true
		 * 	
		 */
	}
}


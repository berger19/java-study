/*
 * 		1~10 ���� �߻�=>�ߺ����� ���� �߻�
 * 		1. �����߻�
 * 		2. ������ �ߺ��� �ִ��� ���� Ȯ��
 * 		3. �ߺ�(O) => ���� �߻�
 * 			�ߺ�(X) => ����
 * 			1) 10���� ������ �ʿ� => �迭
 * 			2) ���� ������
 * 			3) �ߺ����� üũ��
 * 
 */
public class �ߺ����³��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ߺ����� ����Ÿ�� �����ϴº���(������ �����ϴ� ����)
		int[] arr=new int[10];
		//����
		int su=0;
		//�ߺ����� Ȯ��(T/F)
		boolean bDash=false;

		for(int i=0; i<10; i++){
			//�ߺ��� ���� ������ �߻��Ҷ� ���� ���� ����(Ƚ���� ������ �ȵǹǷ� while��)
			bDash=true;
			while(bDash){
				//���� �߻� �� �ߺ�üũ
				su=(int)(Math.random()*10)+1;
				bDash=false;
				for(int j=0; j<i; j++){
					if(arr[j]==su){
						bDash=true;
						break; //while���� ���ǹ����� ����.(��� ���� �ȿ� for���� ��� �ȴ�)
					}/*else{
						bDash=false;
						break;
					}*/
				}
			}
			arr[i]=su;
		}
		//���
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+"  ");
		}
		
	}

}

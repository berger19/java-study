/*
 * 		����
 * 			1. ��������
 * 				: �ϳ��� ���ڸ� ���ϰ� �ٸ� ���ڸ� ���ϴ� ���(�տ����ڸ� ���������� ����)
 * 			2. ��������
 * 				: ���������� ��ĭ��(�����Ѱͳ���) �̵��ϸ鼭 ���ϴ� ���(�ڿ� ���ڸ� ������ ����)
 */
public class �޼ҵ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("������ :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
		
		System.out.println("������ : ");
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "  ");
		}
	}

}


public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		System.out.println("������ : ");
		for(int i=0; i<a.length; i++){
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		//�迭�ϱ�
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1-i; j++){
				if(a[j+1]>a[j]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			
				}
			}
		}
		System.out.println("������ : ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"  ");
		}
	}

}

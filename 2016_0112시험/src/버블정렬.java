
public class 버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[5];
		System.out.println("정렬전 : ");
		for(int i=0; i<5; i++){
			A[i]=(int)(Math.random()*99)+1;
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		
		//배열
		
		for(int i=0; i<A.length-1; i++){
			for(int j=0; j<A.length-1-i; j++){
				if(A[j]>A[j+1]){
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		System.out.println("정렬후 : ");
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+"\t");
		}
	}

}

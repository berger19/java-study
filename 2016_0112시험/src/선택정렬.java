
public class 선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[5];
		System.out.println("정렬전 : ");
		for(int i=0; i<A.length; i++){
			A[i]=(int)(Math.random()*99)+1;
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		//배열하기
		for(int i=0; i<A.length-1; i++){
			for(int j=i+1; j<A.length; j++){
				if(A[i]<A[j]){
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
			
				}
			}
		}
		System.out.println("정렬후 : ");
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+"\t");
		}
	}

}

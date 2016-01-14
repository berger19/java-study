
public class ¿ÞÂÊÁ÷°¢»ï°¢Çü2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A=new int[5][5];
		int K=1;
		for(int i=0; i<5; i++){
			for(int j=i; j>=0; j--){
				A[i][j]=K;
				K++;
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(A[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(A[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}


public class ¹è¿­5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A=new int[5][5];
		int k=1;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				A[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<5;j++){
			if((j+1)%5==1){
				System.out.print("\n");
				}
			System.out.print(A[i][j]+"\t");
			}
		}
	}
}

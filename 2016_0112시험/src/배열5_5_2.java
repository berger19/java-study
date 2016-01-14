
public class ¹è¿­5_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A=new int[5][5];
		int k=0;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				k+=1;
				A[j][i]=k;
			}
		}
		for(int j=0; j<5; j++){
			for(int i=0; i<5;i++){
			if((i+1)%5==1){
				System.out.print("\n");
				}
			System.out.print(A[j][i]+"\t");
			}
		}
	}

}

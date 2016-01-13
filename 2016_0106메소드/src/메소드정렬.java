/*
 * 		정렬
 * 			1. 선택정렬
 * 				: 하나의 숫자를 정하고 다른 숫자를 비교하는 방법(앞에숫자를 순차적으로 고정)
 * 			2. 버블정렬
 * 				: 순차적으로 한칸씩(인접한것끼리) 이동하면서 비교하는 방법(뒤에 숫자를 순차적 고정)
 */
public class 메소드정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("정렬전 :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
		
		System.out.println("정렬후 : ");
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

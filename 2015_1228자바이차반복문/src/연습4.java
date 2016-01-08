
public class 연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={70,50,80,90,95,86};
		System.out.println("정렬전 : ");
		for(int i=0;i<6;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("정렬후 : ");
		for(int i=0;i<5;i++){
			for(int j=i+1;j<6;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		for(int i=0;i<6;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}

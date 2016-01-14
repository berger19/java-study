/*
 * 		1~10 난수 발생=>중복없는 난수 발생
 * 		1. 난수발생
 * 		2. 난수가 중복이 있는지 여부 확인
 * 		3. 중복(O) => 난수 발생
 * 			중복(X) => 저장
 * 			1) 10개의 변수가 필요 => 배열
 * 			2) 난수 저장함
 * 			3) 중복여부 체크함
 * 
 */
public class 중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복없는 데이타를 저장하는변수(난수를 저장하는 변수)
		int[] arr=new int[10];
		//난수
		int su=0;
		//중복여부 확인(T/F)
		boolean bDash=false;

		for(int i=0; i<10; i++){
			//중복이 없는 난수가 발생할때 까지 루프 돌림(횟수가 지정이 안되므로 while문)
			bDash=true;
			while(bDash){
				//난수 발생 및 중복체크
				su=(int)(Math.random()*10)+1;
				bDash=false;
				for(int j=0; j<i; j++){
					if(arr[j]==su){
						bDash=true;
						break; //while문의 조건문으로 간다.(상기 가로 안에 for문만 제어가 된다)
					}/*else{
						bDash=false;
						break;
					}*/
				}
			}
			arr[i]=su;
		}
		//출력
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+"  ");
		}
		
	}

}

/*
 * 		배열
 * 		=같은 데이터형의 변수를 모아서 관리
 * 			변수(한옥집), 배열(아파트)
 * 		=일반 변수는 변수가 5개 일때 변수를 5개 설정해야 함
 * 		=배열은 1개의 배열명을 가지고 여러개의 데이터를 처리하는 장점이 있음
 * 			연속적으로 메모리 배치가 가능하여 관리가 쉽다.
 * 
 * 		1. 형식(정수면 정수끼리 캐릭터는 캐릭터 끼리 묶어줌)
 * 			int[] 배열명(1,2,3,4,5)
 * 			데이터형
 * 			int[] a={1,2,3,4,5}
 * 			a[0], a[1], a[2], a[3], a[4] =>일반 변수명으로 자동 전환되어 저장됨
 * 
 */
public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=(int)(Math.random()*45)+1;
		int a2=(int)(Math.random()*45)+1;
		int a3=(int)(Math.random()*45)+1;
		int a4=(int)(Math.random()*45)+1;
		int a5=(int)(Math.random()*45)+1;
		int a6=(int)(Math.random()*45)+1;
		
		System.out.println("첫번째 번호 : "+a1);
		System.out.println("두번째 번호 : "+a2);
		System.out.println("세번째 번호 : "+a3);
		System.out.println("네번째 번호 : "+a4);
		System.out.println("다섯번째 번호 : "+a5);
		System.out.println("여섯번째 번호 : "+a6);
		
		int[] arr=new int[6];
		for(int i=0;i<6;i++){
			arr[i]=(int)(Math.random()*45)+1;
			System.out.println("숫자 : "+arr[i]);
		}

	}

}

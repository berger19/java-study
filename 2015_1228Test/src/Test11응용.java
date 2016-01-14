//10명의 점수 저장 ==> 총합, 평균, 최대, 최소를 구하라
public class Test11응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student=new int[10];
		int sum=0;
		double avg=0.0;
		int max=0;
		int min=100;
		for(int i=0 ; i<10 ; i++){
			student[i]=(int)(Math.random()*101);
			//0~100난수 발생
			sum+=student[i];
		}
		avg=sum/10.0;
		for(int i=0 ; i<10 ; i++){
			if(max<student[i])
				max=student[i];
			if(min>student[i])
				min=student[i];
		}
		//출력
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}

}

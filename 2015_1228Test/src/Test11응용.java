//10���� ���� ���� ==> ����, ���, �ִ�, �ּҸ� ���϶�
public class Test11���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student=new int[10];
		int sum=0;
		double avg=0.0;
		int max=0;
		int min=100;
		for(int i=0 ; i<10 ; i++){
			student[i]=(int)(Math.random()*101);
			//0~100���� �߻�
			sum+=student[i];
		}
		avg=sum/10.0;
		for(int i=0 ; i<10 ; i++){
			if(max<student[i])
				max=student[i];
			if(min>student[i])
				min=student[i];
		}
		//���
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
	}

}

/*
 * 		�޼ҵ� �������
 * 			=>�����(������)
 * 			=>�Է°�(�����) => �Ű�����(��������) 
 * 				: �޼ҵ� �ȿ��� ����ϴ� ����
 * 					* ����� �Է°�
 * 					*�ٸ� �޼ҵ�� ����
 * 					============>��ü���� ����ϴ� ������ �ش�.(�ɹ�����)
 * 					����) �ɹ����� : ���α׷� ����ÿ� �������.
 * 									= instance���� : ������ ���� �Ǵ� ����(��ü����)
 * 									= static���� : ��������� 1����.(��������)
 * 					        �������� = {}�ȿ����� ���Ǵ� ����({}�� ������ �ش� ������ �������.)
 * 
 * 		=> ����)
 * 					=====================
 * 						������				�Ű�����
 * 					=====================
 * 						  O					O
 * 					=====================
 * 						  O                    X
 * 					=====================
 * 					      X                    O		=> �������� ���� ��쿡�� void�� ���δ�.
 * 					=====================
 * 						  X                    X
 * 					=====================
 * 
 * 				1) string substring(int a, int b)
 * 				2) double random()
 * 				3) void print(String s)
 * 				4) void actionPerformd
 * 
 * 				=> ����)
 * 						����� => �������̽� , �߻�Ŭ����
 * 						������ => 
 * 						String substring(int s, int e) ==> ��������� �����	
 *						}
 *							������
 * 						{
 * 
 * 		=> String Ŭ����
 * 			���� 
 * 				String   s      =      ��
 * 				====	  =����           ==
 * 				��������(����� ����)
 * 
 * 				�������� ���ο� �޸𸮿� ���� : new
 * 				String s1=new String("aaa")
 * 				String s2=new String("aaa")
 * 				String s3=new String("aaa")
 *				String s4=new String("aaa")
 *				String s5=new String("aaa")
 *				String s6=new String("aaa") //���� �ٸ� �ּҰ��� ������.
 *
 *		=> �ֿ���
 *			1) subString
 *			2) indexOf, lastTndexOf
 *			3) StsrtsWith, endsWith
 *			4) trim()
 *			5) length()
 *			6) valueOf
 *			7) split
 *			8) replace, replaceAll
 *			9)charAt
 *==================================================
 *		������ �迭 : ������ �迭 �������� ��Ƽ� ����
 *			����)
 * 				��������[��][��] �迭�� ;
 * 				�������� �迭��[��][��];
 * 				��������[��] �迭��[��];
 * 
 * 				�� : �ټ� or ����� => ���� for��
 * 				�� : ������ ���� => ���� for��
 * 
 * 				��) 5���� �л�   
 * 						����, ����, ����, ����, ���. ����
 * 				[5][6]
 * 
 * 			int[][] arr=new int[5][5];
 * 			int k=0;
 * 			for(int i=0; i<5; i++){
 * 				for(int j=0; j<=i; j++){
 * 					arr[i][j]=k;
 * 					k++;
 * 			}
 * 		}
 */					
public class �޼ҵ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	�޼ҵ�1 a=new �޼ҵ�1();
		System.out.println(a);*/
		int[][] arr=new int[5][5];
		int k=1;
		for(int i=0; i<5; i++){
			for(int j=i; j<=4; j++){
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<5;j++)
				if(arr[i][j]==0){
					System.out.print("\t");
				}else{
					System.out.print(arr[i][j]+"\t");
				}
			System.out.println("\n");
			
		}

	}

}

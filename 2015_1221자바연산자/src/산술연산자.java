
public class ��������� {
/*
 * 	���������
 * 	(+,-,*,/,%)
 * 	+,-,* : ����ȯ�� �� ����
 * 	10(ū������������ �ڵ� ��ȯ)+20.5=30.5
 *	
 *	int a=10.5+10.5(����)
 *
 *	int a=(10.5+10.5) ==>���ΰ� ���� ���� ==21
 *	int a=(int)10.5+(int)10.5 ==>���ΰ� ���� ���� int�� ���� ����Ǿ� ������ ��ȯ(20)
 *
 *	1. 0 ���� ������ ����(error)10/0=error
 *	2. ����/����=���� ==>10/3=3
 *
 *	% : ������� ���� ��ȣ�� ���´�
 *		5%2=1
 *		-5%2=-1
 *		-5%-2=-1
 *		5%-2=1
 *
 *		===>�������� 41������
 *		===>����, ���� ����� 42,43������
 *		===>����ȯ 64������(�ڵ�, ����)
 *			===>�ڷ����� ũ��(67������)
 *		===>�������� ����(72������)
 *		===>���������(74������)
 *		===>����������(92������, 93������)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=85;
		int eng=78;
		int math=80;
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("��������"+kor);
		System.out.println("��������"+eng);
		System.out.println("��������"+math);
		System.out.println("����"+total);
		System.out.println("���"+avg);
		System.out.printf("���:%.2f",avg);
		//���� : %c(����), %d(����), %f(�Ǽ�), $s(���ڿ�)
		
		System.out.println("5%2="+5%2);
		System.out.println("-5%2="+ -5%2);
		System.out.println("5%-2="+5%-2);
		System.out.println("-5%2="+ -5%-2);
		
		
	}

}

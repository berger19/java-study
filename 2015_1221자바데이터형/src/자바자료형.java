
public class �ڹ��ڷ��� {
	/*
	 * 	�ڷ���
	 * 		������
	 * 			byte
	 * 			short
	 * 			int
	 * 			long(���� �ڿ� L�ڰ� ������ long)
	 * 
	 * 	�Ǽ���
	 * 		float(10.5F >> �ڿ� F�� ������ float)
	 * 		double
	 * 	
	 * 	������
	 * 		char >> 'A' -0~65535=>������ ��� ǥ��(�����ڵ�)
	 * 
	 * 	����
	 * 		boolean : T / F =>���ǻ��==>������ ����� �޸� ũ�� ������ ���
	 * 
	 * 	����ó ������
	 *		1.���ϵ����� �����ϴ� �޸��� ��Ī : ����
	 *		  ���� : ���ϴ� ��(������ �ʿ�� ���氡��)
	 *		  ��� : ������ �ʴ� ��
	 *		=>���� ����
	 *			�޸� ũ�⼱�� ������ ���� = ��
	 *			int a=10;  >> ���� ���󿡼� ���� �̸��� ������ ����� �� ����.
	 *			{ int a=10;
	 *			  int a=20;  >>>error
	 *			}
	 *			�����Ŀ� ���߿� ���� �����ϴ� ���
	 *			int a;
	 *			a=10
	 *			or int a,b,c;
	 *			   int a=10 , b=20, c=30;
	 *
	 *		=>������ �����(�ĺ���)
	 *			1.���ĺ��̳� �ѱ۷� ����(�� ���ĺ��� ��ҹ��ڸ� ����)
	 *			2.���ڻ���� ����(�� �տ� ����� �� ����)
	 *			3.Ư�����ڸ� ����� �� �ִ�($,_ �ΰ����� ��밡��)
	 *			4.Ű���� ��� �ȵ�
	 *			5.���� ���̴� ���� ����(3~7��)
	 *
	 *			��ӵ� �κ�(�ڹٰ����ڿ�)
	 *			1.Ŭ�������� �빮��(ù��)==>Main
	 *			2.����, �޼ҵ�(ù��)>>�ҹ��� ==>a,b, kor ....
	 *			3.�ΰ��̻��� �ܾ�� �ι�° ������ �빮�� ==> MainClass, fileName ..
	 *				(��Ÿ���� ǥ��)
	 *			
	 *			byte<short(char)<int<long<float<double
	 *			==>�ڷ��� �۰� �����.
	 *				(int)10.5 =>(double=>int) >>������ ��ȯ
	 *			==>�ڷ��� ũ�� �����.
	 *				(double)10 => int => double
	 *
	 *			==>�ڵ��� ��ȯ(�������ø��� �����)
	 *			'A'+1
	 *			1. 'A' =65
	 *			2. 65+1 = 66
	 *
	 *			==>>int ���ϴ� ���� ����� int�� ��ȯ
	 *
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue=127;
		short shortValue=32767;
		int intValue=2140000000;
		long longValue=300000000000000L;
		float floatValue=10.5F;
		double doubleValue=10.5;
		char charValue='ȫ';
		boolean booleanValue=true;
		System.out.println("byteValue="+byteValue);
		System.out.println("shortValue="+shortValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("charaVlue="+charValue);
		System.out.println("booleanValue="+booleanValue);
		
	}

}

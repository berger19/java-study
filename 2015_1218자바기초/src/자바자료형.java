/*
 * 	�ڷ��� : �޸� ũ�� ==>������ ����ø��� �޸� ũ�⸦ ����
 * 	(1byte, 2byte, 4byte, 8byte)
 * 
 * 	1)��������
 * 		byte(1byte-8bit) = -128~127���� ����
 * 		short(2byte-16bit)= -32768~32767
 * 		int(4byte-32bit)  = -21��4õ ~ 21��4õ(default)-�ַ� ����(�ӵ�����)
 * 		long(8byte-64bit) = ....���̻�
 * 	2)�Ǽ�����
 * 		float(4byte)  10.5F =>�Ҽ��� 6�ڸ�
 * 		double(8byte) 10.5(default)-�Ҽ��� 15�ڸ�����
 * 	3)��������(2byte) => '-' ���� ����(���� ���� ���� '0' / 0~65535)
 * 		�̱۹���Ʈ(1byte) : ASC
 * 		��Ƽ����Ʈ(2byte) : Unicode - java�� ����ϴ� �ڵ�
 * 		   -char(��ɾ�)-
 * 	4)������
 * 		boolean => true/false
 * 	5)��������===>Ŭ����, �迭
 */
public class �ڹ��ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte a=127; - ��ɾ ���� ����Ʈ�� ����(����ǥ����)
		/*
		 * 	(int)(10.5+10.5)
		 *        =========
		 *           21
		 * 	(int)10.5+(int)10.5
		 *  ====       ==== 
		 *       10+10=20
		 */
		/*
		 * 	byte<shotr<int<long<float<double
		 * 		char
		 * 
		 * 		= ��ȯ(int �̸��� int�� ��ȯ)
		 * 		  up down
		 * 		  (char)65
		 * 		  (int)10.5
		 * 		  (double)10
		 * 
		 * 		10 + 10.5 ===> 20.5
		 *     ===
		 *     10.0���� ��ȯ
		 *      int  double    double
		 *      'A'+1==>66
		 *      ===
		 *      65�� ��ȯ
		 *      char + int = int
		 *      char + char =int
		 *      byte + byte =int
		 *      byte + short = int
		 */
		/*byte b1=100;
		byte b2=30;
		byte b3=(byte)(b1+b2);
		System.out.println(b3);*/
		/*
		 *   128  64  32  16  8  4  2  0
		 *    1    0   0   0  0  0  1  0
		 */
		/*byte b1=100;
		byte b2=30;
		int b3=b1+b2;
		System.out.println(b3);*/
	}

}

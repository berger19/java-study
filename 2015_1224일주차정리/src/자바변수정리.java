/*
 * 		******* ���α׷� : ����, ������, ���
 * 		���� : ������ ������ ��
 * 		= ����  ������ ����
 * 		= ������ ���� ����(�迭, Ŭ����)
 * 
 * 		1.���� ����
 * 			��������(�ڷ���)   ������=��
 *         ==========
 *         ���� : byte(1), int(4), long(8)
 *         �Ǽ� : float(4), double(8)
 *         ���� : char(2)
 *         �� : boolean(1)
 *         
 *         ���� ����� ���
 *         = ���ĺ�, �ѱ۷� ����
 *         = ���� ����� ����(�Ǿտ� ��� �ȵ�)
 *         = Ư������ ��밡��($ _)
 *         = Ű���� ��� �ȵ�
 *         
 *       2. �������� ũ��
 *       	 byte < char < int < long < double
 *       
 *       3. ����ȯ
 *       	 int a=300;
 *          int b=300;
 *          byte c=(byte)(a+b) ==> 88 ���(���������� ��ȯ���� ������ ���� 128(8��Ʈ) ���Ĵ� ©��)
 *          
 *          
 *         
 *         
 */
public class �ڹٺ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=300;
		int b=300;
		byte c=(byte)(a+b);
		System.out.println("c="+c); //2���� ��ȯ �� 8��Ʈ������ ©���
		
		int d=a+b;
		System.out.println("d="+d);
	}

}

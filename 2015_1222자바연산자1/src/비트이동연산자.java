/*
 * ���α׷� ���� ���
 * 	1.���������� =>����
 * 	2.������ ����ó�� =>������
 * 	3.ó���� ��� ��� => System.out.println()
 * 		=>System.out.println() : new Line
 * 			System.out.println("abc");
 * 			System.out.println("def");
 * 			abc
 * 			def
 * 
 * 		  System.out.print() :
 * 			System.out.print("abc");
 * 			System.out.print("def");
 * 			abcdef
 * 
 * 		  System.out.printf() : ������ ������ �ִ� ���
 * 			System.out.printf("%d%d%d",10,20,30);
 * 			102030
 * 			System.out.printf("%5d%5d%5d",10,20,30);
 * 			10   20   30 :���ڸ� �����Ͽ� 5ĭ�� ������ ����
 * 			%5d / %-5d (�տ��� ���� / �ڿ��� ����)
 * ������
 * 
 * 	SUN(1.7) ===> Oracle(1.8�� ������ ����=> pointer:���ٽ�,����ȥ)
 * 						   c + ���̾�
 * 
 * 	��Ʈ�̵� ������ (<<�����̵� , >>�������̵�)
 *		10<<2  ==>  ���������� ��ȯ�Ŀ� �ڿ� 0�� 2�� �ٿ���
 *			   ==> 1010(�� : 101000:40)
 *		X<<Y   ==> X*2^Y
 *
 *		10>>2
 *			   ==>10(10)X == 0010:2�� ��
 *		X>>Y   ==>X/2^Y
 *
 */
public class ��Ʈ�̵������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.printf("%5d%5d", 10, 20);
		System.out.printf("%-5d%-5d", 10, 20);*/
		int a=10;
		int b=2;
		int c=a<<b;
		int d=a>>b;
		System.out.println(Integer.toBinaryString(a));
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
	}

}

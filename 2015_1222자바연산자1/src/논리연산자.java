/*
 * 	�������� ==>�����(true/false) =>boolean
 *  ����&&����
 * 	=====================================
 *             &&             ||
 *  =====================================
 *   t   t      t             t
 *  =====================================
 *   t   f      f             t
 *  =====================================
 *   f   t      f             t
 *  =====================================
 *   f   f      f             f
 *   
 *   ����ȭ ���� ó��
 *   &&�� �տ� �ִ� ������ F �̸� �ڿ� �ִ� ������ ó�� ���� ����
 *   ||�� �տ� �ִ� ������ T �̸� �ڿ� �ִ� ������ ó�� ���� ����
 *   
 * 
 * 
 */
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result=(a<b && ++b==a);
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int c=10;
		int d=9;
		boolean result1=(c<d || ++d==c);
		System.out.println("result1=" + result1);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
				
	}

}

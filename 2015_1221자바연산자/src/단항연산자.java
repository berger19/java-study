
public class ���׿����� {
/*
 *=>���׿�����
 * 	++,-- ����������
 * 		++,--
 * 		a++(��ġ������ : �ٸ� �����Ŀ� ����), ++a(��ġ������ : ������ �ٸ����� ����)
 * 		int a=10
 * 		int b=a++ =>a=11 / b=10
 * 
 * 		int b=++a
 * 	! ����������
 * (type)����ȯ ������
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=--a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c=10;
		int d=++c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int e=10;
		int f=e++;
		System.out.println("e="+e);
		System.out.println("f="+f);
		
		int g=10;
		int h=g--;
		System.out.println("g="+g);
		System.out.println("h="+h);
		
	}

}

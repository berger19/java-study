
/*
 * ���迬���� => ������(true/false) boolean
 * == ����
 * != �����ʴ�
 * < �۴�
 * > ũ��
 * <= �۰ų� ����
 * >= ũ�ų� ����
 * 
 * 
 */
public class ���迬���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=9;
		boolean result= (a == ++b); //b=10
		System.out.println("b="+b);
		System.out.println("result="+result);
		
		result= (a == b++); //b=10
		System.out.println("b="+b);//11
		System.out.println("result="+result);
		
		result= (a == b); // b=11
		System.out.println("b="+b);
		System.out.println("result="+result);*/
		
		int a=10;
		int b=9;
		boolean result=(a!=b);//true b:9
		System.out.println("result="+result);
		int c=++b;
		result=(a!=c);//b=10
		System.out.println("result="+result);
		int d=c++;//c=10
		result=(a!=d);
		System.out.println("result="+result);
		int e=--d;//d=9
		result=(a!=e);
		System.out.println("result="+result);
		
				
	}

}

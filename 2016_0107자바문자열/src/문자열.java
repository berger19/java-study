/*
 * 		��������(string Ŭ����)
 * 		1. ���ڿ� ���尡��
 * 		2. ��ɼ���(�޼ҵ�)
 * 			- equals(�ּҰ� �ٸ��� ����� ���� ������ ���ϴ� ��ɹ�)
 * 			- �¿� ���� ����(trim)
 * 			- �ٸ�����(replace)
 * 			- ���ںи�(substring - ���� ���ϴ� ��ŭ�� ������ �������� �߶󳻴� ���)
 * 			- ���ڿ� ����(length)
 * 			- index of(
 * 			-last index of(�ڿ������� ��)
 * 			-value of(�����쳪 ���� ������ ���ڷ� �Ѿ���� ������ ���ڷ� �ٲ��ִ� ���)
 * 			-startsWith, endsWith(�տ� ������ ������ �ڿ������� ������ �����ϴ� ��ɾ�- ���̹��� ������ �˻��Ҷ� ���� ��ɾ�)
 * 			-split(���� ���ϴ� ���·� ��� �����ϴ� ���)
 * 	
 * 			1.��� ����
 * 				String ������="��";
 * 				(�ּҰ��� ����)
 * 				====  ====
 * 				Ŭ����     ��ü   => ��ü : ����� ���� ���������� ���� ������
 * 
 *				String ������=new String("��");
 *								====
 *								���ο� �޸� ������ �ǹ�=>��Ⱚ�� �����϶�� ����� 
 *								malloc()=>free()
 *								new => System.gc()
 *				String str=new String("java")
 *				�ڹ� �޸�
 *				==========================
 *				method����
 *				==========================
 *				stack => �޸𸮿� ���� ����(��������, �Ű�����)
 *				==========================
 * 				head => �����ڰ� ����(new�� �̿��ؼ� Ȱ��)
 * 				==========================
 * 
 * 				String str=new String("java"); // ���� �ȿ����� ����
 * 				
 * 				�������� : �迭, String
 *				String : ���������̸鼭 ��ü ����� ������ �ִ�.
 *				1) equals : ���ڿ� ��
 *				2) length : ������ ����
 *				3)	substring : ������ ����***
 *				4)	split : ������ ����
 *				5)	startsWith, endsWith : �ڵ��ϼ���(�� �Ǵ� �� ���ڿ� ������ ����)
 *				6) trim : �˿� ��������
 *				7) indexOf, lastIndexOf : ���ϴ� ��ġ�� ���� ��ġ��
 *				8) replace, replaceAll : �ٸ� ������ ����
 *				9) valueOf : ��� ���������� ���ڿ��� ����
 *				10) charAt 	: �ش� ���ڿ����� ���ϴ� ���� �Ѱ��� ������ �ö�
 *
 *				�����ε�(Overloading) : ���� �̸��� �޼ҵ带 ���� �� �����鼭 �Ű������� ������ ������ �ٸ����� �ϴ� ���
 *�������̵�(Overriding) : ���� Ŭ������ ������ �ִ� �޼ҵ带 ���� Ŭ������ ������ �ؼ� ����Ѵ�.
 * 
 */			
		 
public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello");
		if(str==str1){
			System.out.println("str�� str1�� ����(�ּ�)");
		}
		if(str==str2){
			System.out.println("str�� str2�� ����(�ּ�)");
		}else{
			System.out.println("str�� str2�� �ٸ���(�ּ�)");
		}
		if(str.equals(str2)){//��ҹ��� ����
			System.out.println("str==str2");
		}else{
			System.out.println("str!=str2");
		}
		if(str.equalsIgnoreCase(str2)){//��ҹ��� ���о���
			System.out.println("str==str2");
		}
	}

}

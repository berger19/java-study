/*
 * 	�ּ�ǥ��
 * 		1) �ڹٽ���
 * 			A.java =============> A.class ===========> ����
 * 				   javac(���ȯ)          java(����������)
 *                                       ============
 *                                            JVM
 *		2) �ڹٿ��� ����ϴ� ������ ǥ����
 *			1. ����
 *				=10���� : 100, 200 ....
 *				=8���� : 0(����)
 *				=16���� : 0x(����)
 *				100(4byte), 100L(8byte)
 *			2.����
 *				= 'A' , 'ȫ' , '0' => ������ȣ(ASC)
 *					'A'=65  ex) 'A'+1=66
 *					'a'=97
 *					'0'=48
 *			3. ���ڿ�
 *				= "ȫ�浿"
 *			4.�Ǽ�
 *				=10.5(8byte)>>������ D�� �ڿ� ������ ������ , 10.5F(4byte)
 *			5.��
 *				=true, false
 */
public class �ڹٱ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);//����ǥ��
		System.out.println(011);//8����
		System.out.println(0x55);//16����
		System.out.println('A');//����ǥ��
		System.out.println('ȫ');//����ǥ��
		System.out.println("ȫ�浿");//���ڿ�ǥ��
		System.out.println(10.5);//8byte�Ǽ�ǥ��
		System.out.println(10.5F);//4byte
		System.out.println(true);//��ǥ��
		System.out.println(false);//��ǥ��
		System.out.println("7"+7+"7"+7+7);//==>>77777(���ʺ��Ͱ��)
		System.out.println(7+7+7+7+"7");//==>>287(28+"7"=287)
	}

}

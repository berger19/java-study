//substring = > ���ڸ� �и��� �� ���� ��ɾ�
/*
 * 		substring(int startsIndex)
 * 		substring(3) => 3��° ������ ���� ����������
 * 		substring(int startsIndex,endsIndex)
 */
import java.io.*;
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="0123456789";
		String res1=str.substring(3);//0���� �����ϹǷ� 4��° ��
		System.out.println(res1);
		String res2=str.substring(3, 7);//������ ���� ���� n-1�� �����
		System.out.println(res2);*/
		File dir=new File("C:\\javaDev\\javastudy\\2016_0106�޼ҵ�\\src");
		File[] files=dir.listFiles();
		for(int i=0; i<files.length; i++){
			/*System.out.println(files[i].getName());*/
			//Ȯ���� �ܾ� ������
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.')+1);
			System.out.println(ext);
			if(ext.equals("java")){
				System.out.println(name);
			}
		}
		
	}

}

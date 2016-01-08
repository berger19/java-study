//substring = > 문자를 분리할 때 쓰는 명령어
/*
 * 		substring(int startsIndex)
 * 		substring(3) => 3번째 값이후 전부 가져오른것
 * 		substring(int startsIndex,endsIndex)
 */
import java.io.*;
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="0123456789";
		String res1=str.substring(3);//0부터 시작하므로 4번째 값
		System.out.println(res1);
		String res2=str.substring(3, 7);//끝나는 지점 값에 n-1로 적용됨
		System.out.println(res2);*/
		File dir=new File("C:\\javaDev\\javastudy\\2016_0106메소드\\src");
		File[] files=dir.listFiles();
		for(int i=0; i<files.length; i++){
			/*System.out.println(files[i].getName());*/
			//확장자 긁어 모으기
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.')+1);
			System.out.println(ext);
			if(ext.equals("java")){
				System.out.println(name);
			}
		}
		
	}

}

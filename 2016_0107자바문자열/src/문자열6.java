// trim() : 좌우의 공백을 제거할때 사용됨/문자 사이간 공백은 제거안됨
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="  admin  ";
		System.out.println("문자 길이 : "+id.length());
		String res=id.trim();
		System.out.println("문자길이 : "+res.length());
		System.out.println(id);//id변수는 훼손되지 않는다. 단지 id변수를 받아서 변경함
	}

}

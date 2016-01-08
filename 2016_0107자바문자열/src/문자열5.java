// indexOf :앞에서 해당 문자를 찾음 그리고 상기문은 int로 받았으므로 몇번째인지 표현해줌
// lastIndexOf :뒤에서부터 해당문자 찾음
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello java";
		int i=str.indexOf('a');//앞에서 해당 문자를 찾음 그리고 상기문은 int로 받았으므로 몇번째인지 표현해줌
		int I=str.lastIndexOf('a');//뒤에서부터 해당문자 찾음
		System.out.println("indexOf : "+i);
		System.out.println("lastIndexOf : " + I);
	}

}

/*
 * 		데이터형(string 클래스)
 * 		1. 문자열 저장가능
 * 		2. 기능수행(메소드)
 * 			- equals(주소가 다르게 저장된 값을 같은지 비교하는 명령문)
 * 			- 좌우 공백 제거(trim)
 * 			- 다른문자(replace)
 * 			- 문자분리(substring - 내가 원하는 만큼만 지시한 변수에서 잘라내는 명령)
 * 			- 문자열 길이(length)
 * 			- index of(
 * 			-last index of(뒤에서부터 비교)
 * 			-value of(윈도우나 웹은 무조건 문자로 넘어오기 때문에 문자로 바꿔주는 명령)
 * 			-startsWith, endsWith(앞에 문장이 같은지 뒤에문장이 같은지 구분하는 명령어- 네이버나 다음에 검색할때 쓰는 명령어)
 * 			-split(내가 원하는 상태로 끈어서 저장하는 방법)
 * 	
 * 			1.사용 형식
 * 				String 변수명="값";
 * 				(주소값을 가짐)
 * 				====  ====
 * 				클래스     객체   => 객체 : 사용자 정의 데이테형에 대한 변수명
 * 
 *				String 변수명=new String("값");
 *								====
 *								새로운 메모리 생성의 의미=>상기값을 저장하라는 명령임 
 *								malloc()=>free()
 *								new => System.gc()
 *				String str=new String("java")
 *				자바 메모리
 *				==========================
 *				method영역
 *				==========================
 *				stack => 메모리에 의해 저장(지역변수, 매개변수)
 *				==========================
 * 				head => 개발자가 저장(new를 이용해서 활당)
 * 				==========================
 * 
 * 				String str=new String("java"); // 가로 안에서만 사용됨
 * 				
 * 				참조변수 : 배열, String
 *				String : 데이터형이면서 자체 기능을 가지고 있다.
 *				1) equals : 문자열 비교
 *				2) length : 문자의 갯수
 *				3)	substring : 문자의 분해***
 *				4)	split : 문자의 분해
 *				5)	startsWith, endsWith : 자동완성기(앞 또는 뒤 문자열 같은지 구분)
 *				6) trim : 죄우 공백제거
 *				7) indexOf, lastIndexOf : 원하는 위치의 문자 위치로
 *				8) replace, replaceAll : 다른 값으로 변경
 *				9) valueOf : 모든 데이터형을 문자열로 변경
 *				10) charAt 	: 해당 문자열에서 원하는 문자 한개만 가지고 올때
 *
 *				오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
 *오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 상요한다.
 * 
 */			
		 
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello");
		if(str==str1){
			System.out.println("str과 str1은 같다(주소)");
		}
		if(str==str2){
			System.out.println("str과 str2은 같다(주소)");
		}else{
			System.out.println("str과 str2는 다르다(주소)");
		}
		if(str.equals(str2)){//대소문자 구분
			System.out.println("str==str2");
		}else{
			System.out.println("str!=str2");
		}
		if(str.equalsIgnoreCase(str2)){//대소문자 구분안함
			System.out.println("str==str2");
		}
	}

}

//		replace : 필요없는 단어를 제외 하고 문자만 필터링해서 가져오는 명령어
/*
 * 		replace => 
 * 		replaceAll
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="&lt;html&gt;";
		data=data.replaceAll("&lt;", "<");
		data=data.replaceAll("&gt;", ">");
		System.out.println(data);
		data="Hello\tHello\tHello\t";
		System.out.println(data.replace('\t', '\n'));
		
	}

}

import java.util.Scanner;


public class 연습{

    public static void main(String[] args) {
        
        String message;
        Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
        
        System.out.println("메시지를 입력하세요:");
        
        message = scan.nextLine();            // 키보드 문자 입력
        
        System.out.println("입력 메시지: \""+ message + "\"");
    }
}
import java.util.Scanner;


public class ����{

    public static void main(String[] args) {
        
        String message;
        Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
        
        System.out.println("�޽����� �Է��ϼ���:");
        
        message = scan.nextLine();            // Ű���� ���� �Է�
        
        System.out.println("�Է� �޽���: \""+ message + "\"");
    }
}
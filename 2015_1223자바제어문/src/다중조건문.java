/*
 * 다중조건문
 * 
 */

public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ju=85;
		char ha='A';
		if(ju>=90)
			ha='A';
		else if(ju>=80)
			ha='B';
		else if(ju>=70)
			ha='C';
		else if(ju>=60)
			ha='D';
		else
			ha='F';
		System.out.println("학점="+ha);
		
		
	}

}

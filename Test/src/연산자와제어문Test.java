
public class 연산자와제어문Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mon=278970;
				int num1=mon/10000;
				System.out.println("만원권="+num1+"장");
				int num2=(mon%10000)/5000;
				System.out.println("오천원권="+num2+"장");
				int num3=(mon%5000)/1000;
				System.out.println("천원권="+num3+"장");
				int num4=(mon%1000)/500;
				System.out.println("오백원권="+num4+"개");
				int num5=(mon%500)/100;
				System.out.println("백원권="+num5+"개");
				int num6=(mon%100)/50;
				System.out.println("오십권="+num6+"개");
				int num7=(mon%50)/10;
				System.out.println("십원권="+num7+"개");

	}

}

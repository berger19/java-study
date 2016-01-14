/*
 * 	자료형 : 메모리 크기 ==>데이터 저장시마다 메모리 크기를 결정
 * 	(1byte, 2byte, 4byte, 8byte)
 * 
 * 	1)정수저장
 * 		byte(1byte-8bit) = -128~127까지 저장
 * 		short(2byte-16bit)= -32768~32767
 * 		int(4byte-32bit)  = -21억4천 ~ 21억4천(default)-주로 사용됨(속도측면)
 * 		long(8byte-64bit) = ....그이상
 * 	2)실수저장
 * 		float(4byte)  10.5F =>소수점 6자리
 * 		double(8byte) 10.5(default)-소수점 15자리까지
 * 	3)문자저장(2byte) => '-' 값이 없음(가장 작은 값이 '0' / 0~65535)
 * 		싱글바이트(1byte) : ASC
 * 		멀티바이트(2byte) : Unicode - java가 사용하는 코드
 * 		   -char(명령어)-
 * 	4)논리저장
 * 		boolean => true/false
 * 	5)참조연산===>클래스, 배열
 */
public class 자바자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte a=127; - 명령어를 통해 바이트수 변경(정수표현시)
		/*
		 * 	(int)(10.5+10.5)
		 *        =========
		 *           21
		 * 	(int)10.5+(int)10.5
		 *  ====       ==== 
		 *       10+10=20
		 */
		/*
		 * 	byte<shotr<int<long<float<double
		 * 		char
		 * 
		 * 		= 변환(int 미만은 int로 변환)
		 * 		  up down
		 * 		  (char)65
		 * 		  (int)10.5
		 * 		  (double)10
		 * 
		 * 		10 + 10.5 ===> 20.5
		 *     ===
		 *     10.0으로 변환
		 *      int  double    double
		 *      'A'+1==>66
		 *      ===
		 *      65로 변환
		 *      char + int = int
		 *      char + char =int
		 *      byte + byte =int
		 *      byte + short = int
		 */
		/*byte b1=100;
		byte b2=30;
		byte b3=(byte)(b1+b2);
		System.out.println(b3);*/
		/*
		 *   128  64  32  16  8  4  2  0
		 *    1    0   0   0  0  0  1  0
		 */
		/*byte b1=100;
		byte b2=30;
		int b3=b1+b2;
		System.out.println(b3);*/
	}

}

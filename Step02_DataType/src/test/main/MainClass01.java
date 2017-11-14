package test.main;
/*
 *	[ Java 데이터 type ]
 *
 *	1. 숫자형
 *	(세부적으로 나눈 이유 : 메모리를 효율적으로 사용하려고(/뒤로 갈 수록 메모리 큼)
 *	정수형 : byte, short, int, long 
 *  	- byte 변수명;  // -128 ~ 127
 *  	- short 변수명;  // -32768 ~ 32767
 *  	- int  변수명; // -2147483648 ~ 2147483647
 *  	- long 변수명; // -9223372036854775808 ~ 92233720368547758	
 *
 *	실수형 : float, double
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	// 실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		// 정수형 변수 종류 별로 선언하고 값 대입하기
		byte iByte= 10;
		short iShort= 10;
		int iInt= 10;
		long iLong= 10; // d 생략하면 double type 이다.
			
			// byte(작은 것)를 int(큰 것)에 담으면 문법 오류 안 생겨 (가능)
			int tmp= iByte;
			// int(큰 것)을 byte(작은 것)에 담으면 문법 오류 생겨 (불가)
			//byte tmp2= iInt;
			
			// 근데 int(큰 사이즈)로 정의 했지만 실제 담긴 애는 작을 경우, byte(작은 것)에 다시 강제로 담을 수 있어
			// => casting(형변환) 연산자
			// (byte) 얘는 비록 int 타입 일지라도, 이 자리에 있는 애는 byte 타입으로 강제로 casting 해주는 것
			// iInt => int type  /  (byte)iInt => byte type
			byte tmp2= (byte)iInt;
		
		// 실수형 변수 종류 별로 선언하고 값 대입하기
		float num1= 10.1f;
		double num2= 10.1d;
		double num3= 10.1; // d 생략하면 double type 이다.
		
		//float type 을 double type 으로 담기 (가능)
		double tmp3= num1;
		
		// casting 연산자를 사용해야 담을 수 있다.
		// num2 => double type  /  (float)num2 => float type
		float tmp4= (float)num2;
	}
}

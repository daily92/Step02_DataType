package test.main;
/*
 *  [ Java 기본 데이터 type ]
 * 
 * 	3. 문자형 (char)
 * 
 * - 65536 가지의 코드값을 가질 수 있어서 전세계에서 사용하는 문자
 * - 한글자를 표현할 수 있다.
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		// char 형 변수 선언와 동시에 값 대입하기
		// 문자 한 글자를 표현할 때는 '' (single 따옴표)
		char ch1= 'a';
		char ch2= '1';
		char ch3= '@';
		char ch4= '가';
		char ch5= '쀍';
		
		// 내부적으로는 정수 code 값으로 처리한다.
		int code1= ch1;		// 기본적으로 short type
		int code2= ch2;		//short type < int type 이므로
		int code3= ch3;		//자동 casting 되어서 담긴다.
		int code4= ch4;
	}
}

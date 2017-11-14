package test.main;
/*
 * 	[ Java 기본 데이터 type ]
 * 
 * 	2. 논리형 (boolean)
 * 	
 * 	- 가질 수 있는 값의 범위 : true, false 두 가지 값을 가질 수 있다.
 * 	- 만드는 방법 : true, false 를 직접 써 주거나, 
 * 	   비교연산 혹은 논리연산의 결과로 얻어낼 수 있다.
 */

public class MainClass03 {
	public static void main(String[] args) {
		// 논리형 변수 선언와 동시에 값 대입하기
		boolean isRun= true;
		
		if(isRun) {
			System.out.println("달려요~~!");
		}
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}

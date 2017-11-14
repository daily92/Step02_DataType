package test.main;
/*
 * 	[ Java 참조 데이터 type ]
 * 
 * 	String
 * 
 * 	- 문자열을 다룰 때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
			//기본 datatype 의 int
		int num= 1;
		
		// String type 데이터를 만들어서 변수에 대입
			//참조 datatype 의 string
			//참조 data type 은 대문자로 시작!
		String name= "김구라";
		
		// 변수를 선언만 하면 만들어지지 않는다. (만들 준비만 하는 것)
			//실제 만들어지는지 아닌지는 debugging 부터 돌려보면 되죠.
		String str;
		
		// 값을 대입해야 만들어진다.
		str= "문자열";
		
		System.out.println("메인 메소드가 종료 됩니다.");
		
		//참조값에 . 을 찍으면 기능을 사용할 수 있어 (기본값에는 X)
		//name. 의 경우 string type 의 기능 뜸!
		
	}
}

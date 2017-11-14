package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 국어 점수
		int kor= 95;
		// 영어 점수
		int eng= 100;
		// 국어, 영어 점수의 평균을 구해서 출력하고 싶다면?
		
		// 두 점수의 합
		int sum= kor+eng;
		/*
		 *	정수 끼리 연산하면 결과는 정수
		 *	정수와 실수를 연산하면 결과는 실수
		 */
		// 평균
		// sum => 정수, 2 => 정수 ==> 정수와 정수를 연산하면 정수 밖에 안 나와(소수점 버려짐)
		// => 연산에 참여하는 숫자 중에 하나는 실수로 바꾸어 줘야 해
		// double ave= sum/2d;  또는 double ave= sum/2.0;  또는 double ave= sum/2.0d;
		double ave= sum/2.0;
		
		System.out.println("평균:" + ave);
	}
		
}

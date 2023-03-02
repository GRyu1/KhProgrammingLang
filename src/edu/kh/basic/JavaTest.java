package edu.kh.basic;

// (한줄) 주석 컴파일러가 해석하지 않는 부분, 주로 코드 설명 시 사용.
// 컴파일러(Compiler) : 코드를 2진수(0or1)로 변환하는 번역기.
// Java 코드 실행 순서 : 
// 코드를 작성한다.-> ctrl + F11 실행-> 컴파일러가 2진수로 번역 -> JVM실행

/*범위 주석*/

public class JavaTest {
	//class : 자바 코드가 작성되는 영역.
	public static void main(String[] args) {
		//main method : 자바APP(프로그램)을 실행하기 위해 반드시 필요한 메소드(기능).
		System.out.println("Hello Wold!!");
		System.out.println("점심은 뭐 드셨나요??");
		System.out.println("1234");
		
		System.out.println("-----------------");
		// 숫자 연산.
		System.out.println("1+2");
		System.out.println(1+2);
		
		//" "안에 작성된 코드는 단순 문자열로 인식한다.
		//" "안에 작성되지 않은 코드는 숫자나 변수로 인식을한다.
		
		System.out.println(50-23);
		System.out.println(12*13);
		System.out.println(327/3);
		
		//""(문자열)+숫자 함께 작성ㄱ
		System.out.println("14*19 = "+266);
		System.out.println("14*19 = "+14*19);
		
		// '+' 기호의 역활
		// -> 숫자+숫자 = 덧셈의 연산
		// -> 문자열+숫자 || 문자열+문자열 == 이어쓰기효과
		
		System.out.println("90+70+65 = "+(90+70+65));
		
		//자바는 사칙연산의 우선순위를 따른다.
		// ->우선계산을 원할 시 괄호를 사용한다.
		
		
	}
}
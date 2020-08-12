package com.javaec.basic;
//자바의 기본 자료형 연습
public class TypeEx {

	public static void main(String[] args) {
		//intLongTest();
		//floatDoubleTest();
		//booleanEx();
		//charEx();
		constantEx();
	}
	//상수 연습(Constant)
	public static void constantEx() {
		// 변하지 않는 데이터
		//final 을 선언부 앞에 붙이면 된다.
		//상수 식별자는 모두 대문자, 여러 단어 결합시
		//단어 사이에 _를 추가해준다.
		//장점
		//1.코드의 가독성
		//2.코드유지보수의 장점
		final double PI = 3.14159;
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI = "+ PI);
		System.out.println("제한속도 = "+SPEED_LIMIT);
		
		//SPEED_LIMIT = 50; 실행자체가 되지않음. 상수이므로 변경이 불가하다.
		System.out.println("제한 속도 = "+SPEED_LIMIT);
	}
	
	//char 형 연습
	public static void charEx() {
		//2바이트 (부호없음) 
		//유티코드 한 글자의 수치화된 코드
		// ' ' <-char
		// " "<-String
		char ch1 = 'A';
		char ch2 = '한';
		System.out.println("A-> "+ch1);
		System.out.println("한-> "+ch2);
		
		System.out.println(ch1+ch2);// 내부적으로는 수치화된 데이터라는걸 알 수 있다. 
	}
	
	//boolean 연습
	public static void booleanEx() {
		// 논리값 true or false 반환
		// 주로 비교연산 논리연산의 결과로 반환.
		// 흐름 제어, 반복에서 흐름을 제어할 때 이 값을 사용한다. (중요)
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 =3;
		int v2 =5;
		
		boolean result = v1 < v2; //true 아니면 false만 담김. 같다가 아닌 (결과값)대입임.
		//비교연산, 논리연산의 결과로 반환된다. 
		System.out.println("v1 < v2 ? "+ result);
	}
	
	//실수형 연습
	//float ( 4) < double (8)
	public static void floatDoubleTest() {
		//정밀도 포기, 표현 범위를 넓힌 자료형. 
		float fVar = 3.14159F;//float표현은 끝에다가 F를 붙여줘야한다. 
		double dVar = 3.14159;
		
		//정밀도 파악
		fVar = 0.1234567890123456789F;//짤려서 나온다.
		dVar = 0.1234567890123456789;
		
		System.out.println("float:"+fVar);
		System.out.println("double:"+dVar);
		
		//지수표기범
		fVar = 1234567890E-10F; //1234567890*10^이란 뜻. 
		System.out.println(fVar);
		
		//실수 자료형의 처리는 정밀도가 떨어진다. (표현범위를 넓힘)
		System.out.println(0.1*3);
		//금융권 같은 정밀도를 요구하는 응용프로그램개발에는 기본적인 float,double의 사용은 유의.
	}
	//정수형 연습
	//byte < short < int < long
	public static void intLongTest() {
		//변수 선언
		//int -> 자바가 다루는 정수형의 가장 기본적인 형태
		int intVar1;
		intVar1=2020; //초기화 작업(초기화는 항상 해줘야한다)
		int intVar2=2020;//선언 + 초기화 동시에.
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		//long:8byte
		long longVar1;
		longVar1=2020;
		long longVar2=1234556789012345678L;//int범위 초과하면 맨 뒤에 L을 붙여주자 
		
		System.out.println(longVar1);
		
		//2진수, 8진수, 16진수
		int bin = 0b1100; //10진수: 12. 2진수는 0b로 시작.
		int oct = 010; //10진수:8   8진수는 0로 시작. 
		int hex = 0xFF; //  16진수는 0x로 시작
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		//
		
	}

}

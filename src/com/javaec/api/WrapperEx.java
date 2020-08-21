package com.javaec.api;

public class WrapperEx {

	public static void main(String[] args) {
		//Wrapper 클래스 생성
		Integer i = new Integer(2020);  //기본타입이 넘어가서 포장됨. (객체화)
		Character c = new Character('c');
		//위 방식은 jdk9에서 depre
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		//기본 타입은 비어있을 수 없고 (null허용 안함)
		//Wrapper 타입은 비어있을 수 있다. (null허용)
//		b2=null; 허용 X
		b=null;
		
		//활용
		//문자열로 된 데이터를 변환할 때 활용
		Integer i2= Integer.valueOf("2020");
		//주의: valueOf 내부의 문자열 인자의 형태가 해당 데이터 타입으로
		//				변환할 수 있는 형태여야한다. 
		
		//내부 포장된 값의 비교
		System.out.println("i의 값:"+i.intValue());
		System.out.println("i와 i2의 값이 같은가?" + 
				(i.intValue() == i2.intValue()));
		//JDK 5이후에는 자동박싱 자동 언방식이 자원된다. 
		Float f2 = 3.14159f; //자동 박싱-> 객체화되어서 f2에 들어간다.
		
		//parse 계열 메서드: 주로 변환 작업에 활용
		System.out.println("문자열 -> 정수형 변환 " + Integer.parseInt("-12234"));
		
		//진법 변환
		System.out.println("16진수 FF -> 10진수: " + 
			Integer.parseInt("FF", 16));
		
		//형변환
		System.out.println("f2 -> int : " + f2.intValue());
		
		//언박싱 비교 2번째  -> 자동 언박싱 되지않음. 
		//다른 메모리를 차지
		System.out.println("i와 i2가 같은가? "+ (i == i2)); //어쨋든 객체니 값의비교 유의.
		System.out.println("i와 i2의 값이 같은가?"+ (i.intValue() == i2.intValue()));
		//어째ㅅ든 객체라서 자동 언박스 왜저런걸까
		//equls 이용한
		System.out.println("i와 i2의 값이 같은가?"+ (i.equals(i2) ));

		

	}

}

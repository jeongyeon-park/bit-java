package com.javaec.basic.reftytypes;

public class StringEx {
	
	public static void main(String[] args) {
//		stringBasic();
		stringFormat();
	}
	
	public static void stringFormat() {
		// 포맷문자
		//%d (십진), %s(문자열), %f(실수)
		//%n(개행), %%(%)
		//O개의 O중에서 O개를 먹었다. 
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n"; //미리 포맷팅 만들어두는게 편함.
		System.out.printf(fmt,total,fruit,eat);
		//포맷 문자열 문자지정에 유의.
		//printf에서만 사용하는건 아님.
		//새로운 문자열을 생성할 때 사용한다.
		String res = String.format("파이상수는 %f입니다.", Math.PI);
		System.out.println(res);
		//출력 포맷만 바꿔줄 수 있음. %f의 경우 -> 소수점 자리를 제한할 수 있음.
		res = String.format("파이상수는 %.3f입니다.", Math.PI);
		System.out.println(res);
	}
	public static void stringBasic() {
		//가장 기본적인 참조 자료형을 이해.
		 String str; //선언
		 str = "Java"; //할당
		 String str2 = "Java";
		 String str3 = new String("Java");  //new -> 새로운 객체 나옴. 
		 System.out.println(str);
		 // 리터럴일 경우 내용이 같으면 주소가 같다고 판단한다. 
		 //참조 타입의 경우
		 //==, !=은 주소의 비교다. (hashCode 비교)
		 System.out.println(str == str2);
		 System.out.println(str2 == str3);
		 
		 //값의 비교 . 동일 
		 //객체 내부에 equals라고 하는 메서드 이용
		 System.out.println(str.equals(str2));
		 System.out.println(str.equals(str3)); // 적는 순서는 상관 없음 
		 
	}

}

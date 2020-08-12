package com.javaex.basic;

public class VarEx {
	public static void main(String[] args) {
		int myAge;
		myAge = 29;
		int myAge2=29; //선언과 초기화를 동시에 할 수 있다. (추천)
		//변수의 경우 선언시 지정한 데이터 타입 이외의 데이터는 넣을 수 없다.
		System.out.println("myAge의 내용:"+myAge);
		myAge=myAge+1;
		System.out.println("변경된 myAge의 내용:"+myAge);
		
	}
}

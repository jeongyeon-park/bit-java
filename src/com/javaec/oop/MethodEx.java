package com.javaec.oop;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println("sum: "+sum(10,20));
		//static에서 메소드 호출하려면 그 메소드도 static이어야한다. 
		printMessage("java method 연습");
//		sum(10,20,30,40,50); //인수들이 배열형태로 변환되어 전달.
		System.out.println("가변인수 연습:"+sum(10,20,30,40,50));
		printSum("고정인수+가변인수연습 ", 10,20,30,40,50);
	}
	//고정인수(String message), 가변인수(갯수를 알 수 없는)를 함께 사용가능
	//순서는 반드시 고정인수 다음 가변인수가 오도록 해줘야함.
	private static void printSum(String message, double ...values) {
		double total = sum(values);
		System.out.println(message + ":" + total);
		
	}
	//가변인수
	private static double sum(double ...values) {
		//메소드 이름 같아도 된다. 같은 이름인데 매개변수의 타입 등이 다른 같은 기능을 하는 메소드 
		//Over loading . 매개변수 따라서 함수 정해지나봄?
		System.out.println("인수의 갯수: "+ values.length);
		double total=0;
		for (double val:values) {
			total+=val;
		}
		return total;
	}
	
	private static double sum(double a, double b) {
		return a+b; // 데이터는 double이어야 한다. 
	}
	
	private static void printMessage(String message) {
		//return 할 데이터가 없으면 void
		System.out.println(message);
	}
}

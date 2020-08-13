package com.javaec.oop.staticmembers;

//singleton Pattern
	//어떤 상황에서도 반드시 1개의 인스턴스를 유지해야되는 경우 
public class Singleton {
	//생성자
	private static Singleton instance = new Singleton();
	//클래스 영역은 단 한번 호출
	private Singleton() {
		//절대 주번 호출되면 안된다. 
	}
	
	//일종의 getter를 만들어서 우회 접근
	public static Singleton getInstance() {
		return instance;
	}
}

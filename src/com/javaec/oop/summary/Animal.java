package com.javaec.oop.summary;

//실체화 되지 않는 클래스
//추상클래스는 종적 확장
public abstract class Animal {
	//필드
	protected String name;
	protected int age;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//생성자2
	public Animal(String name, int age) {
		this(name);
		//추가 필드 초기화
		this.age = age;
	}
	
	//추상클래스 내에는 실체클래스, 추상클래스 모두 올 수 있다.
	//추상클래스는 자식 실체 클래스에서 반드시 오버라디으 해줘야한다.
	public abstract void say(); //반드시 오버라이드
	public void eat() {
		System.out.printf("%s is eating.. %n", name);
	}
	
}

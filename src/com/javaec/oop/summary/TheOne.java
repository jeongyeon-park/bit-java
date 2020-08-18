package com.javaec.oop.summary;

public class TheOne extends Human {
	implements Flyable, Kungfu {
	// 부모클래스는 1개여야하지만 인터페이스는 여러개 일 수 있다. 
		
		//생성자
		public TheOne(String name, int age) {
			super(name, age);
		}
		
		@Override
		public void Kungfu() {
			System.out.println(name + "쿵후");
		}
		
		@Override
		public void fly() {
			System.out.println(name + "날아!");
		}
	}
}

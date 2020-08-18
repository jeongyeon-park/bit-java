package com.javaec.oop.summary;

public class KungfuPanda extends Panda implements Kungfu{
	
	//생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	//인터페이스 내의 모든 메서드는 반드시 오버라이드.
	@Override
	public void kunghu() {
		System.out.printf("%s: ~~ %n", name);
		
	}
	
	//추상메서드는 반드시 override
	//say는 Animal의 추상메서드
	//이걸 상속받은 판다가 이미 override를 해서 여기서는 안해줘도 된다. ! 
	
}

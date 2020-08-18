package com.javaec.oop.summary;

public class SummaryApp {
	// 쿵후 도장
	static Kungfu[] dojang; // 인터페이스 참조타입의 배열 
	
	public static void main(String[] args) {
		Panda p1 = new Panda("핑", 30);
		p1.say();
		
		Human h1 = new Human("정연", 23);
		h1.say();
		
		Panda p2 = new KungfuPanda("포", 15);
		p2.say();
		
		Human h2 = new TheOne("네어", 50);
		h2.say();
		
		fight(p1);
		fight(p2);
		fight(h1);
		fight(h2);
		
		//각 객체를 도장에 등록
		dojang = new Kungfu[] {
				(Kungfu)h1,(Kungfu)h2,(Kungfu)p1,(Kungfu)p2};
		
		for(Kungfu actor:dojang) {
			actor.kungfu();
		}
	}
	
	private static void fight(Animal actor) {
		// actor가 Kungfu 인터페이스를 구현했으면 Kungfu 메서드를 쓸 수 있을거임
		if( actor instanceof Kungfu) {
			// 형변환 가능(다운캐스팅가능) 쿵푸 인터페이스를 구현한 클래스이다.
			((Kungfu)actor).kungfu();
		}else {
			//형변환이 불가
			System.out.println(actor.name + "쿵푸불가!");
		}
	}

}

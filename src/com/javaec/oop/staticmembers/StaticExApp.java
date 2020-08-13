package com.javaec.oop.staticmembers;

public class StaticExApp {
	public static void main(String[] args) {
		StaticEx s1=new StaticEx();
		//첫번째 로딩 : static 블록 수행 -> 생성자 
		//refCount는 static -> 인스턴스 생성없이 접근 가능
		System.out.println("RefCount:"+StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		//앞에서 static 초기화 완료: static 블록 수행 없이 -> 생성자
		System.out.println("RefCount:"+StaticEx.refCount);
		
		s1 = null; // 참조 해제
		System.out.println("s1해제");
		System.out.println("RefCount:"+StaticEx.refCount);
		
		//가비지 콜렉터 강제 수행
		//주의: 직접 가비지 콜렉터를 호출하지 마세요. 
		//작동원리 이해를 위한 코드이니 이 코드느 사용하지 않도록 하자. 
		System.gc();
		//잠시 대기. 바로 실행되지는 않음
		try {
			Thread.sleep(3000); // 잠시 중지시켜 1/1000초 -> 3000초 == 3초
			System.out.println("RefCount: "+StaticEx.refCount);
		}catch(Exception e) {
		}
	}
}

package com.javaec.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("vector: "+ v);

		System.out.printf("size:%d , capacity: %d %n", v.size(), v.capacity());
		
		// 1부터 10까지 값을 담아 봅니다.
		for(int i = 1 ; i<=10 ;i++) {
			v.addElement(i); //추가
			//v.addElement(Integer.valueOf(i)); Wrapp 다음에 들어가는// 
		}
		v.addElement(11); //허용량 초과 -> 버퍼 자동 증가 
		System.out.printf("size:%d , capacity: %d %n", v.size(), v.capacity());

		//객체의 삽입 insertElement 
		v.insertElementAt(5,7); // 5객체를 7번 인덱스에 추가 
		System.out.println("vector: "+ v);
		
		// 특정 인덱스에 있는 객체를 반환: elementAt
		int value = v.elementAt(5);
		System.out.printf("%d번 인덱스의 객체 %d%n",7,value);
		
		//객체 인덱스 검색 indexOf
		System.out.println("객체 7의 인덱스 ? "+v.indexOf(7));
		//없는 객체의 검색
		System.out.println("없는 객체의 인덱스 ?"+v.indexOf(0));
		//객체 삭제 remove()
		v.removeElement(10); // 객체 10을 삭제
		System.out.println("vector: "+v);
		
		//버퍼 비우기
		v.clear(); //내부 버퍼 비우기
		System.out.printf("size:%d , capacity: %d %n", v.size(), v.capacity());
		//늘어난 버퍼는 유지한다.
		
		//Generics의 활용. 만약 상속관계의 클래스가 있다면 특정 부모의 모든것을 내려받을 수 있는..
		//Number 클래스를 부모로 가진 모든 자식 클래스를 제네릭으로 제한.
		
		Vector<? super Number> v2 = new Vector<>();//super가 Number인 것 
		v2.addElement(Integer.valueOf(2020));
		v2.addElement(Float.valueOf(3.145678f));
//		v2.addElement(Boolean.valueOf(true)); Number의 자식이 아님
		
		//Enumeration을 ㅣㅇ용하여 항목을 차례대로 꺼낼 수 있따.
		Enumeration<? super Number> e = v2.elements();
		
		while(e.hasMoreElements()) {
			System.out.println("요소: "+ e.nextElement());
		}
		
	}

}

package com.javaec.oop.goods.v2;

//v2 
//접근 제한자의 이해
//getter와 setter.
public class Goods {
	//필드(속성) 
	//접근자 없으면 default
	//클래스 내부 or 동일 패키지 내에서 접근 가능
	/*
	String name;
	int price;
	*/
	
	//public > protected > default > private
	//인스턴스 변수들 인스턴스 변수로 지칭하고자 할 때는 this로 써주기.
	private String name;
	private int price;
	
	//Getter / Setter
	//은닉된 필드를 우회 접근하기 위한 메소드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//이름이 중복 될 경우
		//this :해당 인스턴스 자신을 가리키는 
		this.name=name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메서드
	public void showInfo() {
		//내부 필드의 정보를 출력
		System.out.printf("%s, 가격 %d원 %n",name,price);
	}	
}


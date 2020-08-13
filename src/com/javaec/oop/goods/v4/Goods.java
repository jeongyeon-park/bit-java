package com.javaec.oop.goods.v4;

//v4
//this
public class Goods {
	//필드(속성) 
	private String name;
	private int price;
	
	//생성자는 반드시 1개 이상 있어야한다.
	//코드상에 생성자 코드가 하나도 없으면
	//		기본 생성자를 강제로 추가한다.
	
	//생성자 오버로딩:생성자는 여러개 있을 수 있다. 
	//생성자 1
	public Goods(String name) {
		System.out.println("생성자1");
		this.name = name;
	}
	
	public Goods(String name, int price){
		//이미 일부의 정보를 초기화 하는 생성자가 있을 때
		//this()호출하고 나머지 정보를 초기화 할 수 있다(많이 쓰는 방법)
		//설정 정보가 많아 복잡할 경우 코드의 중복을 줄일 수 있다.
//		this.name = name;
		this(name);// 생성이 되어야 인스턴스가 되기 때문에 얘가 print보다 먼저. 
		System.out.println("생성자2");
		this.price = price;
	}
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


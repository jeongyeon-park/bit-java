package com.javaec.oop.goods.v1;

//v1.
//Goods 객체를 생성하여 불러와서 사용하는 클래스 
public class GoodApp {

	public static void main(String[] args) {
		//Goods 클래스 사용
		Goods notebook = new Goods(); //인스턴스 화
		//필드 접근
		notebook.name = "LG Gram";
		notebook.price=1500000;
		
		System.out.printf("%s, %d원 %n", notebook.name, notebook.price);
		
		Goods smartphone = new Goods();
		smartphone.name="iphone SE";
		smartphone.price=60000;
		System.out.printf("%s, %d원%n", smartphone.name, smartphone.price);
		//각각 인스턴스는 자기만의 메모리 공간을 가지고 있다. 
	}

}

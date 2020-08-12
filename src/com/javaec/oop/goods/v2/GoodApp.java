package com.javaec.oop.goods.v2;

//v2.
//Goods 객체를 생성하여 불러와서 사용하는 클래스 
public class GoodApp {
	public static void main(String[] args) {
		//Goods 클래스 사용
		Goods notebook = new Goods(); //인스턴스 화
		//필드 접근 
		//name과 price 필드는 private이므로 접근 불가(은닉)
		/*
		notebook.name = "LG Gram";
		notebook.price=1500000;
		System.out.printf("%s, %d원 %n", notebook.name, notebook.price);
		*/
		//setter를 이용한 우회접근
		notebook.setName("LG Gram");
		notebook.setPrice(150000);
		//메서드 호출
		notebook.showInfo();
		
		Goods smartphone = new Goods();
		/*
		smartphone.name="iphone SE";
		smartphone.price=60000;
		System.out.printf("%s, %d원%n", smartphone.name, smartphone.price);
		//각각 인스턴스는 자기만의 메모리 공간을 가지고 있다. 
		 */
		smartphone.setName("Iphone SE");
		smartphone.setPrice(600000);
		smartphone.showInfo();
	}
}

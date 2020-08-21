package com.javaec.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		//정수를 담을 수 있는 Box를 생성
		Box intBox = new Box(); //가능(Object)
		intBox.setContent(2020);
		
		//값을 꺼내와 봅니다.
		//Object이므로 다운캐스팅 필요
//		int content = intBox.getContent(); (얘가 object라서 오류. )
		int content = (int)intBox.getContent(); 


		System.out.println("박스의 내용물"+content);
		
		Box strBox = new Box();
		strBox.setContent("Java"); //가능
		
		//값을 꺼내와 봅시다.
		String strContent = (String)strBox.getContent();//캐스팅 필요
		System.out.println( "박스의 내용물 : "+ strContent);
		
		//만약에 캐스팅을 잘못하면?
		//위험하다. 
		strContent = (String)intBox.getContent();
		System.out.println( "박스의 내용물 : "+ strContent);

	}

}

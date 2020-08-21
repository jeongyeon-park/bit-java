package com.javaec.api.generics.v2;
//v1에서는 타입값 
public class BoxApp {

	//v2
	public static void main(String[] args) {
		//정수를 담을 수 있는 Box를 생성
//		Box <Integer> intBox = new Box<Integer>(); // 타입을 Integer 로 지정 
		Box <Integer> intBox = new Box<>();  //생략해도 된다. 
		intBox.setContent(2020); //OK
//		intBox.setContent("2020"); //컴파일러가 Generics 제곱
		
		
		//값을 꺼내와 봅니다.
		//내부 데이터가 Integer임이 확실. -> 캐스팅 불필요
//		int content = intBox.getContent(); (얘가 object라서 오류. )
		int content = (int)intBox.getContent(); 
		System.out.println("박스의 내용물"+content);
		
		Box <String>strBox = new Box<>();
		strBox.setContent("Java"); //가능
		
		//값을 꺼내와 봅시다.
		String strContent = (String)strBox.getContent();//캐스팅 필요
		System.out.println( "박스의 내용물 : "+ strContent);
		
		//만약에 캐스팅을 잘못하면?
		//컴파일이 안된다. (Generics 를 체크 
//		strContent = (String)intBox.getContent();
//		System.out.println( "박스의 내용물 : "+ strContent);

	}

}

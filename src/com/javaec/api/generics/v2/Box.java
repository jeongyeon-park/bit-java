package com.javaec.api.generics.v2;

//v2. Generics // 매우매우 중요
//타입 파라미터 : T ->Type이라는 뜻.

//많이 사용하는 타입 파라미터 관례
//R->return 
//k->Key
//V->Value 
//   ->어겨도 상관없으나 가급적 지키도록 하자 
//설계 시에 타입을 결정하지 않고 인스턴스화 할 때0 얘도 사용해야지 ㅏ록 생각한ㅁ. 
public class Box <T>{
	T content; //모든 클래스의 부모 (==뭐든지 들어갈 수 잇다.)

	// Getters / Setters
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}

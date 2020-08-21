package com.javaec.api.generics.v1;

//모든 것들을 담을 수 잇는 박스를 설계
public class Box {
	Object content; //모든 클래스의 부모 (==뭐든지 들어갈 수 잇다.)

	// Getters / Setters
	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
	
}

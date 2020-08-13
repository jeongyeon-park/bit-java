package com.javaec.oop.point.v4;
//v4.
//상속
public class Point {
	//필드
	private int x;
	private int y;
	
	//사용자 정의 생성자가 있을 경우 
	//JVM은 기본 생성자를 만들지 않는다.
	//기본 생성자를 만들어 줘야한다. 
	
	//사용자 정의 생성자 , 기본 생성자가 없어짐
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Point 생성자");
	}
	//getters / setters
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//메서드 
	public void draw() {
		System.out.printf("점(%d, %d)을 그렸습니다,%n",x,y);
	}
	
	//메서드 오버로딩
	//같읁 리턴 타입과 이름을 가졌지만
	//매개변수의 종류, 갯수, 순서만 다른 메서드
	public void draw(boolean show) {
		//show : ture -> 그렸습니다.
		//		 false -> 지웠습니다.
		//3항연산의 활용
		String message = show ? "그렸습니다.":"지웠습니다.";
		//TODO : -> if문 버젼으로 만들ㅇ ㅓ 보세요.
		System.out.printf("점(%d, %d)를 %s%n", x, y, message);
		
	}
	
	
}

package com.javaec.api.objectclass.v5;

import java.util.Arrays;

// v5.참조타입 필드를 가진 객체를 복사(깊은 복제)
public class Scoreboard implements Cloneable{
	//필드 : 참조타입
	// 깊은 복제를 위해서는 참조타입필드도 복제해서 분리해줘야한다. 
	private int scores[]; //정수배열
	
	//생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	//Getter, Setters
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//복제 메서드
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
		clone = (Scoreboard)clone(); //체크드 익셉션
		}catch(CloneNotSupportedException e) {
			System.out.println("복제를 지우너하지 않음 ");
		}
		return clone;
	}

	// 출력을 위한 toString 오버라이드
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//여기에서 필드 복제를 구현해주어야한다.
		Scoreboard clone = (Scoreboard)super.clone();//Object의 얕은 복제(얕은복제)
		//내부 참조 필드를 복제
		clone.scores = Arrays.copyOf(scores, scores.length); 
				//scores를 다른 인티저 배열로  처음부터 길이 끝가지 복제. 새로만든다. 
		return clone;
	}
	
	
	
}

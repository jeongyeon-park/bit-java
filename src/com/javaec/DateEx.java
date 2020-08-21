package com.javaec;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.input.DataFormat;

//Date클래스와 Calender class에
public class DateEx {
	public static void main(String[] args) {
		//날짜와 데이터의 획득
		Date now = new Date(); //현재날짜시간
		String nowStr = now.toString();
			
		System.out.println("현재 날짜: " + nowStr);
		System.out.println("현지화 된 날짜  "+ now.toLocaleString()); //이런게 Deprication
		// Deprecated 된 메서드는 사라질 메서드 -> 다른 방식으로 교체 필수
		
		//형식화 된 출력: DatawFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL 포맷: " + df.format(now));
		//FULL , LONG, MEDIUM, SHORT
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG 포맷"+df.format(now));
		
		//TODO: 미디엄, 쇼트 포맷으로 현재날짜 출력해봐라
		
		//자유로운 날짜 데이터 포매팅
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		System.out.println("SDF: "+ sdf.format(now));
	}
}

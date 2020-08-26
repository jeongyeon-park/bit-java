package com.javaec.thread.v1;

// Process: 실행중인 하나의 프로그램
// Thread: Process 내에서 실행되는 하나의 작업 흐름
// 하나의 Process가 실행되면 MainThread가 하나 생성
public class MainThread {

	public static void main(String[] args) {
		// 메인스레드와 별도로 다른 작업흐름 필요
		// Thread생성하여 실행. 동시에 병행수행하고싶으ㅏ면 별도의 스레드 생성. 
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		// 쓰레드의 시작 : Runnable -> running
		thread1.start(); //thread 내부의 run 메서드는 직접 호출하지 않음
		
		// 메인 스레드의 로직
		// A부터 Z까지 0.3초 간격으로 출력
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("MainThread: "+ch);
			//0.3초 대기 . mainthread는 running안해도 돌아감. 
			try {
				Thread.sleep(300);//예외많이 발생.
			}catch(InterruptedException e) {
				e.printStackTrace(); //thread들은 주로 interrupt
			}
			 
		}
	}

}

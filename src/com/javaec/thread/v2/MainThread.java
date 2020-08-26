package com.javaec.thread.v2;

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
		
		//Runnable을 이용한 작업 Thread . 그 자체로 thread화 시킬 수는 없음
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		//메인 스레드가 종료되면 WorkingThread를 통제할 수 없게 되므로
		//작업스레드의 흐름을 메인 스레드의 흐름에 합류
		try {
			thread1.join(); //메인메소드 흐름에 합류
			thread2.join(); //메인메소드 흐름에 합류
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		// 메인 스레드의 로직
		// A부터 Z까지 0.3초 간격으로 출력
		//두 스레드를 러닝상태로 만들고 main스레드가 종료되어버림. 
		//이렇게 되면 하위의 WorkingThread제어할 수 없게되어버림. 
		//workingThread의 작업 흐름을 MainThread에 연결해주어야함. : joining
		
		System.out.println("메인쓰레드 종료");
		
	}

}

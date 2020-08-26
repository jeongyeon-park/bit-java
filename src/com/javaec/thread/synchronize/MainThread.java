package com.javaec.thread.synchronize;

//객체를 공유하는 작업 쓰레드의 경우,
//임계영역을 적절히 제어 해 줘야 한다. (중요쓰)
public class MainThread {

	public static void main(String[] args) {
		//공유객체
		SharedMemory memory = new SharedMemory();
		User user1 = new User("철수",memory,200);
		user1.start(); //run을 만들어서 Running상태
		
		User user2 = new User("영희", memory, 100);
		user2.start();

	}

}

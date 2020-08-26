package com.javaec.thread.v3;

//Thread 생성 두번째 방법: Runnable 인터페이스 구현
public class AlphabetRunnable implements Runnable {

	//runnable안쪽의 메소드 구현해주어야한다.
	//Thread상속이 아니라서 getName()등 못쓴다.
	//Thread안쪽의 로직만 실행하고자하는 경우.
	@Override
	public void run() {
		// Thread 내부의 start 메서드에서 호출될 쓰레드의 로직
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("AlphabetRunnable: "+ch);
			//0.3초 대기 . mainthread는 running안해도 돌아감. 
			try {
				Thread.sleep(300);//예외많이 발생.
			}catch(InterruptedException e) {
				e.printStackTrace(); //thread들은 주로 interrupt
			}
			 
		}
		
	}
	
	
}

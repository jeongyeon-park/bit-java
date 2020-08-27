package com.javaec.network.echoserver.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	//필드: 통신을 위한 소켓
	private Socket socket;
	
	//생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
//	run 메서드 오버라이드 
	@Override
	public void run() {
		// 클라이언트 접속 이후의 로직을 여기에서 처리 
		try {
			InetSocketAddress client = 
				(InetSocketAddress)socket.getRemoteSocketAddress(); //casting해줘야함.
			System.out.println("[클라이언트가 연결되었습니다]");
			System.out.println(client.getAddress()+":"+
						client.getPort());
		
			//클라이언트로부터 메세지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
		
			//EchoBack을 위한 OutputStream 확보
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
		
			//메세지 읽기
			String message;
			while((message = br.readLine()) != null) {
				System.out.println("수신 메시지: "+ message);
				//Echo Back 
			
				System.out.println("Echo Back: "+message);
				bw.write("[Echo]"+ message);
				bw.newLine();
				bw.flush();  //buffer비우기
			}
		
		//후처리
		System.out.println("[접속이 종료 되었습니다.]");
		System.out.println("==========");
		System.out.println("<서버종료>");
		System.out.println("클라이언트 접속 해제");
		
		//스트림 닫기
		
		br.close();
		bw.close();
	
	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
	
	
}

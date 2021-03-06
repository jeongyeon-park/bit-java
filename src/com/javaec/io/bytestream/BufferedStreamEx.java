package com.javaec.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String rootPath = System.getProperty("user.dir")+
			"\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		try {
			// 주 스트림이 필요
			InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);
			
			//보조 스트림: 단독으로는 사용될 수 없다
			//데코레이션 
			BufferedInputStream bis = new BufferedInputStream(fis); //단독으로 처리할 수 없어서 주 스트림거를 가져와줌
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//버퍼가 필요
			byte[] data = new byte[10240]; //10kbyte
			int size = 0; //버퍼를 읽어오기 때문에 전송된 데이터의 사이즈 확인 . 아까는 data가 넘어왔음.
			
			while((size = bis.read(data))!=-1) {
				//버퍼 출력
				bos.write(data);
				System.out.println(size + "바이트 복사 했습니다.");
			}
			
			//보조 스트림을 닫으면 메인 스트림도 닫힌다. 
			bos.close();
			bis.close();
			
			System.out.println("파일을 복사했습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

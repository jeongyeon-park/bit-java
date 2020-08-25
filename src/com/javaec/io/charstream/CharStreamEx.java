package com.javaec.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.javaec.io.bytestream.FileReader;
import com.javaec.io.bytestream.Reader;

public class CharStreamEx {
	static String rootPath = System.getProperty("user.dir")+
			"\\files\\";
	//임의로 text파일 만들거임
	static String filename = rootPath + "char.txt";
	
	public static void main(String[] args) {
		//Writer : char 출력 Stream의 최고 조상
		try {
			Writer fw = new FileWriter(filename);
			//출력
			fw.write("Bit Computer\r\n");
			fw.write("Java Programming\r\n");
			fw.write("2020.08\r\n");
			
			//버퍼 비우기
			fw.flush();
			fw.close();
			System.out.println("파일 저장 완료!");
			
			//파일 읽어오기
			Reader fr = new FileReader(filename);
			
			int data = 0; //데이터 저장 변수
			while((data=fr.read())!=-1) {
				//실제 데이터는 char-> 다운 캐스팅 해주어야한다. 
				System.out.print((char)data);
			}
			fr.close();
			System.out.println("파일 읽기 완료!");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

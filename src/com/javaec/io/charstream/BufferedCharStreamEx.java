package com.javaec.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static String rootPath = System.getProperty("user.dir")+
			"\\files\\";
	static String filename = rootPath + "last-leaf.txt";
	static String filtered = rootPath + "last-leaf-filtered.txt";
	
	//한줄 단위로 읽어서 readLine
	//해당 Line에 leaf, leaves 단어가 포함되어 있으면 별도로 저장. 
	public static void main(String[] args) {
		try {
			//주 스트림
			Reader fr = new FileReader(filename);
			Writer fw = new FileWriter(filtered);
			
			//보조 스트림
			BufferedReader br= new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//아까는 int -> char 캐스팅했었는데
			//BufferedReader를 사용하면 줄단위 입력이 가능하다. 즉 변환할 필요가 없다.
			String line = ""; //데이터 입력 받을 곳.
			//더 이상 읽을 라인이 없으면 null이 나온다.
			while((line = br.readLine())!= null) {
				//체크 ㅣ leaf, leaves포함? 문자는 대소문자 구분함. 모두 대문자로 바꾸거나 모두 소문자로 바꾼후 구분작업.
				if(line.toLowerCase().contains("leaf") || 
				   line.toLowerCase().contains("leaves")) {
					//leaf, leaves 들어있는 라인만 출력
					System.out.println(line);
					bw.write(line);
					bw.newLine();// 개행 출력
				}
			}
			// 보조 스트림 닫아주기
			br.close();
			bw.close();
			System.out.println("필터링 완료!");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

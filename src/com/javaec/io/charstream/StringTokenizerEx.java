package com.javaec.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

//StringTokenizer
//특정 구분자를 기준으로 문자열을 토큰화 시키는 클래스
//기본 구분자는 \t\n\r
	static String rootPath = System.getProperty("user.dir")+
			"\\files\\";
	static String filename = rootPath + "sangbuk.txt";
	public static void main(String[] args) {
		
		try {
			//주스트림 열기
			Reader freader = new FileReader(filename); //이런것들은 예외처리를 잘 해주어야함
			//보조스트림 열기
			BufferedReader br = new BufferedReader(freader); //보조스트림이 입출력 직접 X. 데코레이터. 주스트림을 넘겨줘야함
			
			//데이터 저장용 변수
			String member;
			//더 이상 읽을 라인이 없는 동안 루프 
			while((member = br.readLine()) != null) {
				//분절
				StringTokenizer st = new StringTokenizer(member,",");
				//토크나이저 루프 
				while(st.hasMoreTokens()) {//남아있는 토큰이 있나?
					String token = st.nextToken();
					System.out.print(token+" ");
					//한 라인의 처리
				}
				System.out.println();
			}
			br.close(); //보조스트림 닫기. 주 스트림도 같이 닫힌다. 
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수가 없어요!!!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

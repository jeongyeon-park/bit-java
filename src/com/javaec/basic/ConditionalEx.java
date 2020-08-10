package com.javaec.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		ifElseEx3();
//		switchEx();
//		switchEx2();
//		whileEx();
//		whileEx2();
//		whileEx3();
		doWhileEx();
	}
	public static void doWhileEx() {
		//숫자 입력 받아서 합산
		//0을 입력 받으면 반복을 종료
		int num=0;
		int total = 0; //합산 변수

		Scanner scanner = new Scanner(System.in);
		
		//최소 1번을 실행해야 하는 반복 do while로 하자. 
		//or 반복 조건이 loop문 내부에서 결정 되는 경우 do ~ while
		do {//일단 최소 한번 실행
			System.out.print("정수 입력[0이면 종료]:");
			num = scanner.nextInt();
			total +=num;
		}while(num != 0);//문장의 끝이다 알려주기. 
		
		System.out.println("합산값: "+total);
		scanner.close();
	}
	public static void whileEx3() {
		//while은 종료를 위한 제어 변수를 잘 제어하여
		//무한루프에 빠지지 않도록 해야한다.
		//경우에 따라서는 의도적으로 무한루프를 사용하기도 한다.
		while(true) {
			System.out.println("무한루프...Ctrl+C to Quit");
		}
	}
	public static void whileEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력: ");
		int dan = scanner.nextInt();
		//제어용 변수
		int i =1;
		
		while(i<=9) {//9이하일 동안 반복
			System.out.println(dan+"*"+i+"="+(dan*i));
			//종료를 위한 제어변수 제어.
			i++;
		}
		scanner.close();
	}
	public static void whileEx() {
		//반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
		int num = 1; //시작값, 조건 비교
		int total=0;//합산 변수
		
		//while loop
		while(num<=100) {// n이 백 이하인 동안 반복
			total +=num;
			//주의: while문은 반복 조건을 개발자가 직접 컨트롤 헤즈ㅓ야햠.;
			num++;
		}
	}
	public static void switchEx2() {
		//월 정보 (정수)입력
		//1,3,5,7,8,10,12 -> 31일
		//2->28일
		//4,6,9,11 -> 30일
		Scanner scanner = new Scanner(System.in);
		System.out.print("월입력:");
		int month = scanner.nextInt();
		String days = "";
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			days = "31일";
			break;
		case 2:
			days="28일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		case 12:
			days = "30일";
			break;
		default:
			days="?";
		}
		System.out.println(days);
		scanner.close();
	}
	public static void switchEx() {
		//ifElseEx3과 동일한 내용을 switch
		//switch는 전달받은 변수의 값을 이용해서 흐름을 제어(==)
		Scanner scanner = new Scanner(System.in);
		System.out.print("1:C, 2:JAVA, 3:C++, 4:Python -");
		
		int code = scanner.nextInt();
		switch(code) {//switch는 변수의 값을 비교흐름제어
		case 1://code == 1
			System.out.println("R101");
			break;
		case 2: //code == 2
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default://else 위에 case 문에서 일치하는 결과 없을 때
			System.out.println("관리자에게 문의");
		}
		scanner.close();
	}
	
	public static void ifElseEx3() {
		//과목번호 입력
		//1->R101, 2->R202
		//3->R303, 4->R404
		//나머지->관리자문의
		Scanner scanner = new Scanner(System.in);
		System.out.print("1:C, 2:JAVA, 3:C++, 4:Python -");
		
		int code = scanner.nextInt();
		if(code == 1) {
			System.out.println("R101");
		}else if(code==2) {
			System.out.println("R202");
		}else if(code ==3){
			System.out.println("R303");
		}else if(code == 4) {
			System.out.println("R404");
		}else {
			System.out.println("관리자에게 문의");
		}
			
		scanner.close();
	}
	public static void ifElseEx2() {
		//정수 입력
		//0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
		//if ~ else if ~ else
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력:");
		int num = scanner.nextInt();
//		
//		if(num>0) 
//			System.out.println("양수입니다!");
//		else if(num==0) 
//			System.out.println("0입니다!");
//		else
//			System.out.println("음수입니다!");
		
		//중첩 if :1차로 필터링
		//		내부 블록 안쪽에서 2차로 조건 판별
		if(num == 0) {
			//0일 때
			System.out.println("0입니다.");
		}else {
			//0이 아닐 때
			if(num > 0) {
				//양수
				System.out.println("양수입니다.");
			}else {
				//음수
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();	
	}
	public static void ifElseEx() {
		//Scanner로 점수를 입력
		//점수가 60점 이상이면 "합격"
		//그렇지 않다(60점 미만이면) "불합격"
		Scanner scanner = new Scanner(System.in);
		int score=scanner.nextInt();
		
		//판별(의사결정)
		if(score >= 60) {
			//비교값이 true 일 때 실행됨
			System.out.println("합격!");
		}else {
			//비교값이 false일 때 실행
			System.out.println("불합격!");
		}
		
	}

}

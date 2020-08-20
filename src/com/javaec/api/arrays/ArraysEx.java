package com.javaec.api.arrays;

import java.util.Arrays;
import java.util.Collections;



// Arrays 유틸리티 클래스
//		배열의 복제
//		배열의 정렬(sort)
//		배열의 검색
public class ArraysEx {

	public static void main(String[] args) {
//		arrayCopyEx();
//		basicSortText();
//		basicSortDescendingTest();
//		customSortEx();
//		basicSearc();
		customSearch();
	}
	//사용자 정의 자료형의 검색
	public static void customSearch() {
		Member[] members = { new Member("박정연"),
				new Member("고길동"),
				new Member("김박박"),
				new Member("박지현"),
				new Member("정석")
		};
		System.out.println("원본 배열 : "+ Arrays.toString(members));
		Arrays.parallelSort(members);
		System.out.println("정렬된 배열: "+ Arrays.deepToString(members));
		
		int index = Arrays.binarySearch(members, new Member("박지현")); 
	
		//사용자 정의 객체 검색시에는 객체를 넘겨주어 해당 객체와 같은지를 비교 해주어야한다.
		System.out.println("검색된 인덱스 : "+ index);
	}
	
	//검색 테스트
	public static void basicSearc() {
		//java는 기본적으로 binary search 방식을 채택함.
		//미리 배열의 데이터가 정렬 되어있어야하낟.
		//기본 자료형 검색
		int num[]= {5,6,2,1,3,7,9,8,4};
		System.out.println("원본 배열: "+ Arrays.toString(num));
		Arrays.sort(num); //바이너리 검색 이전에 정렬이 되어있어한다. 
		int index = Arrays.binarySearch(num, 3);
		System.out.println("3의 인덱스 : " + index);
		
		//참조 타입의 검색
		String[] items = {"Java", "c", "C++", "Python", "Linux"};
		System.out.println("원본배열 : "+ Arrays.deepToString(items));
		
		//미리 데이터가 정렬 되어있어야한다. (중요)
		Arrays.parallelSort(items);
		System.out.println("정렬된 배열: "+Arrays.toString(items));
		int index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Python의 인덱스: "+ index2);
	}
	
	//사용자 정의 정렬
	private static void customSortEx() {
		//Member 객체의 배열
		Member[] members = {
				new Member("홍길동"),
				new Member("박정연"),
				new Member("김혜란"),
				new Member("어쩌고")
		};
		System.out.println("원본 배열 : "+ Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬된 배열 "+ Arrays.toString(members));
	}
	
	
	//역순 정렬
	//내림차순 (Descending : 큰값 -> 작은 값)
	private static void basicSortDescendingTest() {
		Integer[] scores = {80, 50, 75, 90, 70, 88, 76};
		System.out.println("원본 배열 : "+Arrays.toString(scores));
		//역순정렬
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("역순 정렬: "+Arrays.toString(scores));
	}
	//배열의 정렬
	//기본 정렬은 오름차순 (Ascending: 작은 값 -> 큰 값 순) :Asc
	private static void basicSortText() {
		int[] scores = {80, 50, 75, 90, 70, 88, 76};
		System.out.println("원본 배열 : "+Arrays.toString(scores));
		//정렬
		Arrays.sort(scores);
		System.out.println("기본정렬: "+ Arrays.toString(scores));
	}
	
	private static void arrayCopyEx() {
		char src[] = "Java Programming".toCharArray(); //char 배열로 변환해준다
		
		//System 객체를 이용한 배열의 복사 
		char target[]=new char[src.length];
		System.arraycopy(src, //원본매열
				0, //시작위치
				target, //복사 대상 배열
				0,  //복사시작위치
				src.length); //복사할길이
		System.out.println("target:" + target);

		System.out.println(Arrays.toString(target));
		
		//Arrays.copyof이용
		target = Arrays.copyOf(src, src.length);
		System.out.println("Arrays.copyOf활용복제:"+ Arrays.toString(target));
	
		//일부복제
		target = Arrays.copyOfRange(src,//원본배열
				5,// 시작위치
				12); // 끝 위치
		System.out.println("일부 복제: "+Arrays.toString(target));
	}

}

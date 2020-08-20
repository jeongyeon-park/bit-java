package com.javaec.basic.reftytypes;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayBasic();
//		arrayMemoryTest();
//		arrayNDim();
//		arrayCopy();
		arrayCopySystem();
	}
	public static void arrayCopySystem() {
		//System 객체를 이용한 배열의 복사
		int scores[]= {90,80,70};
		int target[]= new int [10];
		
		System.arraycopy(scores,//원본배열
				0,//원본배열의 복사 시작 인덱스
				target,//대상배열
				1,//대상 배열 내 복사 시작 인덱스
				scores.length);// 복사 할 내용의 길이
		//loop 돌리면서 내용을 확인
		//enhanced for
		for(int value:target) { //value가 받고자 하는 데이터 target에서 끄집어 내서 value에 할당함.
			System.out.print(value + " ");
		}
		System.out.println();
	}
	/*		for(int value:target){
	 * 			system.out.print(value+" ");
	 *		} 	
	 *		
	 *		System.arraycopy(scores,0,target,0,score.length)//원본배열/대상배열/복사시작인덱스/원복 복사 길이
	 */
	public static void arrayCopy() {
		//배열은 크기변경이 불가, 추가 내용이 있을 경우 새 배열 생성 후 복사. 
		int scores[]= {90,80,70};
		// 공간 7개 추가
		int target[]=new int[10];
		
		for(int i=0;i<scores.length;i++) {
			target[i]=scores[i];
		}
		
		for(int i=0;i<target.length;i++) {
			System.out.print(target[i]+" ");
		}
		System.out.println();//개행
	}
	public static void arrayNDim() {
		//2차원 배열
		int[][] twoDim = new int[3][5];
		
		//기본 데이터가 있을 경우
		int table[][]= {
				{1,2,3,4,5},//1행
				{2,3,4,5,1},//2행
				{3,4,5,1,2}
		}; //3행 5열의 배열 
		
		System.out.println("table.length:"+table.length);
		//table[0] ~ table[table.length-1]
		System.out.println("table[0].length: "+table[0].length);
		
		//루프를 돌면서 해당 배열 내부의 모든 값을 합산 
		int sum = 0;
		for (int row =0; row<table.length; row ++) {
			//행루프
			int subtotal =0; // 한 행의 합산.
			for(int col=0; col<table[row].length;col++) {
				//열루프
				subtotal+=table[row][col]; //row 행 col열
			}
			System.out.printf("%d행의 합산 : %d%n", row, subtotal);
			sum+=subtotal;
		}
		System.out.println("총합:"+sum);
	}
	public static void arrayMemoryTest() {
		//참조 자료형은 메모리의 구조를 잘 이해해야함.
		int scores[]= {80,90,100,70};
		int scores2[]= scores;
		System.out.println("Scores2의 길이:"+ scores2.length);
		System.out.println("Scores2의 0번 방:"+ scores2[0]);
		System.out.println("score1과 score2는 같은가? "+ (scores==scores2)); //주소 비교
		scores[0]=100; //scores 배열을 변경
		System.out.println("scores2의 0번방:"+scores2[0]);
	}
	public static void arrayBasic() {
		// 문자열 배열 : names -> 선언한 후 초기화		
		// float 배열 :heights -> 선언과 동시에 값 구현
		// int 배열: scores -> 빈 배열 생성 후 출력
		
		String[] names; //=String names[]
		int scores[]; // = int[] scores
		
		//초기화
		names = new String[] {
				"홍길동",
				"장길산",
				"전우치",
				"임꺽정"
		};
		//생성 시 이미 배열의 값이 있다면
		float heights[] = { 
				175.3f,
				170.2f,
				234.3f,
				145.3f
		}; // 생성과 동시에 할 경우만 가능 
		
		//빈 배열 생성 후 값을 지정 
		scores = new int [4];
		//인덱스 접근 :0부터 시작. 
		// 길이:/length 
		//*마지막 인덱스 == .length-1
		scores [0]= 80;
		scores [1]= 60;
		scores [2]= 60;
		scores [3]= 60;
//		scores [4]= 60 에러
		
	for(int i=0;i<scores.length;i++) {
		System.out.printf("%s(%.2f): 점수 = %d%n", names[i],heights[i], scores[i] );
	}
	}
}

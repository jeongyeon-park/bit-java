
### Day 5 note

변수의 값 비교
>switch (변수){
	     case 변수1:
		    break;
	     case 변수2:
		    break;
	     case 변수3:
		    break;
	     default:
		  //해당 내용이 없을 때
	     break;
}

자바는 case에 char,String도 올 수 있음.
default란? 나머지 처리하는 else와 동일함. 

!86쪽 연습문제 풀기

코드 반복 실행.. 코드 낭비 줄이고.. 
while 반복문 : ~하는 동안 
while 안이 참인 동안. 내부블록을 반복하여 실행한다. 
condition 안이 false이면 내부 블록은 실행되지않음. 
condition값이 계속 true이면 무한반복 초기의 condition값이 시작했을 때,, 실행되지않는 부분있을수잇음
while 은 조건 설정 중요함. (무한반복을 빠져나갈 조건 설정중요)

while문은 시작하기 전 앞쪽에서 반복문 체크. 
단 한번도 실행 한될 수 있음. 조건에 상관없이 최소 한번은 시행하고 싶을 때. 
몇번 반복할 지 정할 수 있음
for(초기화;조건검사;증감연산){
}

디버그
진행순서, 변수 변화를 보고 싶을 때.
디버그 하는 방법. 코드를 중간에 중단 시킬 수 있음. 하고싶은 줄 왼쪽 더블클릭
점이 생김->브레이크 포인트(중간점) 디버그 실행중에 중단점을 만나면 자바의 디버거가 거기에서 대기. 
한줄씩 코드를 하나씩 넘어가면서 실제 실행결과를 확인해 볼 수 있다. 
벌레모양 누르거나 우클릭 디버그 애즈 자바 어플리케이션. 
스위치 누르면 디버그 모드로 변환. 
오른쪽 화면 잘 봐야함. 
상단 보면 빨간버튼, 삼각혀 ㅇ버튼, 화살표 버튼.. step over(다음코드 실행해주세요:이걸 제일 많이 쓸거임)
두번째 화살표
그러면 오른족에 생긴게 뜬다. 
화살표: 최종적으로 남은 코드 실행.


continue와 break
반복문 내에서 continue를 만나면 아래쪽 이후 문장은 수행하지 않음.
반복 블록을 벗어나지않고 블록 가장 마지막으로 이동, 다시 반복조건 검사. 

break 
반복문 수행을 중단하고 반복블록 다음 문장 실행 
자기를 감싸는 바로 바깥쪽 반복문만 나감. 중첩된 반복문에서 한단계 씩 반복문을 벗어남. 

!연습문제 반복문 연습 풀기. 별찍기..
%6==0 %14==0 인것찾아내기. 
반복 횟수 알때:for, 반복횟수 알 수 없을 때 :while.

### Day 6 Note

-난수발생
int num = (int)(Math.random()*최댓값)+최솟값;
math.random=>0.0< <1.0까지 랜덤.1.0은 포함이 안됨. 그래서 1 더해주는거임
int num =(int)(Math.random()*6)+1
정수처리하면 0이상 5미만. 그래서 +1해주면 1이상 6미만값 정의됨.


-참조타입
스택메모리-변수같은 것, 기본타입. 
힙메모리 - 배열 참조타입에 만든다 . 메모리 주소를 참조. 주소를 담아둔다. 
String s = "Hello"  stack에는 주소랑 s이름만. s부르면 걔가 힙에 가서 가져옴
null type: 참조타입은 힙 메모리상의 뭔가를 가리키고있음. 널 타입은 
가르키는게 없다(주소가 비어있다.)

객체 타입은 힙메모리에 만들어지고, 스택에 이름 주소가 있음. 이게 힙을 가르킴


        데이터 타입
   기본타입                   참조타입    널타입
불린    수치형            문자열 
      
     인티저   플로팅

바이트 쇼트   플로트 더블
롱 캐릭터 인트

참조 타입의 비교.
기본 타입 ==<-같다. 주의
Person p = new Persom();
Person p2 = new Person(); (new라는 거니까 새로운 person객체 생김)
Person p3 = p2;
p3==p2 -> True.
참조형 == ->주소가 같다는 뜻
.equals() ->값이 같은가? 메서드 써줘야함.

refVall() == refVal2:refVal1 (주소 동일?)
refVall() != refVal2:refVal1 (주소 다름?

참조변수 null인지 늘 체크 ! 

문자열 저장위해 String으로 선언.
선언 -> 초기화. 리터럴: 직접 소스코드 상에 입력한 것. 
carName = "문자열" -> 리터럴
String valName = new String("문자열");
문자열 String은 편하게 쓰라고 만들어 둔거. 참조타입 만들때는 new로만들기.
new-->heap메모리에 객체를 만들어라 그리고 주소가 리턴된다. 
주소를 받아서 valName에 넣는다. 

strVal1.equals(StrVal2); vlq1과 val2가 같은가? 라는 뜻
객체는 데이터와 기능들을 같이 가지고 있다. 

%f -> 실수
%s -> 문자열
%d -> 10진수
%.2f -> 소수 둘재자리까지.

-열거형(enum)
몇가지로 한정된 값만을 가지는 경우
요일, 계절, 성별 등.. 열거 상수는 모두 대문자로 작성 
enum타입이라면 제한된 자료의 데이터 타입을 새로 만든다. 
DayOfWeek d ={}명시된 값 이외에는 절대 담을 수 없다. 
실제 담기는 데이터들 = 열거상수 
열거상수는 모두 대문자로 작성..
여러 단어로 구성될 경우 _로 연결. (관례) java는 상수와 enum많이 사용./
가독성을 높일 수 있음. ,오타 방지(값 제한 지정)
valueOf(String name) 주어진 문자열 열거객체 리턴. 
values() 모든 열거 객체를 배열로 리턴. 

-배열
배열도 객체임. 참조타입. new로 생성되는 참조 자료형이다. 
배열 안이 기본자료형 일 수도 있고 참조 자료형 일 수도 있다. 
배열도 힙에 있음
배열은 메모리 효율 좋지만 융통성은 없음 .

int [] arr 
선언부에는 사이즈를 집어넣으면 안된다.
미리 넣고 싶으면 변수 선언과 동시에 해주어야한다. 

배열의 초기화
new 연산자로 배열 생성
int[] intArray = new int[3]; 힙 만들어진 다음에 스택에 연결하기때문에 
선언부에 길이 지정할 수 없음. 
배열 안쪽에 length라는 멤버가 생김. 
마지막 인덱스는 length-1이다.

정수 배열하나 만들었다면 
int i[]

int[] j = i

자바의 다차원배열. 일차원 배열이 또 배열로 구성되어있다. m행n열 
table.length -> 행이 나옴
table[0].length -> 열이 나옴 


각 행의 길이가 다 달라도 노상관임.

배열은 접근 효율이 좋음.
한번 생성하면 크기변경 할 수 없음
 
점수배열| 0 | 0 | 0 |
추가하고 싶으면 큰 배열 만들고 복사해줘야함

system.arraycopy()로 배열을 복사 할 수도 있다. 
원본 배열과 시작 인덱스 

system.arraycopy(원본배열, 시작인덱스, 복사할길이);


###Day 7 Note
Day 7 Note
객체지향 프로그래밍 
절차지향 프로그램 안에 기능이 다 녹아있음 
책 객체에 제목,저자,출판사,가격(필드)
필드:
기본타입:단일 데이터
객체:여러개의 데이터 담을 수 있음.

책장 객체 : 책갯수,책 객체를 관리하는게 주 목적(책 정보찾아주기
, 책 객체 반환하기->단일 책임의 원리)즉. 책을 관리한는 역할만
충실히 해주면 고객관리 등 이런게 책장이 신경 쓸 부분이아님/

객체를 어떻게 나누느냐? 얼마나 역할을 잘 부여하는가?가 목표

책장은 여러개의 책을 가질 수 있고 그 책을 관리할 수 있다.
객체와 객체의 관계다. 

객체이름(UML)
해당 객체가 다루어야할 데이터(필드,속성)

객체:속성들+해당객체이용기능(메서드). 즉 데이터와 속성을 같이
가지고있다. 


고객                고객장부
정보   --------->   고객정보
메서드 0..*      1  

중요하지않은 것 없애는 것 = 일반화 (추상화와 비슷하다)

모든게 중요한 것은 아니다.
관점에 따라 속성,기능 다르게 표현.
관점을 어디에잡고 어떻게 설계..

재사용.관점 잘 파악, 요구사항에 맞게 설계 중요.
설계도를 그려두면 양산이 가능. 

클래스(설계도)->실제사용가능 객체.인스턴스로 만든다(인스턴스화)
인스턴스는 다른객체(외부객체)참조, 사용할 수 앗게됨
<-인스턴스가 사용하는 다른객체: 레퍼런스,참조객체

1.설계도:클래스
2.실체화:인스턴스
3.참조:레퍼런스 

설계도 
new 키워드. 실제 힙메모리상에 올려줌. heap메모리 상에 책이 
만들어짐. 이게 인스턴스임. 그 주소를 책 b1로 넘겨줌. 
그 객체는 책이라는 설계도로 만들어졌어.
책 b1 = new 책();
new는 새 객체를 인스턴스화 
c2 ISBM 교체, -> c1 ISBM도 변화 

c1=null; 주소가 null. 연결 x이게 됨.(책 인스턴스가)
GB가 책인스턴스와 stack메모리상에 연결된 정보가 하나도 없다면
책 인스턴스를 지워준다. 메모리 관리는 메모리컬렉터가.

자동차 설계 
공통 요소: 달리다()
버스+안내방송, 뒷문열기
스포츠카+ㅊ천자 움ㄴ 열기..
공통점 추출.

자동차에거 추가기능 추가. (일반화, 추상허ㅣ 시킨 자동차)
공통점 뽑아낸 거 => 부모클래스
버스,스포츠카,->슈퍼클래스, 증 부모 클ㄹ래스, 상위클래스

자동차 확장(상속)->추가기능 추가 -=>자식클래스, 서브클래스

버스는 자동차다
스포츠카는 자동차다. 
참조 값 받을 때 조상 Type의 레퍼런스 변수ㅡㄹㄹ 후손 인스턴스 
레버런런스 할 수 있

b.drive("달리기")-- 알아서 와.

car c2 = new sc();
Sc s = new Sc();

주차장. 주차공간 여려개.
레퍼런스 타입 클래스에 설계되어 있는 경우만 사용.
물러받은거+자기자신이 설계한 부가적인 기능만 사용가능. 
조상설계도로 받았을때는 자기 기능과, 부모로 부터 불려받은 기능.
설계도에 구현된 부분 위외 기능으 ㄹ사움하기 실ㅀ

주차


Bus[] park = new Bus[3]();  // 이 주차장 자리에는 bus만 들어갈 수 있

Car[] park = new Car[3]();  //리 주차장 자리는 크기 노상관. 
자ㅗㄷㅇ차 가지고 <-Shapl 


기본기능 확장:스포츠카<-car 달리는 기능 완화싶어. 확장 하 ㄴ수 
메세지 오버라이드:덮어쓰기/
***부모와 같은 모양이지만 내부 기능ㅇㄹ 별도로 구현. ***

부모클래스로 참조타입 잡으면 자동차 확장안:모든 객체를 다 담을 수 있음.
//부모의 기능과 완전히 같은 모양으로 내용을 다시 선언
-> 메서드 오버라이드

코드 부품화, 재사용이 주 목적
문제가 생겼을 때 해당역할 수행객체만 수정하면된다.
객체 구성요소: 속성정보(필드) + 동작(메서드)
객체 정의 설계도(클래스)-> 인스턴스(객체)/객체=인스턴스.객체가 메모리에 할당되어 실제 사용될 때
인스턴스라 부른다. 설계도->실제사용(인스턴스) 인스턴스 화  

상속성, 캡슐화, 다형성, 추상화 


1.상속: 확장 
이미 만든 객체와 비슷하지만 필드와 메서드가 약간 차이나는 객체를 생성. 
더 필요한 필드와 메서드 추가 필드(나이,이름) 메소드(밥먹기, 보기)
자식코드가 간결해짐. person class 확장 -> employ class 

2.캡슐화:객체의 실제 구현 내용 감추고,, 접근 방법만 노출
은행 계좌 클래스 필드:잔금, /누가 잔금에 맘대로 값 넣으면 큰일남. 그래서 감춰야함. 
외부 객체가 볼때는 객체 내부구조를 알지 못함.** 정보은닉 **
객체가 노출하여 제공하는 필드와 메서드만 이용할 수 있음. 
객체 작성 시 숨겨야할 필드, 메서드, 공개필드 메서드, 필드 구분하여 작성해야함.

캡슐화 왜?: 잘못된 사용으로 객체 손상 피아기 위하여.
접근 제한자 (Access modifier)를 사용하여 객체의 필드 메서드 사용범위 제한.. 

3.다형성 : 하나의 메서드나 클래스를 다양한 구현으로 사용가능하게 하는 개념.
오버로드, 오버라이드


java Class 필드:속성.
데이터, 상태를 저장하는 변수
기본타입 또는 참조타입으로 정의
멤버변수라고도 함. 

접근자. 접근 제한자.
객체의 필드와 메서드에 접근을 제한하기 위해 사용. 
정보은닉(캡슐화)를 위한 방법
public,> protected,> default,> private.
접근제한자 안쓰면 디폴드 상태/. 클래스 내부에서는 허용, 같은 패키지안쪽 클래스 접근 가능

메서드는 객체의 기능, 행동을 정의한다. 
결과객체의 타입과 리턴타입의 타입이 무조건 같아야한다. 
어떤 결과 반환 하지않을 때 void.

매개변수(파라미터)
메서드 선언할 떄 괄호 안에 표현 된 input값을 나타내는 변수
구체적인 값은 인자

반환타입
0개 혹은 1개의 값을 output으로 반환할 수 있음.
반환 값은 메서드 선언에서 정의된 반환타입과 일치해야함.

메서드 이름(명명규칙)
식별자 규칙,숫자로 시작할 수 없다.
관례따라 소문자로 작성... 두번째 시작은 대문자
기능 쉽게 알 수 있도록 작성하는게 좋음.

가변인수
메소드의 매개변수 개수를 알 수 없을 때 사용. 
return a + b; 
첫번째 방법. 배열로 전달.
두번째 . ...을 이용하여 선언
double sum(double ...values){} ->배열처럼 자동으로 변환
sum(1,2,3,4,5);<-이런식

메소드 이름 같아도 된다.
다형성 
overloading 

객체의 데이터는 객체 외부에서 직접 접근 막는게 좋다ㅏ(은닉)
접근 우회경로를 만들어 필드에 접근하자.
int price -> 읽기 위해서 getPrice()만들기
          -> 쓰기 위해서 setPrice(int price)만들기
readonly :읽기전용 하려면 setPrice 없으면 됨. getter만
writeonly setter만.




# 비트교육센터 자바 프로그래밍 

🐣 20년 8월 

🐥 2학기 자바 A+을 위하여 

---------------------------------------------------------------------------------------------------

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


### Day 7 Note

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


### Day 8 Note
1.생성자
Stack Heap
String s=new String "안녕"

new 연산자와 같이 사용. 클래스로부터 객체를 생성할 때 호출되고 객체의 초기화를 담당
생성자 실행시키지않고 클래스로부터 객체를 만들 수 없음. 
객체 생성 시 1회 메모리에 올려줌.
모든 클래스는 반드시 하나이상의 생성자 필요.
생성자는 리턴이 없다. 생성자는 여러개 있을 수 있다->생성자 오버로딩
생성자가 없다면?
**만약에 클래스 내 생성자가 하나도 없다->컴파일 과정에서 JVM이 강제로 기본 생성자 삽입**

기본 생성자 : 매개변수가 없는 생성자.
클래스에 생성자 없으면 컴파일러가 기본 생성자를 추가. 필요에 따라 생성자 여러 개 가능

This. 매서드 호출을 받는 객체. 현재 사용중인 객체 그 자체를 의미. 
생성자 만들 때 , 생성자가 여러개라면 

오버로딩: 하나의 클래스에 같은 이름 메서드 여러개 존재 가능.
메서드들은 매개변수 타빙, 개수, 순서로 구별
반환값이 다른것은 오버로딩이 아님.

생성자 여러개->생성자 오버로딩

메모리 범위 (Scope)
static , instance , local 변수.
java 는 블록 단위. if(){}<-이게 블록. 
메서드 만들었을때 거기 안쪽의 변수. 바깥을 벗어나면 접근 불가함. (지역변수)
메서드 영역, 블록 안쪽.
클래스 영역 -인스턴스 변수 
            -클래스 변수 : static이라고 붙은거. (정적) static 영역에서 
 

인스턴스 변수. 각 인스턴스의 개별정인 저장공간. 인스턴스 생성 시 생성되고, 참조변수 없을때
가비지 컬렉터에의해 자동 제거.
클래스변수: Static 같은 클래스의 모든 인스턴스가 공유. new없이(인스턴스 생성 없이)
'클래스이름.클래스(static)변수명'으로 접근
지역변수:메서드 안쪽 선언. 메서드 안에서만 . 메서드 끝나면 소멸함. 
인스턴스 변수는 인스턴스가 생성 될 때마다 생성. 인스턴스마다 다름
클래스 변수는 모든 인스턴스가 하나의 저장공간을 갖게되는 공유영역. 
static영역에서 인스턴스 영역으로 접근 불가함. 

static 멤버.
전역변수와 전역함수를 만들 때 사용. 모든 클래스에서 공유하는 전역변수나 전역함수를 만들어 사용.
static메서드 내에서는 this사용 불가. this는 인스턴스 자신을 가르키기때문.
static 메서드 내에서는 static만 접근 가능함. 
정적 영역이 아니면 객체화를 시켜야해서 . 객체화 시키지않고도 실행해야해서. main은 static임. 
인스턴스는 인스턴스화 없이는 접근이 안됨. 정적영역에서 인스턴스영역 접근 안됨. 
스태틱 변수 -> 초기화.
static멤버의 초기화는 static블록에서 할 수 있다. 
static {  //스테틱 변수 초기화 )
1.static 블록 실행. 2.생성자-> instance 만든다. 
공유 영역이다. 

디자인 패턴의 대표적인.. 
-단독
-타패턴
가장 많이 활용되는 패턴.. 싱글턴 디자인 패턴
이때 static을 활용한다. 전체 프로그램 상에서 동일한 인스턴스를 사용해야할 경우 활용.
절대 두개이상이면 안되는.. ex) 전체 프로그램이 내부적으로 같은 데이터를 유지해야한다면.
어떤 상황에서도 단 하나의 인스턴스만 유지. = 싱글패턴.
ex)스마트폰 주소록.. 여러 앱이 하나의 스마트폰 주소록 사용. 

패키지
서로 관련 있는 클래스 ,인터페이스 묶음 관리 위해서.
패키지 이용 장점: 클래스들 묶음단위 제공. 필요할 때 만 가져올수있음.클래스 이름 혼란 막고 이름충돌막음
사용법. import 패키지명.클래스명 -> import.java.applet.Applet -> Applet 클래스 가져와서 사용할수있다.
import 패키지명.io.* 모든 클래스 불러오겠다. 
패키지는 디렉토리 구조.. 페키지 위치시킬 디렉토리에 패키지의 계층구조, 동일한 디렉토리 구조 생성

접근 제한자 외부에서 접근 O, 없는 것을 구분하는 것이 바람직함. 
가급적 field는 private으로 . 우회경로인 게터와 세터 이용해서.. 
class , member등에 적용가능. 생략하면 default제한자. 

상속.
상속 or 확장 : 부모의 필드와 메서드를 자식이 물려받음.
클래스 사이 멤버 중복선언 불필요. 필드 , 메서드 재사용.. 클래스 간결 
부모가 잘 만들어져있어야.. 
**상속의 깊이가 깊어지면, 의심을 해야한다. -> 문제 찾기가 힘들다. ->깊은 상속 가급적 피하자**
다중 상속 지원 X (다중상속,, 두개 동시에 상속)
최상위 클래스는 java.lang.Object
extends 
상속과 생성자. 자식에 특별 지시가 없으면 부모의 기본 생성자가 선택됨. 
부모 기르는 키워드 super. 
child(){}아무것도 안써 있어도 안에서 부모 생성자 호출. 
부모클래스 생성자는 자식에서 반드시 호출 해주어야한다. 
부모의 필드내에서도 접근시에는 SUPER키워드 사용.

메서드 오버라이딩(덮어쓰기) 		/	 메서드 오버로딩 
부모와 자식 사이에서 발생하는 관계
같은 이름, 같은 매개변수로 재선언. 

어노테이션 컴파일러에게 @Overriding(부모로 가서 진짜 그게 있는지 감시,체크)

참조자료형이 부모일수도 자신일수도. 참조 자료형 설계도에 있는 내용만 수행. 


### Day 9 Note


-캐스팅
업캐스팅(promotion)
차 상속받아 버스, 트럭 만들었다. 버스도 차, 트럭도 차.
Bus b = new Bus()
참조의 설계도가 bus로 되어있음. 이건 자동차의 모든 기능을 물려받을수있고
버스 자체의 기능도 모두 이용가능. 

Car b = new Bus() 
Car t = new Truck() 

주차장
Bus[]park = new Bus[5] -> Car [] park = new Car[5]
명시적으로 타입변환 하지않아도 된다.

다운캐스팅 명시적으로 타입변환 해야함. 
책임은 개발자가.  
Car b = new Bus();
Car 설계도 내부 기능만 이용할수있다.
b . 안내방송기능() X
(Bus)b.안내방송 

instanceof 를 사용하면 어떤 클래스 객체화한것인지 알수있음.

다형성: 같은 타입이지만 실행결과가 다른 객체를 이용할수있는 성질
자식 -> 부모로의 타입ㅂ변환 허용함. 


public class Dog extends Animal{
	//
}

에러의 이유? 생성자의 문제.
만약 개발자가 생성자를 하나도 만들지 않았다면 
자바 컴파일러가 기본 생성자를 만들것이다. 
내부에서 부모의 기본 생성자를 호출한다. 저기에 부모의 기본 생성자가 없어서
에러나는 거임. 

public Dog() {
		
	}

super가 생략되어있어서 에러가 나는거임. 

애니멀을 상속받아 Dog 와 Cat을 만들었음.
Cat이 Dog를 캐스팅 할 수 없다. 



byte int long flaot double( 이


(추상 클래스, 인터페이스 유사함.)
-추상 클래스
OOP중 추상화가 핵심되는 컨셉. 추상화는 객체의 속성,기능 중 중요한것만
남기고 필요없는거 없애는것.
객체들 공통되는 특성 추출하는것 
new Animal() -> 무슨 동물이지? 모름. 추상화된 컨셉일 뿐이고
이걸 객체화 시킨다는건 사실상 불가능함. 
이런게 추상 클래스. 실제 클래스의 공통적인 특성 추출하여 선언.
실체 클래스 만들기 위한 부모클래스로만 사용 : 스스로 객체가 될 수 없음. 
자식에게 개념 등을 물려주기 위한 용도로만 사용. 
추상클래스가 되려면 하나 이상의 추상메서드를 가짐.
속성필드와 기능 메서드 정의 할 수 있음.
-추상 메서드
구현이 불가. 선언만함.
실제 자식 클래스는 추상 메서드를 반드시 구현 해주어야함.
추상메서드는 추상 클래스안에서만 존재할 수 있다.
실제 클래스 (concrete)클래스 안에 추상 메서드는 있을 수 없다. 

public abstract class 클래스명 {
--> new로 생성할 수 없음.
} 상속은 extends로. 
추상 클래스 상속하는 클래스는 반드시 추상클래스 안쪽 추상 메서드 만들어줘야함.
특정 기능의 구현을 강요하는 측면. 

ex) Car (추상)/정지기능 만들어주세요 선언/ -> Bus(실체)/정지기능 무조건 만들어줘야함/
실수 줄어든다. 
자식에게 특정 메서드를 강제. 

그림판 도형 : 위치, 면적,

      Shape
      x,y
      draw
Circle       Lectangle
x,y             x,y
draw           draw
(자식은 자기만의 그리기 구현)  

public class Circle extends Shape{
	
}

에러의 원인. 1.생성자의 문제, 2.추상 메서드 

Math.pow(radius, 2) 제곱 메서드 radius^2

-인터페이스 

사용자 접점. 사람 <-인터페이스->사람
관계가 없는 물체들이 상호작용을 위해 사용하는 장치나 시스템.
클래스 구조 상 직접적 관계없이 클래스들에 의해 구현될 수 있는 규약

if Point(점만 찍고싶은데.. Shape 억지로 상속 받는 상황 )
다른 방법? 
사용법인터페이스만 보고도 내부객체 안쪽의 기능을 사용할수있다.
상속 많을 수록 유지보수 힘들어서.. 인터페이스 위주로 .
깊은 상속 하지않아도 프로그램 깔끔정리가능

public interface 박정연 {} -> 실체화 X
public class Point implements 박정연{}

extends 부모 하나.
implements 여러개가능  

일반클래스만 객체화간 된다. 


### DAY 11 NOTE

-깊은복제
String,Stringbuffer
Arrays
Wrappers(기본타입을 객체타입으로 변환해주는)


얕은복제. objcet clone으로 얕은 복제

객체가 있다라고 했을 때 .Clone()하면 그대로 복제. x,y값까지 복제
얕은 복제는 단순히 필드값을 복사하는 방식으로 객체복제

배열(참조타입) 메모리 어딘가의 주소값을 담고있는거임.
배열.clone() 배열 담겨있던 값이 그대로 복제. 즉
객체는 복사 되었으나 참조타입은 복제가 안됨 
내부필드를 모두 복제하고 새로나온 참조 값을 가르키도록 하는게 깊은 복제.

얕은 복제: 주소만 복사. 내부필드를 공유하는 상황
깊은 복제: 참조하는 객체도 복사. 이걸하기위해 clone을 오버라이드.
clone() throws CloneNotSupportedException{} 
객체 안에 클론 메서드를 오버라이드 하고 
arrays.copyOf()
1.참조타입 필드 가진 객체 clone()
2.1문제 확인, 깊은 복제 해보기 (중요)

클론() 에서 참조타입 필드를 복제해주어야한다. -> override 

object의 클론 복제는 얕은 복제.
Object

 
-문자 = 기본 자료형 (char) 2byte 부호없는.
선언  char letter;
문자 할당 letter = 'A'
문자 사용 sysout(letter)

-String 클래스.
연속된 문자들을 저장하고 다루기 위한 클래스. H | E | L | L | O
캐릭터의 연속이다. length를 잡을 수 있다. 
개별 캐릭터의 접근이 가능하다.
특수문자의 표현 이용할 수 있다. 

\n개행 \t탭 \" \" \\


문자열 연산. char이 쭉 나열된 배열과 같은 형태로 저장되어있다.
+연산자는 문자열 연결. 문자열과 다른 타입 연결은 문자열로 변환되어 연결.
->문자열 연결 후 새로운 객체가 만들어 진 후 반환된다. 
연결할 때 마다 새 객체가 튀어나온다. -> 메모리 낭비다. 

charAt(position) 해당 위치 문자 반환
Substring(start,end) start부터 end까지 문자들 새 문자열로 반환
-> 마찬가지로 새 문자열이 튀어나옴.

toUpperCase() 대문자 변환
마찬가지로 새로 튀어나옴.
concat("??") -> +랑 같음. 

String 객체는 한번 생성하면 변경할 수 없고, 새로만들어진 객체로 참조만 바뀐다.
재할당시 새로운 String 클래스 객체가 생성된다.
복잡한 문자열 +로 연결하는건 적합한 방법 아님.

StringBuffer클래스. StringBuffer는ㄴ 그 안쪽에 문자열 담아둘 수 있는 버퍼.. 
값 추가, 삭제, 변경 가능
복잡한 문자여 ㄹ조합일때 StringBuffer가 더 적합.

왼 리턴타입. 

substring
indexof
tp:pwerCase
replase()
split 

유틸리티 클래스. 배열 다루기. 
배열 조작 기능 가진 API..
정렬 sort 검색 search 
자바 유틸리티. java.util안에.. 

자바가 내부적으로 객체로 받아들여서 기본 타입 받지 못할 때가 있다. 

기본 java : 기준 값. 
sort를 통과시키면 어떤 기준으로 정렬할지 자바가 알수 없음. 
sort의 컨셉은 안쪽에 담겨있는 객체 두개씩 꺼내서 선후관계 비교후 다시 넣기/ 
객체의 선후관계를 우리가 정해줘야함. (우ㅡ리가만든 객체니까.)
compareto에서 하나씩 빼서 비교, 다시 넣음. 

검색. 자료를 반으로 나눈다. 거기에 검색어를 대입. 
binary search? -> 기본적으로 데이터 중간을 찾아감. 그래서 바이너리 서치의 전제는.
내부 데이터가 미리 정렬되어잇어ㅑㅇ한다. 


### Day 12 Note

https://github.com/InventoryBox/InventoryBox_Android

좋아보임.. 이런식으로 프로젝트 하고싶음 참조하자

-Wrapper Class


primitive 타입(기본자료형. 더이상 쪼갤 수 없는 단순데이터)
: 비어있을 수 없음(null허용하지않음)


reference(객체)
:수치데이터임에도 null을 허용해야할 때가 있음. 
그래서 생긴게 Wrapper클래스: 기본 데이터형을 객체로 다루기위한 포장클래스
정수형 Wrapper, 실수형 Wrapper클래스 모두 부모로 Number부모클래스 가짐.

자바는 객체대상으로 처리를 많이해서 Wrapper가 존재함.
특정클래스는 객체만을 다뤄서 기본 데이터형 사용할수없음.
문자열을 기본타입으로 변환할때 (Static method -> new사용안하고도 사용할 수 있는 메소드)
utility method제공

Integer 
데이터
메소드 

deprecated ? : 기존버전에서 다른 방법으로 변경 되었는데 잠시놔두는..

타입간 변환 정수->실수, 문자열 -> 정수 (utility method)
문자열을 기본 데이터 값으로 변환 또는 그 반대

Integer.parseInt("-123") ; 문자열을 int로

ten,intValue(); ->언박싱

자동박싱, 자동 언박싱 

자바는 객체 주로 다루기 때문에 기본타입이 아닌 참조타입으로 요구하는 때가 많음.
객체 다루다보면 null이 있어야 할 경우가 있음.(기본타입 받지않는 상황0
그래서 wrapper사용함. 




-Utility class : Data, Dalendar : 편리한 기능을 모아놓음

-Generics -> 데이터 처리에 중요한 요소 ->나아가서 Collection


Collection Framework :중요~~

Date 날짜 시간.. 메서드들 많았는데
현재 생성자만 주로 사용. 날짜에 관련된 기능들은 calendar 클래스 허용.


Data Format
oooo년 oo월 oo일
언어마다 포맷이 다 다름.  해당 언어에맞는 포멧문자 확인하기 
yyyy-mm-dd HH:

import java.util.Date; Data사용 전 import해줘야함. 


Calender 클래스 
날짜와 시간정보 표현. 단 한개의 캘린더를 유지. 여러 객체 생성 X
Singleton 
getInstance()호출하면 캘린더 객체 얻을 수 이ㅣㅆ음. 

날짜 관련 연산 기능.

get(Calender.YEAR) 상수 부여 해주면 값 받을 수 있음.
set(Calender.MONTH,10) 월을 10으로 셋팅. 
Add(Calender.MONTH, 10 ) 현재 얻어온 날짜로 부터 10월 더해라. 


-Generic
클래스 내부에서 사용할 데이터 타입을 나중에 사용할 때 확정. 
다운캐스팅은 위험할 수 있음. 
인스턴스 생성할 때 바깥에서 데이터 타입 넘겨주는.. 클래스 안쪽 
private T[] pArray 

타입을 파라미터로 가지는 클래스와 인터페이스 <T>
 class 안에 들어가서 instance됨., 설계시에는 어떤 데이터 타입인지 결정하지않고 객체 생성시 결정
class GenericBox<T> E,R.... <>안이 하나일 필요 없음,
T content;
public T getContent(){
	return content;
}

Box<Integer> intBox = new Box<Integer>..

컬렉션: 다수의 데이터, 데이터 그룹을 의미
프래임워크: 라이브러리 코드의 집합. 절차를 만들어서 뼈대를 만들어뒀다.
컬렉션 프래임워크 : 컬렉션 저장 클래스를 표준화 
->순차형
->해쉬..집합 ㄱ-
Vector,ArrayList.. 

List 순서가 잇는 데이터의 집합 . O O O O O . 길이가 있음. index가 있음
Set 집합. 안쪽 데이터가 있다. 순서는 중요하지않음. 
Map 인덱스이용한 접근 X. Key. Value의 쌍이다.
Key와 Value의 쌍. 
순서는 유지 X. Key의 중복이 없다. 우편번호..지역번호 등 

배열          V s           리스트
                        느린접근. 배열처럼 자료들을 붙여서 담을 수 없음. 
                        참조자료 유형만 사용가능.(참조자료이니까 공간 어떻게 할지 모름.)
                        필요할 때 필요한 만큼 할당 

                        가변적 크기 


Vector() 안쪽에 어떤 데이터 담을 수 잇는 버퍼르 ㄹ만들어둔다. 
remove(객체) remove(인덱스)
size(크기) capacity(용량 : 버퍼의 크기 알 수 잇음.)

컬렉션 프래임워크는 primitive 타입 넣을 수 없음. collection 만.
vector의 결과는 항상 object 적절한 type으로 변환 후 사용. 
generics로 지정하징낳으면 여러타입ㅇ러 지정가능. 

size:0 , capacity: 10 
객체 갯수     버퍼 사이즈.
미리 버퍼 만들어놓는 ㅣ융? 메모리 할당, 해제작업이 CPU라던가 메모리를 많이 소요하는 작업.. 때문에 미리 

없는 객체의 인덱스 검색은 -1을 반환한다.

객체 삭제 

short integer long gloatr double 

첨에 부르면 enumeration이 맨 앞에.. 순서대로 데이터 뽑아낼 수 잇따. 
뒤에 몇개 더 남았는지 알수 없기때문에 while불러줘서.. 

### Day 13 Note

-Collection Framework

List(배열) 

Set(집합. 데이터 중복 허용 X)

Map(딕셔너리, 순서 중요 X, key의 중복 허용 X. 
집합 자료형. 키값,value값., )사전 찾을 때 index로 찾는 것처럼.. 

배열: 고정된 크기, 비효율적 메모리 점유 
List는 유동적, 가변적인 크기 , 참조자료 유형만 사용가능. 
primative 타입 쓰고 싶으면 Wrapper로 써줘야한다.

Linked List 
Linked List 생성하면 head 만 생김. 
List 인터페이스 (설계도)
index 통한 참조접근 불가. head로 부터 링크 따라가면서 접근 . 
인덱스 접근 할 수 있는 메서드가 있기는 함. 
객체 생성 , 링크 끊음. 다시 연결 
삽입, 삭제 (메모리 효율적으로 움직임)

List 
Vector LinkedList ArrayList모두 추상클래스 AbstractList상속받은 동적
자구. 

add(어디에,뭐를) set() get() remove() List 설계도 

ArrayList 배열과 비슷 중간 객체 삭제되면 뒤의 객체 당겨서
인덱스 재구성. LinkedList에 비해 효율 떨어짐. 

List l = new LinkedList()


Stack 
push(0
pop
peek
empty -> 안쪽에 데이터 있는지 비었는지 확인  


13일차 List, Stack 자료형 


Hash set 
hash알고리즘. 해시코드란 객체를 식별할 하나의 정수값. 
"car"->HASH -> 정수  //이걸로 찾음

     student class    -> new student  -> new student 
     name                박정연          박정연
     id                  1               1
hashcode가 메모리 주소 반환. 같은 이름가진 같은 학번임에도 hash set에 들어감.
이게 문제임/ 

동일한 객체를 동일한지 아닌지 어떻게 비교할 것인가?

1. object가 가진 hashcode비교. 
2. equals() 내부 값이 동일한지 비교. 
3. 그렇다면 두 객체는 동등 객체임. 

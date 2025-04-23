package com.kh.chap01.condition;
// 최종 목적은 condition이고 이것 안에 현재 class 파일이 담겨있음을 뜻함
// package는 클래스를 정리하는 폴더 개념

/* 구조해석
 * # 이 class 파일이 01.condition라는 패키지[폴더 구조]에 속해있다
 * com : 회사 도메인을 뒤집은 형태
 * kh : kh정보교육원
 * chap01 : 챕터1
 * condition : 조건문 관련내용이 담긴 패키지
 */
import java.util.Scanner;

// 최종 목적은 scanner이고 이것을 사용하기 위해 자바에 미리 만들어져있는 코드(class)를 가져오는 것
// Scanner는 사용자 입력을 받을 때 필요한 도구이고, 그게 java.util 패키지 안에 포함되있음
// + java 유틸 패키지는 자바에서 기본 제공하는 기성품 같은 존재이고, 개발자가 직접 만드는 패키지는 앱/프로그램 기능 구현에 쓰이는 공구와 같다


/* 구조 해석
 * # 자바의 유퀼리티 도구에서 스캐너를 불러오기
 * import : 다른 파일이나 패키지에 있는 기능을 불러올 수 있다
 * java.util : 자바가 제공하는 유퀼리티 기능을 모은 패키지
 * Scanner : 사용자 입력을 받을 수 있는 클래스
 * 
 * 
 * 
 */
 
public class A_If {
	// 최종 목적은 클래스를 선언하는 것
	// 클래스는 클래스 이름과 실행 클래스로 나뉜다
	// 클래스 이름은 클래스를 정의할 때 쓰인다. 실행이 목적이 아니라, 기능이나 데이터를 정의할 때 쓰인다
	// 실행 클래스는 (main 메서드가 있는) 실제로 프로그램을 실행할 때 시작점이 되는 클래스
	/* public : 공개된, 어디서든
	 * String? : 자바에서 문자열을 다루는 자료형
	 * ex)
	 * int = 숫자 ( 10, 64)
	 * double = 실수 ( 3.14)
	 * String = 문자 여러 개 ( "민수", "hello" )
	 */
	
	
	//public static void main (String[] args)
				
	// String[] = 문자열 배열 ( 글자 여러 개를 한번에 받기 위해)
	// static = 객체를 만들지 않아도 바로 실행 가능
	// args = 그 배열의 저장하는 변수이름 ( arguments 약자)
	// void = 리턴값이 없음, main은 아무것도 반환하지 않고 그냥 실행만 하고 끝난다
	// main = 자바에서 프로그램 실행할 때 가장 먼저 찾는 메서드 이름
	// (String[] args) = 명령줄 [ cmd, 터미널 ]에서 값을 넘기고 싶을 때
	// 글자들을 담을 수 있는 배열을 args라는 이름으로 받겠다라는 의미
	
	/*객체 (object) : 실제 존재하는 것을 자바 코드로 표현한 것
	 * 
	 * 강아지 
	 * 속성 [변수] = 이름,나이,품종
	 * 기능 [메서드] = 짖는다, 먹는다, 걷는다
	 */

	 Scanner sc = new Scanner(System.in);
	/* 최종 목적 : scanner라는 입력 도구를 만들어서 키보드(System.in)에서 입력을 받는다	
	 * sc : sc라는 이름의 스캐너를 만든다	  
	 * 
	 */
	

	
	 public void method1() {
     //
		 /* 단독 if문
		  * [표현법]
		  * if (조건식) : 조건식이 참일 때 실행할 코드 하나
		  * 
		  */
		 
		   System.out.print("정수 : ");
		   int num = sc.nextInt();
		   
		   if (num > 0) System.out.println("양수다");
		   
		   if (num < 0) System.out.println("양수가 아니다");
		   /* 접근제한자 : 어디서 쓸 수 있는지
		    * 반환 타입 : 결과로 돌려주는 데이터타입
		    * 메서드 이름 : 메서드 이름 (직접 짓기), 
		    * 매개 변수 : 메서드가 받을 값들
		    * return : 결과를 돌려줄 때 사용
		    *
		    */
		   
		    String name = sc.nextLine()" 본인 이름 : "];
		    // 참조자료형은 동등비교시 정상적으로 비교가 안된다.
		    if( name == "민경민") {
		        System.out.println("민경민 님 반갑습니다");
		        
		        
		    }   else {
		    	System.out.println("누구세요? ");
		    	// 문자열 동등 비교를 위한 메서드
		    	// 문자열 . equals ( 비교 문자열 )
		    	
		    	if(name.eqauls("민경민")) {
		    		
		    		
		    		
		       
		        }
		    }
		   
		   
		   
	 }	 
		 
}

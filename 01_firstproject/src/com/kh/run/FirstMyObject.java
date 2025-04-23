package com.kh.run; // package + class == 풀 클래스명

//날짜를 표시해주는 클래스
import java.util.Date;

// 중괄호는 하나의 영역이다.
public class FirstMyObject {
	
	// 자바는 실행하기 위해서 반드시 main 메서드가 존재해야 한다.
	public static void main(String[] args) {
		System.out.println("안녕");
		
		// 외부 클래스를 이용하여 현재 날짜를 출력
		System.out.println( new Date() );
		
	}
}

// ex_firstproject라는 프로젝트를 생성한 후
// com.ex.run패키지에 Test 만들고, 자신의 이름을 console 창에
// 출력해보세요. (실습 테스트)
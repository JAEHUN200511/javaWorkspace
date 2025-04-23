package com.kh.operator;

public class D_Compound {
	/*
	 * 복합 대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 *                산술연산자와 대입연산자를 사용하는 것보다 연산처리속도가
	 *                빨라지므로 사용하는걸 권장함.
	 * a = a + 3; 를 복합 대입 연산자로 변환 시에 a += 3;
	 * a = a - 3; 를 복합 대입 연산자로 변환 시에 a -= 3; 
	 * 이후 여러 가지가 있음
	 */
	
	public void method1() {
		int num = 12;
		
		// num의 값을 6배 증가
		num *= 6; // num = num * 6;
		
		// num의 값을 2배 감소
		num /= 2;
		
		// num을 4로 나누었을 때의 나머지를 num에 대입
		num %= 4;
		
		// 문자열도 +=연산자를 사용할 수 있다.
		String str = "Hello";
		
		//str = str+" World";
		str += " World";
	}
}

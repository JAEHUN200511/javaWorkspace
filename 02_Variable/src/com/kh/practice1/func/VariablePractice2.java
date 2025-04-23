package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int iNum1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int iNum2 = sc.nextInt();
		
		// int result = iNum1 + iNum2 로도 가능
		System.out.println("더하기 결과 : "+(iNum1+iNum2));
		System.out.println("빼기 결과 : "+(iNum1-iNum2));
		System.out.println("곱하기 결과 : "+(iNum1*iNum2));
		System.out.println("나누기 몫 결과 : "+(iNum1/iNum2));
		
	}
}

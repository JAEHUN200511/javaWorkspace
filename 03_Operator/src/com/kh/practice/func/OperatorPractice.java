package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+num2/num1);
		System.out.println("남은 사탕 개수 : "+num2%num1);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine(); //혹은 next
		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt(); //정수형
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt(); 
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt(); // 공백 기준으로 공백 앞의 값을 가져옴 
		// [\n]
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0); // 엔터 이전까지의 값을 모두 가져옴
		// a ? b : c
		String gender2 = 'M' == gender ? "남" : "여";
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double total = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s님 %s학생의 성적은 %.2f이다.",
				num1, num2, num3, name, gender2, total);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age1 = sc.nextInt();
		String age2 = 13 >= age1 ? "어린이" : (age1 >= 20 ? "성인" : "청소년");
		
		System.out.println(age2);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		String tf = (total >= 40 && avg >= 60) ? "합격" : "불합격";
		
		System.out.println(total);
		System.out.printf("%.1f\n",avg);
		System.out.println(tf);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력해 주세요(- 포함) : ");
		String num = sc.nextLine();
	    String tf = num.charAt(7) == '2' ? "남자" : "여자";
		
		System.out.println(tf);
	}
	
// 조건문 [ IF문과 SWITCH문 ]
	
    
	
	
	
		
		
		
		
		
		
		
	


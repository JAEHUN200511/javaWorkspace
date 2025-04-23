package project;

public class spec13 {

// 증가와 감소 연산자는 단항 연산자이다
/*
 * 연산자 앞이나 뒤에 사용하여 값을 1만큼 늘리거나 줄인다
 * 
 * 연산자는 ++, --로 항의 값에 1을 더하거나 1을 줄인다
 * 
 * val = ++num; // num 값이 1 증가한 이후에 val 변수에 대입
 * val = num++; // val 변수에 기존 num 값을 먼저 대입한 이후 num 값 1증가
 * 
 * val = --num; // num 값이 1 감소한 이후에 val 변수에 대입
 * val = num-- // num값이 val 변수에 대입된 이후 num 값 1 감소
 * 
 */
	
public static void main(String[] args) {
	
int gameScore = 150;

int lastScore1 = ++gameScore;
System.out.println(lastScore1);

int lastScore2 = --gameScore;
System.out.println(lastScore2);


//75p
	
}
	
	
	
}

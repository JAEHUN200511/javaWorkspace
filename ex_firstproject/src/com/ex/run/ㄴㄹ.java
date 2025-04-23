package com.ex.run;

public class ㄴㄹ {
	
public static void main(String[] args) {

int num = 5;
int i =10;
boolean value = ((num = num * 10) > 45) || ((i = i -5) < 10);
System.out.println(value);
System.out.println(num);
System.out.println(i); //false

// 결과 예상
// value = true
// num = 50
// i = 10
}
}

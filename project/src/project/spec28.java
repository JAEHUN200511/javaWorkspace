package project;

public class spec28 {

// switch - case문
// if-else if문의 else문 역할을 switch-case문의 default문이 맡음
	
public static void main(String[] args)
{
int ranking = 1;
char medalcolor;
// int형으로 1을 ranking에 저장함
// char 문자형으로 medalcolor를 지정[선언]


switch(ranking) {

case 1 : medalcolor = 'G';
break;

case 2 : medalcolor = 'S';
break;

case 3 : medalcolor = 'B';
break;

default : medalcolor = 'A';

}

System.out.println(ranking + "등 메달의 색깔은 " + medalcolor + " 입니다");


	
}
	
	
	
	
	
}

	
	


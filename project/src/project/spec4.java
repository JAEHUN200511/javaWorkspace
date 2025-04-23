package project;
// package [project]에 이 클래스가 포함되어 있다

public class spec4 
// spec4 라는 이름의 클래스를 만든다
{
public static void main(String[] args) {
  /* 프로그램이 시작되는 메서드이고, 아무것도 반환하지 않음, 외부에서 문자열 [argument]를 받아올 수 있다
  * 
  */
	
	
double dnum = 3.14;
// 실수 자료형이다
// double 형태로 저장되어 3.14를 dnum	 값에 대입한다

float fnum = 3.14F;
// 같은 실수 자료형이지만 정밀도가 낮다
// float 형태로 저장되어 3.14를 fnum 값에 대입한다
// F로 식별자를 두어 double형이 아닌 float형 값이 대입된다는 의미를 가진다
// 자바에서는 실수를 double형을 기본으로 지정 

System.out.println(dnum);
System.out.println(fnum);
// 앞에서 지정한 dnum과 fnum을 출력한다

}

	
	
}

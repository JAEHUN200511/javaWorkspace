
package project;

public class spec7 {

// java 10부터는 자료형을 쓰지 않고도 변수 사용 가능
// 이를 지역 변수 자료형 추론이라고 일컫는다
	
// 어떻게 자료형을 쓰지 않고 변수를 사용할 수 있는가?
	
/* num = int[정수형]
 * dnum = double[실수형]
 * fnum = float [실수형]
 * str = String [문자형]
 */

// var로 선언할 때, 주의해야할 점 
	
/* var로 자료형 없이 변수를 선언하는 방법은 '지역 변수'만 가능하다
 * 지역 변수는 프로그램 {} 내에서 사용할 수 있는 변수를 말한다
 * 
 */
	
public static void main (String [] name) {
	
var i = 10;
var s = 10.0;
var str = "hello";

System.out.println(i);
System.out.println(s);
System.out.println(str);

str = " test";
//str = 3;

	
	
	
	
	
}
	
	
	
	
	
	
	
}

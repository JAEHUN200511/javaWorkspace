package project;

public class spec15 {

// 논리 연산자는 두 명제가 모두 참이면 논리 곱은 참이고, 두 명제 중 하나만 참이면 논리 합은 참이다. 이러한 논리 연산을 구현한 것이다

// && == 두 항이 모두 참인 경우에만 결과 값이 참이다. 그렇지 않은 경우 거짓이다
// || == 두 항 중에 하나의 항만 참이면 결과 값이 참이다. 두 항이 모두 거짓이면 결과값은 거짓이다.
//  ! == 단항 연산자이다. 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꾼다. 

  public static void main(String[] args)
 {
  int num1 = 10;
  int i = 2;
  
  boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10);
  // num1 = num1[10] + 10 => 20인데 10보다 작냐는 조건이므로 거짓, 논리 곱에서는 선항 값이 거짓이라면 이 문장은 실행되지 않음
  System.out.println(value);
  System.out.println(num1);
  System.out.println(i); // 선항 값이 거짓이므로 실행되지 않아 i 값 그대로
  
  value = ((num1 = num1 + 10) > 10 )|| (( i = i + 2) < 10);
  System.out.println(value);
  // num1 = num1 [10] + 10 => 20이다. 10보다 크냐는 조건이므로 참, 논리 합에서 선항 값이 참이므로 [ 하나만 참이어도 모두 참 ]
  // 후항 값은 실행되지 않음
  System.out.println(num1);
  System.out.println(i); // 선항 값이 참이므로 실행되지 않아 i 값 그대로
  
  // 두 항을 모두 실행하지 않았을 때, 실행하지 않은 i 값처럼, 나머지 항이 실행되지 않은 것을 단락 회로 평가 [sce]라고 한다
  
 }
  
}
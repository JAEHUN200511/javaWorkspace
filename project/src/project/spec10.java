package project;

public class spec10 {

	
 // 명시적 형 변환
	
/* # 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우
 * 
 * byte형은 int형보다 크기가 작기 때문에 자료 손실이 발생할 수 있음
 * 프로그래머가 명시적으로 자료형을 써 주어야 하며 강제 형 변환이라고 한다
 * 
 * 다음처럼 byte형이 표현할 수 있는 범위를 넘는 경우
 * 
 * int inum = 1000;
 * byte bnum = (byte)inum;
 * 
 * 값 1000이 byte형 범위를 넘기 때문에 자료 손실이 발생해 다른 값으로 출력될 수 있다
 * 
 * 결과값
 * 
 * 1000
 * -24
 * 
 * # 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우
 * 
 * 실수 자료형에서 정수 자료형으로 값이 대입되는 경우에도 형 변환을 명시적으로 해주어야 한다
 * ex) byte bnum = (byte)inum; 처럼 따로 명시를 해줘야한다
 * 
 * double dnum = 3.14;
 * int inum2 = (int)dnum;
 * 
 * 이 경우에는 실수에서 소수점 이하 부분이 생략되고 정수 부분만 대입된다
 * 
 * # 연산 중 형 변환을 하는 경우
 * 
 */
	
public static void main(String[] args)
{
	   double dnum1 = 1.2;
	   float fnum2 = 0.9F;
	   
	   int inum3 = (int)dnum1 + (int)fnum2;
	   // 두 실수가 각각 정수형으로 형 변환되어 더해짐
	   int inum4 = (int)(dnum1 + fnum2);
	   // 두 실수의 합이 먼저 계산되고 형 변환됨
	   
	   System.out.println(inum3);
	   System.out.println(inum4);
	   
	   
	   
}
	
	
	
}

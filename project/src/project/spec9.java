package project;

public class spec9 {
	
/* 정수와 실수는 내부에서 표현되는 방식이 다름
 * 그렇기 때문에 하나의 자료형을 통일한 후에 연산을 해야함
 * 이때 형 변환이 이루어짐
 * 
 * int n = 0;
 * double dnum = n;
 * 
 * 형 변환이란 각 변수의 자료형이 다를 때 자료형을 같게 바꾸는 것을 말한다
 * 
 * 묵시적 형 변환[자동]과 명시적 형 변환[강제]로 구별한다
 * long형이 8바이트이고 float형이 4바이트인데 자동 형변환이 되는 이유는 실수가 정수보다 표현범위가 넓고 정밀하기 때문이다
 * 
 * 
 * # 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우
 * >> 자료 손실 없이 모두 큰 값에 저장된다
 * 
 * byte bnum = 10;
 * int inum = bnum; //byte형 변수 bnum 값을 int형 변수 inum에 대입함
 * 
 * # 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우
 * >> 두 변수의 크기가 같은 4바이트라도 float형인 fnum이 더 정밀하게 데이터를 표현할 수 있기 때문에 fnum으로 변환된다
 * 
 * int inum = 20;
 * float fnum = inum2;
 * 
 * # 연산 중에 자동 변환되는 경우
 * dnum = fnum + inum에서 두 번의 형 변환이 일어난다
 * 
 * fnum + inum 연산에서 int형이 float형으로 변환된다
 * 두 변수를 더한 값이 dnum으로 대입되면서 double형으로 변환된다
 * 
 * 덜 정밀한 수에서 더 정밀한 수로 변환되는 경우 이중으로 자동 형 변환이 일어난다 [ 연산 중에 ]
 * 
 * int inum = 20;
 * float fnum = inum;
 * double dnum;
 * dnum = fnum + inum;
 */

   public static void main(String[] args)
   {
	      byte bnum = 10;
	      // byte 형으로 bnum을 10이라고 지정
          int inum = bnum;
          // int 형 변수로 대입, 묵시적 형 변환되었음
          System.out.println(bnum);
          System.out.println(inum);
          
          
          int inum2 = 20;
          // int형으로 inum2를 20이라고 지정
          float fnum = inum2;
          // float형 변수로 int형 값이 대입, 묵시적 형 변환되었음
          System.out.println(inum2);
          System.out.println(fnum);
          
          double dnum;
          // double형으로 dnum을 선언하였음
          dnum = fnum + inum;
          // fnum과 inum을 연산 중에 int형이 float형으로 변환되며 연산되었음
          // float형이 int형보다 정밀하고 넓기 때문에 float형으로 변환되었음
          
          // 결과 값이 dnum에 대입되면서 double형으로 변환됨 
          System.out.println(dnum);
     
	 
   }


}

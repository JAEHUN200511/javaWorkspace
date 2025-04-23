package project;

public class spec37 {
	
// 분기문 }
	
   //반복문에서는 break문이 자신과 가장 가까운 반복문을 빠져나감
   //즉, 아래 코드를 실행 안하고 넘어감	
	
//continue : 반복문 내에서만 사용 가능하고 실행할 시 continue 아래 부분은 실행하지 않고 다시 실행

public static void main(String [] args)
{
	   int total = 0; // total값 초기화
	   int num; // num 선언
	   
	   
	   for( num = 1; num <= 100; num++)
	   // for문으로 num 값을 1로 지정하고, num 값이 100까지 더할 때 [ num++ ]
	   {
	   if ( num % 2 == 0)
	   // if문으로 num 값을 2로 나눴을 때 나머지가 0이므로 짝수, 이때 continue문을 통해서 처음으로 돌아가 증감식 수행 
	   continue; // continue는 위에 if문이 참일 때, 이후  수행을 생략하고 for문의 증감식으로 돌아가 num에 1을 더함 [23행]
	   
	   total += num;   
		   
	   }
	   System.out.println(" 1부터 100까지의 홀수의 합은 " + total + " 입니다");	
}
}
	
	
	
	
	
	
	
	
	
	
}







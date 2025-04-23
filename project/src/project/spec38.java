package project;

import java.util.Scanner;

public class spec38 {
	
 /*  break : 코드 실행 중에 break문을 만나게 되면 현재 속해있는 가장 가까운 반복문을 빠져나가는 구문.
*/
   
    		

public static void main(String [] argu)
{
	// 1부터 100까지 총 합계를구함.
	// 단, 6의 배수값을 뺴고 더하기
	
	int sum = 0;
	for(int i = 1; i <= 100; i++ ) {
		if( i % 6 == 0 ) continue;
		sum += i;
	}

	  	System.out.println("총 합계 :" + sum );
	
	
	
}
}

//배열


		
		
		
		

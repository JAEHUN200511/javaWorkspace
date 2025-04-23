package project;

public class spec32 {

// while문 , do-while문, for문, continue문, break문

   //while문
   /* 조건식이 참인 동안 수행문을 반복해서 수행
    * 
    * 
    */
	   
	public static void main(String[] args)
	{
		
	int num = 1;
	int sum = 0; 
	
	while (num <= 50)
	// num값이 50보다 작거나 같을 동안
	{
		sum += num;
		num++;
		
		
	
	}
		System.out.println("1부터 50까지의 합은 " + sum + " 입니다");
		
	   
   }

}

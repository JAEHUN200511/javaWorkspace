package project;

public class spec20 {
	
/*  if-else if-else문에서는 하나의 조건을 만족하면 이후의 조건은 비교하지 않는다
 * 
 */
	
	
	
	public static void main(String[] args) {
		
	int age = 9;
	int charge;
	
	if (age > 8) {
		
	charge = 1000;
	System.out.println("미취학 아동입니다");	
		
	}
		
	if (age > 14) {
		
	charge = 2000;
	System.out.println("초등학생입니다");
	
		
	}
		
	if (age > 19) {
		
	charge = 3000;
	System.out.println("성인입니다");
	}
	
	else {
		
	charge = 500;
	System.out.println("1일 이용권입니다");
	
	
	
	}	
	System.out.println("입장료는"+ charge + "원입니다");
	
		
	}
			
	
		
		
		
		
		
		
		
		
	}
	



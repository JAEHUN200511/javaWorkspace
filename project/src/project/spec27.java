package project;

public class spec27 {
	
/*  A = 90~100
 *  B = 80~89
 *  C = 70~79
 *  D = 60~69
 *  F = else
 *  
 *  
 */
	
	public static void main(String[] args)
	{
		
	int score = 73;
	char grade;
	
	if (score >= 90 && score <= 100) {
		
    grade = 'A';	
	System.out.println('A');
		
	}
	
	if (score >= 80 && score <= 89) {
		
	grade = 'B';
	System.out.println('B');
	
	
	
	}
	
	System.out.println("등급은" + grade + "입니다");
	
	
	//error
	
}
}
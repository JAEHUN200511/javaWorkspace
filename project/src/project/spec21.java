package project;

public class spec21 {
	
//if-else if문과 if-if문의 차이

public static void main(String[] args)

{
	
int age = 14;
int charge;

if ( age > 8){
	
 	charge = 1000;
 	System.out.println("미취학 아동입니다");
}
if ( age > 15){
	
	
	charge = 2000;
	System.out.println("중고등학생입니다");
}
if (age > 20){
	
	
	charge = 3000;
	System.out.println("성인입니다");
}

else {
	
	charge = 8000;
	System.out.println("해당 없습니다");
	
	
	
	
	
}
	
	System.out.println("입장료는" + charge + "원입니다");
	
	
	
	
}
	

	

}


package project;

public class spec26 {
	
public static void main(String [] args) {
	
int age = 9;
int charge;

if (age < 8) {
	
charge = 1000;
System.out.println("미취학 아동입니다");
	
	
}

else if(age < 14) {

charge = 2000;
System.out.println("초등학생입니다");
	
	
}

else if(age < 20) {
	
charge = 2500;
System.out.println("중고등학생입니다");
	
}
	
else {
	
charge = 3000;
	System.out.println("일반인입니다");
}
	

	
	System.out.println("입장료는 " + charge + " 원입니다");
	



}
}

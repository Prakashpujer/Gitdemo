package Defaultpackage;
//How do you swap two numbers without using a third variable in Java?
public class Swapnumbers {

	public static void main(String[] args) {

		int a=24;
		int b=48;
		int c=0;
	System.out.println("a is "+a+" and b is " +b);	
		a=a+b;//72
		b=a-b;//24
		a=a-b; //48
		
		System.out.println("a is "+a+" and b is " +b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("a is "+a+" and b is " +b);
		
				
		
		
		
		
	


	}

}

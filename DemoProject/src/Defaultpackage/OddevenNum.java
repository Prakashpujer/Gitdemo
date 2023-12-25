package Defaultpackage;
// To check the entered number is odd or even number
import java.util.Scanner;

public class OddevenNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number :  ");
		 int number =sc.nextInt();
		 
		 if (number % 2==0)
		 {
			 System.out.println(" The entered number is even number");
			 
		 }

		 else 
		 {
			 System.out.println("The entered number is Odd");
		 }
	}

}

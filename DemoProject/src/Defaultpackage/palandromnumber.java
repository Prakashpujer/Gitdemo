package Defaultpackage;

import java.util.Scanner;

public class palandromnumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		 int number=new Scanner(System.in).nextInt();
		 
		 if (ispalandrom(number)) 
		 {
			 System.out.println("The entered number is palandrom number");
		 }
		 else 
		 {
			 System.out.println("The entered number is NOT Palandrom number");
		 }

	}

	private static boolean ispalandrom(int number) {
		
		int temp=number;	
		int reverse =0;
		while(number>0)
		{
			int reminder =number%10;
			reverse=reverse*10+reminder;
					number=number/10;
		}
		
		if (temp==reverse) {
			return true;
			
		}
		return false;
	}

}

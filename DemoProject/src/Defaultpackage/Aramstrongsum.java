package Defaultpackage;

import java.util.Scanner;

public class Aramstrongsum {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to check aramstrong ");
		
		int number=new Scanner(System.in).nextInt();
		
		if (checkAramstrong(number))
		{
			System.out.println("The Entered number is aramstrong number");
		}
		else
		{
			System.out.println("The Entered numberc not aramstrong number");
		}
	}

	private static boolean checkAramstrong(int number) {
		
		int sumofCube=0;
		int temp =number;
		while (number>0) {
			
			int a=number%10;
			number=number/10;
			sumofCube=sumofCube +(a*a*a);
			
		}
		
		if (temp==sumofCube) {
			return true;			
		}
		return false;
	}

}

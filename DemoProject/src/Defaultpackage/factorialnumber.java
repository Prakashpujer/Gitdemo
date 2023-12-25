package Defaultpackage;

import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number:  ");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		if (number<0)
		{
			System.out.println("Error ! Please enter the positive number:  ");
		}
		
		System.out.println("The factorial of "+number+" is :" +calcfactorialnum(number));
		}

	private static int calcfactorialnum(int number) {
		
		int factorial=1;
		
		while(number!=0)
		{
			factorial=factorial*number;
			number--;
			
		}
		
		
		return factorial;
	}

	
}

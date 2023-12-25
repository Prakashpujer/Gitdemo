package Defaultpackage;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		
		System.out.println("Enter the number :  ");
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		
		if (number>1 && checkprime(number))
		{
			System.out.println("The entered number is prime number");
		}
		else {
			System.out.println("The entered number is not prime number");
		}
	}

	private static boolean checkprime(int number) {
		
		boolean isprime =true;
		for (int i=2;i<=(number/2);i++)
		{
			if (number%i==0)
			{
				isprime=false;
				break;
			}
		}
		
		
		return isprime;
	}

}

package Defaultpackage;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// https://javacodepoint.com/logical-programs/list-of-basic-logical-programs-in-java/
		
		System.out.println("Enter number up to which Fibonacci series to print: ");
		int num1=0;
		int num2=1;
		int upto;
		Scanner sc=new Scanner(System.in);
		upto =sc.nextInt();
		System.out.print(num1+" "+num2);
		for (int i=3;i<=upto;i++)
		{
			int nextnum = num1+num2;
			System.out.print(" "+ nextnum);
			num1=num2;
			num2=nextnum;
			
		}
		
	}

}

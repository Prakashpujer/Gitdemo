package Defaultpackage;

import java.util.Scanner;

//Java Program to find Average of Two Numbers

public class AvarageCal {

	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		int sum=a+b;
		float avg =sum/2;
		
		System.out.println("Sum of two numbers is "+ sum);
		System.out.println("Avarage of two numbers is "+ avg);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum1=x+y;
		float avg1=sum1/2;
		System.out.println("Sum of two numbers is "+ sum1);
		System.out.println("Avarage of two numbers is "+ avg1);
		
		
		
		
		
		

	}

}

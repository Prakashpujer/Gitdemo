package Defaultpackage;

import java.util.Scanner;

public class SimpleIntCal {

	public static void main(String[] args) {
		
		double principal,rate,time,si,amount;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principal amount::  ");
		principal=sc.nextDouble();
		
		System.out.println("Enter rate of interest::  ");
		rate=sc.nextDouble();
		
		System.out.println("Enter time period ::  ");
		time=sc.nextDouble();
		
		si=(principal*rate*time)/100;
		amount =si+principal;
		
		
		System.out.println("The Simple interest is: "+si);
		System.out.println("The total amount to pay is : "+ amount);		
		
		
	}

}

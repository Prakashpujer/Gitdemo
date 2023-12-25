package Defaultpackage;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		double principal,rate,years,ci,cash ;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Principal amount: ");
		principal=sc.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		rate=sc.nextDouble();
		
		System.out.println("Enter number of years: ");
		years=sc.nextDouble();
		
		
		ci=(principal* Math.pow((1+(rate/100)),years))-principal;
		
		cash=ci+principal;
		System.out.println("The Simple interest is: "+ci);
		System.out.println("The total amount to pay is : "+ cash);
		
		

	}

}

//Compound Interest (CI) = (P * (1 + r/100)^ n ) – P


//P is the principal amount
//r is the rate of interest per annum
//n is the number of years the money is invested

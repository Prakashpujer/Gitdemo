package Defaultpackage;

import java.util.Scanner;

public class areaoftringle {

	public static void main(String[] args) {
		
		//area of triangle=1/2*length*breadth 
		
		double length,breadth, area, temp;
		
		System.out.println("Enter the lenght and breadth of the Triangle: ");
		
		Scanner sc =new Scanner(System.in);
		
		length=sc.nextDouble();		
		breadth=sc.nextDouble();
		temp=length*breadth;
		
		
		area=(0.5)*temp;
		
		System.out.println("Area of the triangel is : "+ area);
				
		
	}

}

package Defaultpackage;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		
		int length, breadth, area;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and breadth : ");
		
		length=sc.nextInt();
		breadth=sc.nextInt();
		
		area=length*breadth;
		
		System.out.println("The area of the rectangele is : "+ area);
	}

}

package Defaultpackage;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		
		double area ;
		double side;
		System.out.println("Enter the one side length of the Square:  ");
				
		Scanner sc=new Scanner(System.in);
		
		
		
		side =sc.nextDouble();
		area =side * side;
		
		System.out.println("area of square is "+ area);
		
				



	}

}

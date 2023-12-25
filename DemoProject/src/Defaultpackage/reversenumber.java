package Defaultpackage;

import java.io.InputStream;
import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to be reversed:  ");
		int number=new Scanner(System.in).nextInt();		
		int reverse =0;	
		
		while(number>0) 
		{
			int reminder =number%10;
			reverse=reverse*10+reminder;
			number=number/10;
			
			
		}
		System.out.println("Reverse of given number is =" + reverse);
	}
}

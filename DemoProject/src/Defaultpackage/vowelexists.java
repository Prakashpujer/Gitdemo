package Defaultpackage;

import java.util.Scanner;

//Write a Java program to check if a vowel is present in a string.

public class vowelexists {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if (!Character.isAlphabetic(ch)) {			
			System.out.println(" Error! Non-alphabetic character. ");
			
		}
		else if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			System.out.println("The given character is vowel.");
		}
		else {
			System.out.println("The given character is consonant.");
			
		}
	}

}

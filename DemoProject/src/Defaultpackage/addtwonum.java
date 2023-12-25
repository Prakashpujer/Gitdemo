package Defaultpackage;

import java.util.Scanner;

public class addtwonum {

	public static void main(String[] args) {
		
		int x=2;
		int y=4;
		int sum=x+y;
		int sub=y-x;
		int mul=x*y;
		int div=y/x;
		
		System.out.println("Sum of two number is "+ sum);
		System.out.println("Substraction of two number is "+ sub);
		System.out.println("Multification of two number is "+ mul);
		System.out.println("Division of two number is "+ div);
		
		int a,b,sum1,sub1,mul1,div1;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum1=a+b;
		sub1=a-b;
		mul1=a*b;
		div1=a/b;
		
		System.out.println("Sum of two number is "+ sum1);
		System.out.println("Substraction of two number is "+ sub1);
		System.out.println("Multification of two number is "+ mul1);
		System.out.println("Division of two number is "+ div1);
		
		

	}

}

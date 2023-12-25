package Defaultpackage;

import java.util.Arrays;

public class Arraymerge {

	public static void main(String[] args) {
		
		int a[]= {1,4,5,6,7,9,3,8};
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		int a1=a.length;
		int b1=b.length;
		int c=a1+b1;
		System.out.println(c);
		
		int [] m=new int[c];
		int pos=0;
		
		for (int element :a)
		{
			m[pos]=element;
			pos++;
		}
		for (int element :b)
		{
			m[pos]=element;
			pos++;
		}
		
		System.out.println(Arrays.toString(m));
	
	}

}

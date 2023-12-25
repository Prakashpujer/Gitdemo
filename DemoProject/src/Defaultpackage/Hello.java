package Defaultpackage;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		int a[]= {1,4,5,6,7,9,3,8};
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		int a1=a.length;
		int b1=b.length;
	 
		int length =a1+b1;
		System.out.println(length);
		
		int[] m= new int[length];
		int pos =0;
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
		String merged  =Arrays.toString(m);
				
		
		System.out.println(merged);
		System.out.println("*****************************************");
		
		System.out.println("Printing array in assending oder");
		int temp=0;
		
		for (int i=0;i<m.length;i++)
		{
			for (int j=i+1;j<m.length;j++)
			{
				if (m[i]>m[j])
				{
					temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		
		System.out.println("Merged assending array");
		System.out.println(Arrays.toString(m));	
		
				

	}

}

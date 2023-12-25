package Defaultpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Charactercount {

	public static void main(String[] args) {
		
		String str =null;
		
		System.out.println("Enter the string whose character count needs to be calculated: ");
		
		Map <Character,Integer>map= new HashMap<>();
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		str=str.toLowerCase();
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if (map.containsKey(ch)) {
				
				int count =map.get(ch);
				map.put(ch, count+1);				
			}
			else {
				
				map.put(ch,1);
			}
		}
		
		
		Iterator<Character>it=map.keySet().iterator();
		while(it.hasNext());
		{
			char ch=it.next();
			int count=map.get(ch);
			System.out.println(ch+"==>" + count);
		}
		
			

	}

}

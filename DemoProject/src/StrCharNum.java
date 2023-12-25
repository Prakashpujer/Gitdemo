import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StrCharNum {

	public static void main(String[] args) {
		
		String str = "Null";
		Map<Character,Integer> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the string whose character count needs to be find:  ");
		
		str=sc.next();
		str=str.toLowerCase();
		
		for (int i=0;i<str.length();i++)			
		{
			 char ch =str.charAt(i);
			if (map.containsKey(ch))
			{
				 int count =map.get(ch);
				map.put(ch, count+1);
			}
			else 
			{
				map.put(ch, 1);
			}
		
			
		}	
			
			java.util.Iterator<Character> it =map.keySet().iterator();
			
			while(it.hasNext())
			{
				char ch=it.next();
				 int count = map.get(ch);
				 
				 System.out.println(ch+ "=>" +count);
			
			}			
		
		
		
		
		
		}
		
	
	
	}
	
	
	
	



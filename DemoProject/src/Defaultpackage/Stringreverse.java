package Defaultpackage;

//How do you reverse a string in Java?

public class Stringreverse {
	
	
	public static String reverse(String in)
	
	{
		
		if (in==null)
			throw new IllegalArgumentException("Null is not valid Input");
		
		StringBuilder out=new StringBuilder();
		char[] chars=in.toCharArray();
		for (int i=chars.length-1;i>=0;i--)
		{
			out.append(chars[i]);
			return out.toString();
			
		}
		return in;
		
		
		
	}

	public static void main(String[] args) {
		// How do you reverse a string in Java?
		
		String str="123";
		System.out.println(reverse(str));
		String temp ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			temp= temp+ str.charAt(i);
		}
		
		System.out.println(temp);
	}

	
	
	
}

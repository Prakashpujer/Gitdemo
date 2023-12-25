package Defaultpackage;

public class vowelcheck {
	
	public static void main(String[] args) {
		
		System.out.println(vowelcheck("Hello"));
		System.out.println(vowelcheck("tv"));
		System.out.println(vowelcheck("Pr"));
		
		
		
	}
	
	public static boolean vowelcheck(String input)
	{
		return input.toLowerCase().matches("[aeiou]");
		
	}

}

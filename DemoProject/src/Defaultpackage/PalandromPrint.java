package Defaultpackage;

public class PalandromPrint {

	public static void main(String[] args) {
		
		String s= "MADAM";
		String t= "";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			t=t+ s.charAt(i);			
		}

		System.out.println(t);
		
		if (s.equals(t))
		{
			System.out.println("The word MADAM is palandrom");
		}
		else 
		{
			System.out.println("MADAM word is not palandrom");
		}

	}

}

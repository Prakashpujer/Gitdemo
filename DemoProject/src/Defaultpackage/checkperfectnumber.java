package Defaultpackage;

public class checkperfectnumber {

	public static void main(String[] args) {
		
		for (int i=1;i<=10000;i++)
		{
			if (isperfectnumber(i)) {
				
				System.out.println(i+ "  is a perfect number");
			}
		}

	}

	private static boolean isperfectnumber(int number) {
		
		int sum=1;
		for (int i=2;i*i<=number;i++)
			if (number%i==0)
			{
				if(i*i!=number)
				{
					sum=sum+i+number/i;
				}
				else {
					sum=sum+i;
				}
				
				if(sum==number&& number !=1) {
					
					return true;
					
				}
			
			}
				
			
	return false;
	}

	
}

package Defaultpackage;

public class Squarenumber {

	public static void main(String[] args) {
		int limit=10;
		printsquarnum(limit);

	}

	private static void printsquarnum(int limit) {
		
		for (int i=0;i<limit;i++)
		{
			int squre =i*i;
			System.out.print(squre +" ");
		}
		System.out.println();
	}

}

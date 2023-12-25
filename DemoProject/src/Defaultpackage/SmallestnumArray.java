package Defaultpackage;

public class SmallestnumArray {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 8, -5, 8, 0, 12, 1 };
		int temp=0;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
				
			}
		}
		
		int smallestarray =arr[0];
		System.out.print("The Smallest number in the above array is "+ smallestarray);
		
	}

}

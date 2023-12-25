package Defaultpackage;

public class SortanArray {

	public static void main(String[] args) {
		
		int [] arr= {5, 5, 10, 15, 16, 16, 20, 20, 25};
	
		
		int length= removeduplicate(arr);
		
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		

	}

	private static int removeduplicate(int[] arr) {
		
		 int n=arr.length;
		 
		 if (n==0||n==1) {
			 
			 return n;
		 }
		
		int index =0;
		for (int i=0;i<n-1;i++)
		{
			if (arr[i]!=arr[i+1])
			{
				arr[index++]=arr[i];
			}
		}
		 return index;
	}

}

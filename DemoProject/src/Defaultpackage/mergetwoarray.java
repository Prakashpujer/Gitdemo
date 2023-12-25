package Defaultpackage;

public class mergetwoarray {

	public static void main(String[] args) {
		
	int	arr1[] = { 1, 2, 5, 6, 8 };
	int	arr2[] = { 5, 7, 10, 12, 20, 25 };
	
	int[] arr3=new int[arr1.length+arr2.length];
	
	int count =0;	
	 for (int i=0;i<arr1.length;i++)
	 {
		 arr3[count++]=arr1[i];
		 
	 }
	 
	 for (int i=0;i<arr2.length;i++)
	 {
		 arr3[count++]=arr2[i];
		 
	 }
	
	 System.out.println("Merged array :");
	 for (int i=0;i<count;i++)
	 {
		 System.out.print(arr3[i]+ " ");
	 }
	 
	 System.out.println("***************************************");
	 
	}
	

}

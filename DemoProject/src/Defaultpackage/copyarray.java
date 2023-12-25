package Defaultpackage;

public class copyarray {

	public static void main(String[] args) {
		
		int [] arr1= {2, 4, 3, 8, 10, 0, 7, 15 };
		
		int [] arr2 =new  int [arr1.length];
		for (int i=0;i<arr2.length;i++)
		{
			arr2[i]=arr1[i];
		}

		System.out.println("Coppied array elements ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
	}

}

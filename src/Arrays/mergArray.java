package Arrays;

import java.util.Arrays;

public class mergArray 
{
	public static void merge(int arr1[],int arr2[])
	{
		
		int len1=arr1.length;
		int len2=arr2.length;
		int []c=new int[len1+len2];
		int ci=0;
		for(int i=0;i<arr1.length;i++)
		{
			c[ci]=arr1[i];
			ci++;
		}
		for (int j = 0; j < arr2.length; j++) 
		{
			c[ci]=arr2[j];
			ci++;
		}
		System.out.println(Arrays.toString(c));		
	}
	public static void main(String[] args) 
	{
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8,4,45,65,6,53,22,3};
		merge(arr1, arr2);
	}
}

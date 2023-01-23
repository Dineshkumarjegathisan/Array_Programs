package Arrays;

public class MinArray 
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		min(a);
		
	}
	//design a method to find max element
	public static void min(int [] a)
	{
		int min =Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]< min)
			{
				min=a[i];
			}
		}
		System.out.println("Max of array is :"+ min);
		
	}

}

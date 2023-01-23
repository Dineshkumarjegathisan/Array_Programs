package Arrays;

public class MaxElement
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		max(a);
		
	}
	//design a method to find max element
	public static void max(int [] a)
	{
		int max =Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max of array is :"+max);
		
	}

}

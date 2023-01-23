package Arrays;

public class SecondMax 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,5,6,7,8,9};
		secmax(arr);

	}
	public static void secmax(int []arr)
	{
		//int max =Integer.MIN_VALUE;
		//int smax=Integer.MIN_VALUE;
		int max=0;
		int smax=0;
		for(int i=0;i<arr.length;i++)//take i starts from 0 and i leesthen array length 
		{
			if(arr[i]>max)
			{
				smax=max;
				
				max=arr[i];		
			}
			else if(arr[i]!=max && arr[i]>max)
			{
				smax=arr[i];
			}
		}
		System.out.println("Max of array :"+ " "+max+" "+"and "+" "+"secondmax of Array :"+smax);
	}
}

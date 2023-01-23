package Arrays;

public class Secondmin {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,6,7,8,9};
		secmin(arr);

	}
	public static void secmin(int []arr)
	{
		int min =Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
//		int min=0;
//		int smin=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				smin=min;
				min=arr[i];		
			}
			else if(arr[i]!=min && arr[i]<smin)
			{
				smin=arr[i];
			}
		}
		System.out.println("Max of array :"+ " "+ min+"secondmax of Array :"+smin);
	}  
}

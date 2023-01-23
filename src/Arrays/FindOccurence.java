package Arrays;
//occurrence of number 
public class FindOccurence
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,8,9,8};
		occuren(arr, 8);		
	}
	public static void occuren(int arr[],int occ)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==occ)
			{
				count ++;
			}
		}
		System.out.println(occ+" "+"is present int "+count+" "+"Times");
	}

}

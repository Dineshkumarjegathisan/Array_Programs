package Arrays;

public class PrintDuplicate 
{
	public static void isDupli(int arr[]) 
	{
		boolean visited[]=new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(visited[i]==false &&arr[i]==arr[j])
				{
//					System.out.println("The Duplicates Arrays are :"+arr[j]);     
					visited[j]=true;		
					System.out.println(arr[j]);
				}		
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,1,2,5,6,6,8,9,9};
		isDupli(arr);

	}

}

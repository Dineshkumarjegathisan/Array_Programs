package Arrays;

public class SumOfArray
{
	public static void matrix(int [][]arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			//int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+=arr[i][j];
				//System.out.println("Sum of Array :"+sum);
			
			}
			//System.out.println("Sum of Array :"+sum);
		}	
		System.out.println("Sum of Array :"+sum);
	}

	public static void main(String[] args)
	{
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		matrix(arr);

	}

}

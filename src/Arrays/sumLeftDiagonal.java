package Arrays;

public class sumLeftDiagonal {

	public static void sumofLeftdio(int arr [][])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i][i];
		}
		System.out.println("Sum of Left Diagonal is :"+sum);
	}

	public static void main(String[] args) 
	{
		
		int arr[][]= {{1,2,3,},{4,5,6},{7,8,9}};
		sumofLeftdio(arr);

	}

}

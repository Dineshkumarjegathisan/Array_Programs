package Arrays;

public class ClocwiseRotation 
{
	public static void rotateMatrix(int arr[][])
	{
		int temp[][]=new int [arr.length][arr[0].length];
		for (int i = 0; i < temp.length; i++) 
		{
			for (int j = 0,k=temp[i].length-1; j < temp[i].length; j++,k--) 
			{
				temp[i][j]=arr[k][i];
			}
		}
		matrix(temp);
	}
	public static void matrix(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args)
	{
		int arr[][] = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
				  };
		rotateMatrix(arr);
	}
}

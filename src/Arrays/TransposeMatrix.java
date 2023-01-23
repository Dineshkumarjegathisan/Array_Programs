package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix
{

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter rows");
		
		int row=sc1.nextInt();
		
		System.out.println("Enter colms");
		
		int col=sc1.nextInt();
		
		int matrix[][]=new int[row][col];
		int transpose[][]=new int[col][row];
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				matrix[i][j]=sc1.nextInt();		
			}
		}
		System.out.println("This orginal Matrix");
		for (int i = 0; i < col; i++) 
		{
			for (int j = 0; j < row; j++)
			{
				System.out.print(matrix[i][j]+" ");	
			}
			System.out.println();	
		}
		System.out.println("This Transpose Matrix");
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j <col; j++) 
			{
				transpose[j][i]=matrix[i][j];
			}	
		}
		for(int[] i:transpose)
		{
			System.out.println(Arrays.toString(i));
		}	
	}

}

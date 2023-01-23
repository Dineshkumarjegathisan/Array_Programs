package Arrays;
// Add Element to the Array 
import java.util.Arrays;
import java.util.Scanner;
public class AddElemet 
{
	public static void isAdd(int arr[],int index,int element)
	{
		int empty[]=new int[arr.length+1];
		int k=0;
		for(int i=0;i<empty.length;i++)
		{
			if(i==index)
			{
				empty[i]=element;
			}
			else
			{
				empty[i]=arr[k++];
			}
		}
		System.out.println(Arrays.toString(empty));
	}
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		int arr[]= {9,8,7,6,5,4,3,2};
		System.out.println("Enter the index ");
		int index=sc1.nextInt();
		System.out.println("Enter the element");
		int element=sc1.nextInt();
		isAdd(arr, index, element);
	}
}

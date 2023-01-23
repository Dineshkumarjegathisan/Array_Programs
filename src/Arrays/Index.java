package Arrays;
//find the index to given element
public class Index
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7};
	    index(arr,8);

	}
	public static void index(int arr[],int index)
	{
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==index)
			{
				System.out.println(index+"prsent at index"+i);
				flag=false;
				break;				
			}			
		}
		if(flag)
		{
			System.out.println(index+" "+"is not present in array");
		}
	}

}

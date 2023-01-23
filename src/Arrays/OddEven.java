package Arrays;

public class OddEven
{
	
	public static void main(String[] args) 
	{
		int [] arr= {3,2,4,5,3,8,9,5,3,1,8,4,6};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				int Array=arr[i]-1;
				//System.out.println(arr);
				System.out.println("if it is OddNumber Add 1 of Array : "+Array);
			}
			else //if (arr[i]%2==0) 
			{
			    int Array =arr[i]+1;
				System.out.println("if it is EvenNumber sub 1 of Array :"+Array);
			}
		}
		
	}

}

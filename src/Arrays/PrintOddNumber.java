package Arrays;

public class PrintOddNumber 
{
	public static void main(String[] args) 
	{
		
	int [] arr= {12,8,7,5,9,5,1,2,22,23,47,48,51};
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("OddNumber :"+arr[i]);
			}
			else
			{
				System.out.println("EvenNumber : "+arr[i]);
				
			}
		}
	}
	
	
}

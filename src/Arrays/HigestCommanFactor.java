package Arrays;

public class HigestCommanFactor 
{
	public static int hcf(int m,int n) 
	{
		if(m<n)
		{
			hcf(n,m);
		}
		if(n==0)
		{
			return m;
		}
	
		return hcf(n,m % n);
	}

	public static void main(String[] args) 
	{
		int n=10;
		int m=522;
		System.out.println("The Higest Common Fcator is :"+hcf(m, n));
	}
}

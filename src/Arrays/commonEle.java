package Arrays;

import java.util.*;
//import java.util.HashSet;
//import java.util.Set;

public class commonEle 
{
	public static void FindCommonEle(int [] arr1,int[] arr2)
	{
		Set<Integer> set1= new HashSet<>();
		Set<Integer> set2= new HashSet<>();
		
		for(int i:arr1)
		{
			set1.add(i);
		}
		for(int i:arr2)
		{
			set2.add(i);
		}
		
		set1.retainAll(set2);

		System.out.println("coomon Ele"+set1);
		//System.out.println("coomon Ele"+set2);		
	}
	public static void main(String[] args)
	{
		int arr1[]= {1,4,9,16,25,64,81,100};
		int arr2[]= {100,9,64,7,36,5,16,3,4,1};
		//System.out.println("contains ARR1"+arr1);
		//System.out.println("contains ARR2"+arr2);
		//System.out.println("Arr1="+Arrays.toString(arr1));
		//System.out.println("Arr2="+Arrays.toString(arr2));
		FindCommonEle(arr1,arr2);
		
	}
	
}

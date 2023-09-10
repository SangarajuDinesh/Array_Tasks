package com.kn.Tasks;

public class SumOfArrayElementsWithNonStaticMethod 
{
	void sum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.print(sum);
	}
}

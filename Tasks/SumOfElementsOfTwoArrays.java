package com.kn.Tasks;

public class SumOfElementsOfTwoArrays 
{
	void sumOfArrayElements(int[] arr,int[] brr)
	{
		int sumofElements=0;
		int sum[]=new int[arr.length];
		System.out.print("Sum of Two Array Elements = ");
		for(int i=0;i<arr.length;i++)
		{
			sum[i]=arr[i]+brr[i];
			System.out.print(sum[i]+" ");
		}
		System.out.println();
		for(int i=1;i<arr.length;i++)
		{
			if(sum[i]%i==0)
			{
				System.out.println(sum[i]+" is even ");
			}
			else
			{
				System.out.println(sum[i]+" is odd ");
			}
		}
		for(int i=0;i<sum.length;i++)
		{
			sumofElements+=sum[i];
		}
		System.out.print("Sum of Resultant Array = "+sumofElements);
	}
	
}

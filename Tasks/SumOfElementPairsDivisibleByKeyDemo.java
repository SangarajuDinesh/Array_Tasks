package com.kn.Tasks;

public class SumOfElementPairsDivisibleByKeyDemo {

	public void sumOfElementPairsDivisibleByKey(int n, int k, int[] arr) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])%k==0)
				{
					System.out.println(arr[i]+" "+arr[j]+" = "+arr[i]+arr[j]);
					count++;
				}
			}
		}
		System.out.println(count/2);
	}

}

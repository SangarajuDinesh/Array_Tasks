package com.kn.Tasks;

public class CountEvenAndOddElmentsInAnArrayApp 
{
	void CountEvenAndOdd(int[] arr) 
	{
		int evenCount=0,oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount+=1;
			}
			else
			{
				oddCount+=1;
			}
		}
		System.out.println("Count of Even Numbers = "+evenCount);
		System.out.print("Count of Odd Numbers = "+oddCount);
	}
}

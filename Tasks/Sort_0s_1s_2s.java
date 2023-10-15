package com.kn.Practice;

public class Sort_0s_1s_2s 
{
	public static void main(String[] args) 
	{
		int arr[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

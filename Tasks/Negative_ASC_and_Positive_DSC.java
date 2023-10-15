package com.kn.Practice;

public class Negative_ASC_and_Positive_DSC 
{
	public static void main(String[] args) 
	{
		int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>0 && arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1-i;j++)
			{
				if(arr[j]>0)
				{
					if(arr[j]<arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}

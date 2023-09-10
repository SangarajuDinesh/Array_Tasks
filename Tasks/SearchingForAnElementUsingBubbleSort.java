package com.kn.Tasks;

public class SearchingForAnElementUsingBubbleSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {22,11,7,12,10};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		int ele=7;
		int low=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(low+high)/2;
			if(arr[mid]==ele)
			{
				break;
			}
			else if(ele<arr[mid])
			{
				high=mid-1;
			}
			else if(ele>arr[mid])
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.print("Element not found");
		}
		else
		{
			System.out.print("Element found");
		}
	}
}

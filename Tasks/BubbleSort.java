package com.kn.Tasks;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,1,5,4};
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
		System.out.print("Sorted Array = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int ele=5;
		int low=0;
		int high=arr.length-1;
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(low+high)/2;
			if(arr[mid]==ele)
			{
				pos=mid+1;
				break;
			}
			else if(ele>arr[mid]) 
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println();
		if(low>high)
		{
			System.out.print("Element not found");
		}
		else
		{
			System.out.print("Element is found at "+pos+" position");
		}
	}
}

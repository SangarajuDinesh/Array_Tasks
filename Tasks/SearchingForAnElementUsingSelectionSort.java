package com.kn.Tasks;

public class SearchingForAnElementUsingSelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {22,11,7,12,10};
		for(int i=0;i<arr.length;i++)//No.of Passes
		{
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++)//No.Of Comparisions
			{
				if(min>arr[j])
				{
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		System.out.print("Sorted array = ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		int ele=22;
		int low=0;
		int position=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length;i++) 
		{
			int mid=(low+high)/2;
			if(ele==arr[mid])
			{
				position=mid+1;
				break;
			}
			else if(ele>arr[mid])
			{
				low=mid+1;
			}
			else if(ele<arr[mid])
			{
				high=mid-1;
			}
		}
		System.out.println();
		if(low>high)
		{
			System.out.print(ele+" not found");
		}
		else
		{
			System.out.print(ele+" is found at "+position);
		}
	}
}

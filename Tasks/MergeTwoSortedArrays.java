package com.kn.Tasks;

import java.util.Scanner;

public class MergeTwoSortedArrays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an arrays = ");
		int arr[]=new int[sc.nextInt()];
		int brr[]=new int[arr.length];
		System.out.println("Data for 1st array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("data for "+i+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Data for 2nd Array");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("data for "+i+" index = ");
			brr[i]=sc.nextInt();
		}
		//sorting 1st array
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[i]>arr[i+1])
				{
					arr[i]=arr[i]+arr[i+1];
					arr[i+1]=arr[i]-arr[i+1];
					arr[i]=arr[i]-arr[i+1];
				}
			}
		}
		//sorting 2nd array
		for(int i=0;i<brr.length-1;i++)
		{
			for(int j=0;j<brr.length-1-i;j++)
			{
				if(brr[i]>brr[i+1])
				{
					brr[i]=brr[i]+brr[i+1];
					brr[i+1]=brr[i]-brr[i+1];
					brr[i]=brr[i]-brr[i+1];
				}
			}
		}
		merge(arr,brr);
		sc.close();
	}

	public static void merge(int[] arr, int[] brr) 
	{
		int merge[]=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++)
		{
			merge[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<merge.length;i++)
		{
			merge[i]=brr[j];
			j++;
		}
		for(int i=0;i<merge.length;i++)
		{
			System.out.print(merge[i]+" ");
		}
		
	}
}

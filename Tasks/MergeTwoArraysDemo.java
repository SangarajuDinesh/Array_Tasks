package com.kn.Tasks;

public class MergeTwoArraysDemo 
{
	int[] merge(int []arr,int brr[]) 
	{
		int res[]=new int[arr.length+brr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			res[k]=arr[i];
			k++;
		}
		int j=0;
		for(int i=arr.length;i<res.length;i++)
		{
			res[i]=brr[j];
			j++;
		}
		return res;
		
	}
}

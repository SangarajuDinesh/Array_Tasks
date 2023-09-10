package com.kn.Tasks;

public class MergingOfTwoArraysIntoAnArrayApp 
{
	void merge(int arr[],int brr[])
	{
		int[] crr=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++)
		{
			crr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<crr.length;i++)
		{
			crr[i]=brr[j];
			j++;
		}
		for(int i:crr)
		{
			System.out.print(i+" ");
		}
	}
}

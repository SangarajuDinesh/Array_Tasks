package com.kn.Tasks;

import java.util.Scanner;

public class MergeTwoArrays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int arr[]=new int[sc.nextInt()];
		int brr[]=new int[arr.length];
		System.out.println("Data for 1st Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the data for "+i+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Data for 2nd Array");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("Enter the data for "+i+" index = ");
			brr[i]=sc.nextInt();
		}
		MergeTwoArraysDemo cr=new MergeTwoArraysDemo();
		int[] crr=cr.merge(arr, brr);
		System.out.print("merged Array = ");
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+" ");
		}
		
	}
}

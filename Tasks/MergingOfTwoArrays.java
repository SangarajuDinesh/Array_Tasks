package com.kn.Tasks;

import java.util.Scanner;

public class MergingOfTwoArrays 
{
	public static void main(String[] args) 
	{
		//Declaration and Creation of an Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Two arrays ");
		int[] arr=new int[sc.nextInt()];
		int[] brr=new int[sc.nextInt()];
		//Initialization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter Data for 1st Array of "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("Enter Data for 2st Array of "+(i+1)+" index = ");
			brr[i]=sc.nextInt();
		}
		int[] res=mergeTwoArrays(arr,brr);
		System.out.print("First Array = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Second Array = ");
		for(int i:brr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Merged Array = ");
		for(int i:res)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}

	public static int[] mergeTwoArrays(int[] arr, int[] brr) 
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
		return crr;

	}
}

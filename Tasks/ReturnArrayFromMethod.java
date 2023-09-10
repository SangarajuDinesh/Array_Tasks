package com.kn.Tasks;

import java.util.Scanner;

public class ReturnArrayFromMethod 
{
	public static void main(String[] args) 
	{
		//Declaration and creation of Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		//initialization of an array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the data for "+i+" index = ");
			arr[i]=sc.nextInt();
		}
		int[] crr=returnArrayFromMethod(arr);
		System.out.print("Returned Array From Method = ");
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+" ");
		}
		sc.close();
	}

	public static int[] returnArrayFromMethod(int[] arr) 
	{
		int[] brr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
	}
}

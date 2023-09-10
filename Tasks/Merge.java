package com.kn.Tasks;

import java.util.Scanner;

public class Merge 
{
	public static void main(String[] args) 
	{
			//Declaration and creation of an array
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Size of an array = ");
			int arr[]=new int[sc.nextInt()];
			int brr[]=new int[arr.length];
			//Initialization of an Array
			System.out.println("data for 1st array");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("Enter the Data for "+i+" index = ");
				arr[i]=sc.nextInt();
			}
			System.out.println();
			System.out.println("data for 1st array");
			for(int i=0;i<brr.length;i++)
			{
				System.out.print("Enter the Data for "+i+" index = ");
				brr[i]=sc.nextInt();
			}
			int[] res=merge(arr,brr);
			System.out.print("Merged array = ");
			for(int i=0;i<res.length;i++)
			{
				System.out.print(res[i]+" ");
			}
			sc.close();
	}

	public static int[] merge(int[] arr, int[] brr) 
	{
		int[] merge=new int[arr.length+brr.length];
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
		return merge;
	}
}

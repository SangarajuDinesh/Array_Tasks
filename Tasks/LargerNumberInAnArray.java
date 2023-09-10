package com.kn.Tasks;

import java.util.Scanner;

public class LargerNumberInAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of array = ");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the data for "+i+" index = ");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.print("maximum value in an Array = "+max);
		sc.close();
	}
}

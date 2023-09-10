package com.kn.Tasks;

import java.util.Scanner;

public class AverageOfAnArray 
{
	public static void main(String[] args) 
	{
		//Declaration and creation of an array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an array = ");
		int arr[]=new int[sc.nextInt()];
		//Initialization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+i+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Average of an Array = "+averageofAnArray(arr));
		sc.close();
		
	}

	public static double averageofAnArray(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return (double)sum/arr.length;
	}
}

package com.kn.Tasks;

import java.util.Scanner;

public class DifferentWaysToPrintArray 
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
		//1st way to print an array
		System.out.print("1st way to Print an Array = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//2nd way to print an array
		System.out.print("2nd way to Print an Array = ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

		sc.close();
	}

}

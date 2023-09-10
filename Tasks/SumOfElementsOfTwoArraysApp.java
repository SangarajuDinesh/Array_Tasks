package com.kn.Tasks;

import java.util.Scanner;

public class SumOfElementsOfTwoArraysApp 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		int[] brr=new int[arr.length];
		//Initialization of Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for 1st Array of "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("Enter the Data for 2nd Array of "+(i+1)+" index = ");
			brr[i]=sc.nextInt();
		}
		SumOfElementsOfTwoArrays ref=new SumOfElementsOfTwoArrays();
		ref.sumOfArrayElements(arr,brr);
		sc.close();
	}
}

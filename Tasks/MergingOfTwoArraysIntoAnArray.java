package com.kn.Tasks;

import java.util.Scanner;

public class MergingOfTwoArraysIntoAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int []arr=new int[sc.nextInt()];
		int []brr=new int[arr.length];
		//Initialisation of an array
		System.out.println("Data for 1St Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i)+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Data for 2nd Array");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print("Enter the Data for "+(i)+" index = ");
			brr[i]=sc.nextInt();
		}
		MergingOfTwoArraysIntoAnArrayApp cr=new MergingOfTwoArraysIntoAnArrayApp();
		cr.merge(arr, brr);
		sc.close();
	}
}

package com.kn.Tasks;

import java.util.Scanner;

public class BackwardTraversingOfArrayElementsWithMethod 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		//Initialization of an array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter data for "+(i+1)+" index =");
			arr[i]=sc.nextInt();
		}
		int[] crr = backwardTraversingofArray(arr);
		System.out.print("Backward Traversed Array Elements = ");
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]+" ");
		}
		sc.close();
	}

	public static int[] backwardTraversingofArray(int[] arr) 
	{
		int[] brr=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			brr[i]=arr[i];
		}
		return brr;
	}
}

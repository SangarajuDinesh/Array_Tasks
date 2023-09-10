package com.kn.Tasks;

import java.util.Scanner;

public class CopyArrayToAnotherArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array = ");
		int[] arr=new int[sc.nextInt()
];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		
		//Traversing an Array with Another Array
		int[] crr=copyArray(arr);
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+" ");
		}
		sc.close();
		
	}

	public static int[] copyArray(int[] arr) 
	{
		int[] copy=new int[arr.length];
		System.out.print("Copied Array = ");
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		//returning an integer array 
		return copy;
		
	}
}

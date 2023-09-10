package com.kn.Tasks;

import java.util.Scanner;

public class CopyArrayWithMethod 
{
	public static void main(String[] args) 
	{
		//Creation of an Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the Array size = ");
		int[] arr=new int[sc.nextInt()];
		//Initialization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();	
		}
		int[] crr=copyArray(arr);
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+" ");
		}
		sc.close();

	}

	public static int[] copyArray(int[] arr)
	{
		int[] brr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
	}
}



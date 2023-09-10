package com.kn.Tasks;

import java.util.Scanner;

public class PrintEvenAndOddElementsFromAnArrayWithmethod 
{
	public static void main(String[] args) 
	{
		//Declaration and Creation of an Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		//Initialization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		int[] evenAndOdd=evenAndOddElementsFromAnArray(arr);
		for(int i=0;i<evenAndOdd.length;i++)
		{
			if(evenAndOdd[i]%2==0)
			{
				System.out.println("Even numbers = "+evenAndOdd[i]);
			}
			else
			{
				System.out.println("Odd Numbers = "+evenAndOdd[i]);
			}
		}
		sc.close();
		
	}

	public static int[] evenAndOddElementsFromAnArray(int[] arr) 
	{
		int[] brr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
	}
}

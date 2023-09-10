package com.kn.Tasks;

import java.util.Scanner;

public class SecondLargestElement 
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
		int secondMax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax)
			{
				secondMax=arr[i];
			}
		}	
		System.out.println("second max= "+secondMax);
		sc.close();
	}
}

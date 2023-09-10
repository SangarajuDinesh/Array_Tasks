package com.kn.Tasks;

import java.util.Scanner;

public class PrimeNumbersInAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Prime Numbers in an Array = ");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count+=1;
				}
			}
			if(count==2)
			{
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
}


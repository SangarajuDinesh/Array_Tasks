package com.kn.Tasks;

import java.util.Scanner;

public class PrintAnIntegerRepresentingKthSmallestStock 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		System.out.print(arr[ele-1]);
		sc.close();
		
	}
}

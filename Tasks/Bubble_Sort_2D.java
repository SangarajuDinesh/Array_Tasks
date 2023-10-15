package com.kn.Practice;

import java.util.Scanner;

public class Bubble_Sort_2D 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size = ");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				if(arr[i][j]>arr[i][j+1])
				{
					int temp=arr[i][j];
					arr[i][j]=arr[i][j+1];
					arr[i][j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		sc.close();
		
	}
}

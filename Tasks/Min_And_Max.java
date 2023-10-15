package com.kn.Practice;

import java.util.Scanner;

public class Min_And_Max
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[2][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int min=arr[0][0];
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
		sc.close();
	}
}

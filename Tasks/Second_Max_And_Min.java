package com.kn.Practice;

import java.util.Scanner;

public class Second_Max_And_Min 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size = ");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int min=arr[0][0];
		int sec_min=arr[0][0];
		int max=arr[0][0];
		int sec_max=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					sec_min=min;
					min=arr[i][j];
				}
				if(arr[i][j]<sec_min && min!=arr[i][j])
				{
					sec_min=arr[i][j];
				}
				if(arr[i][j]>max)
				{
					sec_max=max;
					max=arr[i][j];
				}
				if(arr[i][j]>sec_max && max!=arr[i][j])
				{
					sec_max=arr[i][j];
				}
			}
		}
		System.out.println(min);
		System.out.println(sec_min);
		System.out.println(max);
		System.out.println(sec_max);
		sc.close();
		
	}
}

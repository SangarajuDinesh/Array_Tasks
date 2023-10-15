package com.kn.Practice;

import java.util.Scanner;

public class Occurence_of_Integer_in_Array 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size = ");
		int n=sc.nextInt();
		System.out.print("Enter the number = ");
		int x=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}

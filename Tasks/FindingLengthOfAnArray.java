package com.kn.Tasks;

import java.util.Scanner;

public class FindingLengthOfAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+i+" index = ");
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=1;i<=arr.length;i++)
		{
			count++;
		}
		System.out.println("Length of an array = "+count);
		sc.close();
	}
}

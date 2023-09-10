package com.kn.Tasks;

import java.util.Scanner;

public class PrintRemaidersOfEachElementInAnArray 
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
		System.out.print("Remainders of Elements in an Array = ");
		int rem=0;
		for(int i=0;i<arr.length;i++)
		{
			rem=arr[i]%2;
			System.out.print(rem+" ");
		}
		sc.close();
	}
}

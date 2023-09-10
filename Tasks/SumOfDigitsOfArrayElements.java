package com.kn.Tasks;

import java.util.Scanner;

public class SumOfDigitsOfArrayElements 
{
	public static void main(String[] args) 
	{
		//Declaraion and Creation of an Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int []arr=new int[sc.nextInt()];
		//Initialization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i)+" index = ");
			arr[i]=sc.nextInt();
		}
		//Traversing an Array
		for(int i=0;i<arr.length;i++)
		{
			int rem=0;
			int sum=0;
			for(int j=0;j<=arr[i]+1;j++)
			{
				rem=arr[i]%10;
				sum=sum+rem;
				arr[i]=arr[i]/10;
			}
			System.out.print(sum+" ");
		}
		sc.close();
	}
}

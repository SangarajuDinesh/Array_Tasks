package com.kn.Tasks;

import java.util.Scanner;

public class SumOfArrayElements 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		//initializaton of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of array elements = "+sumOfArrayElements(arr));
		sc.close();
		
	}

	public static int sumOfArrayElements(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}

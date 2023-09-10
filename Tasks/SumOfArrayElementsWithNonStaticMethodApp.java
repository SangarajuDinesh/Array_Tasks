package com.kn.Tasks;

import java.util.Scanner;

public class SumOfArrayElementsWithNonStaticMethodApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		SumOfArrayElementsWithNonStaticMethod cr=new SumOfArrayElementsWithNonStaticMethod();
		cr.sum(arr);
		sc.close();
		
	}
}

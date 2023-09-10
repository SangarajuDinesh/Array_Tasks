package com.kn.Tasks;

import java.util.Scanner;

public class CheckingThePositionOfAnElementInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number = ");
		int num=sc.nextInt();
		findThePositionOfNumberInAnArray(arr,num);
		sc.close();
	}
	//10 20 30 40
	public static void findThePositionOfNumberInAnArray(int[] arr,int num) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println(num+" is found at "+(i+1)+" position");
				break;
			}
			else
			{
				System.out.println("Element not found");
			}
		}
	}
}

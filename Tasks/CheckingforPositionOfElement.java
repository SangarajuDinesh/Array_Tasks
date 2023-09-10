package com.kn.Tasks;

import java.util.Scanner;

public class CheckingforPositionOfElement 
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
		int pos=findThePositionOfNumberInAnArray(arr,num);
		System.out.println("Element is found at "+pos+" ");
		sc.close();
	}
	//10 20 30 40
	public static int findThePositionOfNumberInAnArray(int[] arr,int num) 
	{
		boolean isFound=false;
		int position=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				isFound=true;
				position=++i;
				break;
			}
		}
		if(isFound=true)
		{
			return position;
		}else
		{
			System.out.println("Element not found");
			return -1;
		}
	}
}

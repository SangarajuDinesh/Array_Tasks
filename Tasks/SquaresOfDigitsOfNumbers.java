package com.kn.Tasks;

import java.util.Scanner;

public class SquaresOfDigitsOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=1;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			if(num>=n)
			{
				while(num>0)
				{
					arr[i]=num%10;
					num/=10;
				}
			}
			else
			{
				arr[i]=0;
			}
			n*=10;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=(arr[i]*arr[i]);
		}
		System.out.print(sum);
		sc.close();
	}
}

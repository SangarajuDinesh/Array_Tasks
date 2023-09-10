package com.kn.Tasks;

import java.util.Scanner;

public class SumOfElementPairsDivisibleByKey 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		SumOfElementPairsDivisibleByKeyDemo sd=new SumOfElementPairsDivisibleByKeyDemo();
		sd.sumOfElementPairsDivisibleByKey(n,k,arr);
	}
}

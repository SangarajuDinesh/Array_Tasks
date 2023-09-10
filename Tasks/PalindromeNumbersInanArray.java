package com.kn.Tasks;

import java.util.Scanner;

public class PalindromeNumbersInanArray {
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
	System.out.print("Palindrome Numbers in an Array = ");
	for(int i=0;i<arr.length;i++)
	{
		int rem=0,sum=0;
		int temp=arr[i];
		for(int j=0;j<=arr[i]+1;j++)
		{
		rem=arr[i]%10;
		sum=sum*10+rem;
		arr[i]=arr[i]/10;
		}
		if(temp==sum)
		{
			System.out.print(sum+" ");
		}
		sc.close();
	}

}
}

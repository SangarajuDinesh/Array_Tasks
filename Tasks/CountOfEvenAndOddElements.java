package com.kn.Tasks;

import java.util.Scanner;

public class CountOfEvenAndOddElements 
{
	public static void main(String[] args) 
	{
		//Declaration and Creation of an Array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array = ");
		int[] arr=new int[sc.nextInt()];
		//Initialization of an Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Data for "+(i+1)+" index = ");
			arr[i]=sc.nextInt();
		}
		CountEvenAndOddElmentsInAnArrayApp crr=new CountEvenAndOddElmentsInAnArrayApp();
		crr.CountEvenAndOdd(arr);
		sc.close();
		
	}

}

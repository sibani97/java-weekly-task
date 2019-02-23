package com.bridgelabz.algorith;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionInteger {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the number as a size");
		int size=ut.singleIntrgerInput();
		int[] arr=new int[size]; 
		System.out.println("enter the number");
		//int numb=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter  Value :");
			arr[i]=ut.singleIntrgerInput();
			//System.out.println(arr[i]);

		}
		//insertionsort(arr);
		ut.insertionsort(arr);
		System.out.println("after insertion sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);

		}
	}
}

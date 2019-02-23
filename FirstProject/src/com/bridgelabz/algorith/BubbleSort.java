package com.bridgelabz.algorith;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut= new Utility();
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=ut.singleIntrgerInput();
		int arr[]=new int[size];
		//System.out.println("enter the number"); 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the value");
			arr[i]=ut.singleIntrgerInput();
		}
		
		System.out.println("--__-------");
		//bubblesort(arr);
		ut.bubblesort(arr);
		System.out.println("after bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);

	}
	}
}

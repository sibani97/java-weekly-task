package com.bridgelabz.algorith;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=ut.singleIntrgerInput();
		String arr[]=new String[size];
		System.out.println("enter the string");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter  Value :");
			arr[i]=ut.singleStringInput();
		

	}
		ut.insertionsort(arr);
		System.out.println("after insertion sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]+"  ");

		}
	}
}
